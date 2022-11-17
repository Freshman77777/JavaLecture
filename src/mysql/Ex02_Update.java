package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02_Update {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/world", 
			        "mcuser", "mcpass");
			String sql = "UPDATE koreanCity SET Name=? WHERE ID=?;";
			String city = "����";
			int id = 2331;
			
			// MySQL�� update �ϱ� ���� �غ�
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, city);
			pStmt.setInt(2, id);
			
			// Update ����
			pStmt.executeUpdate();
			pStmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
