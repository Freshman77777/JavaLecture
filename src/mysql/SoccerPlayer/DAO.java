package mysql.SoccerPlayer;

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

import mysql.customer.Customer;

/**
 * DAO(Data Access Object)
 */
public class DAO {
	private String host;
	private String user;
	private String password;
	private String port;
	private String database;
	
	DAO() {
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
	
	public void deletePlayer(int backNumber) {
		Connection conn = myGetConnection();
		String sql = "UPDATE customer SET isDeleted=0 WHERE uid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNumber);
			
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
	public void updatePlayer(Player p) {
		Connection conn = myGetConnection();
		String sql = "UPDATE player SET name=?, positon=?, birDate=?, height=? , isDeleted=? WHERE backNumber=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, p.getName());
			pStmt.setString(2, p.getPosition().toString());
			pStmt.setString(3, p.getBirDate().toString());
			pStmt.setInt(4, p.getHeight());
			pStmt.setInt(5, p.getIsDeleted()); 	
			pStmt.setInt(6, p.getBackNumber()); 	
			
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Player getPlayer(int backNumber) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM Player WHERE backNumber=?;";
		Player p = new Player();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNumber);
			
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				p.setBackNumber(rs.getBackNumber(1)); 
				p.setName(rs.getName(2));
				p.setPosition(rs.getPosition.toString(3));
				p.setBirDate(rs.getBirDate().toString(4));
				p.setHeight(rs.getHeight(5));
				p.setIsDeleted(rs.getIsDeleted(6)); 	
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public List<Player> getPlayers() {
		Connection conn = myGetConnection();
		List<Player> list = new ArrayList<>();
		String sql = "SELECT * FROM player WHERE isDeleted=0;";
		try {
			Statement stmt = conn.createStatement();
			
			// Select ½ÇÇà
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Player p= new Player();
				p.setBackNumber(rs.getBackNumber(1)); 
				p.setName(rs.getName(2));
				p.setPosition(rs.getPosition.toString(3));
				p.setBirDate(rs.getBirDate().toString(4));
				p.setHeight(rs.getHeight(5));
				p.setIsDeleted(rs.getIsDeleted(6)); 
				list.add(p);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	public void insertPlayer(Player p) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO player VALUES(?, ?, ?, ?, ?, DEFAULT);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, p.getBackNumber());
			pStmt.setString(2, p.getName());
			pStmt.setString(3, p.getPosition().toString());
			pStmt.setString(4, p.getBirDate().toString());
			pStmt.setInt(5, p.getHeight());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	}
		
	}
