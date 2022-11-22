package mysql.erd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class ShoppingDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	ShoppingDao() {
		try {
			InputStream is = new FileInputStream("/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Set<Cart> getCartsByOid(int oid) {
		Connection conn = myGetConnection();
		String sql = "SELECT c.oid, c.pid, c.quantity, p.pname, p.price FROM cart AS c"
				+ "	JOIN products AS p ON c.pid=p.pid"
				+ "	WHERE c.oid=?;";
		Set<Cart> set = new HashSet<>();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, oid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Cart c = new Cart();
				c.setOid(rs.getInt(1));
				c.setPid(rs.getInt(2));
				c.setQuantity(rs.getInt(3));
				c.setPname(rs.getString(4));
				c.setPrice(rs.getInt(5));
				set.add(c);
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return set;
	}
	
	public Order getOrder(int oid) {
		Set<Cart> set = getCartsByOid(oid);
		int totalPrice = 0;
		for (Cart c: set)
			totalPrice += c.getPrice() * c.getQuantity();
		
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM orders WHERE oid=?;";
		Order o = new Order();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, oid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				o.setOid(rs.getInt(1));
				o.setOrderDate(LocalDateTime.parse(rs.getString(2).replace(" ", "T")));
				o.setTotalPrice(totalPrice);
				o.setUid(rs.getString(4));
				o.setCartSet(set);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return o;
	}
}