package mysql.bbs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.mindrot.jbcrypt.BCrypt;

public class UsersDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	UsersDao() {
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
	
	public Users getUserInfo(String uid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM users WHERE uid=?;";
		Users u = new Users();
		PreparedStatement pStmt;
		try {
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, uid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				u.setUid(rs.getString(1));
				u.setPwd(rs.getString(2));
				u.setUname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setRegDate(LocalDate.parse(rs.getString(5)));
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}
	
	public List<Users> listUsers() {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM users ORDER BY regDate, uid;";
		List<Users> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Users u = new Users();
				u.setUid(rs.getString(1));
				u.setPwd(rs.getString(2));
				u.setUname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setRegDate(LocalDate.parse(rs.getString(5)));
				list.add(u);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void registerUser(Users u) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO users VALUES (?, ?, ?, ?, DEFAULT);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, u.getUid());
			String cryptedPwd = BCrypt.hashpw(u.getPwd(), BCrypt.gensalt());
			pStmt.setString(2, cryptedPwd);
			pStmt.setString(3, u.getUname());
			pStmt.setString(4, u.getEmail());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}