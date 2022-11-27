package db_과제2_이동제;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public static void main(String[] args) {
		EmployeeDao dao= new EmployeeDao();
		
		dao.createTable();       //erm이 아닌 Init
		
		dao.insertEmployee(new Employee(133, "강자바", "부장", LocalDate.of(2000, 8, 1)));
		dao.insertEmployee(new Employee(143, "은전기", "차장", LocalDate.of(2003, 1, 1)));
		dao.insertEmployee(new Employee(163, "노전자", "과장", LocalDate.of(2018, 8, 1)));
		dao.insertEmployee(new Employee(173, "권표준", "대리", LocalDate.of(2022, 1, 1)));
		dao.insertEmployee(new Employee(213, "홍정부", "사원", LocalDate.of(2019, 1, 1)));
		
		dao.printAllEmployee();
	}
	
	EmployeeDao () {
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

	public void createTable() {                    //실습1의 필드를 저장하는 테이블(employee)을 생성하되 다음의 메소드 만들기
		Connection conn = myGetConnection();       // 위의 테이블이 생성되도록 코드를 작성
		String sql = "CREATE TABLE IF NOT EXISTS employee(\n"
					 + "id INT PRIMARY KEY, \n"
					 + "name VARCHAR(4) NOT NULL,\n"
					 + "position VARCHAR(4) NOT NULL,\n"
				     + "joinDate DATETIME\n"
				     + ");";		
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertEmployee(Employee emp) {         // 1.2에서 처음에 입력했던 5명을 다음의 메소드를 만들어 DB에 넣기
		Connection conn = myGetConnection();		   // 실습 1에서 HashSet에 입력했던 데이터가 테이블에 insert 되도록 코드를 작성
		String sql = "INSERT INTO employee VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, emp.getId());
			pStmt.setString(2, emp.getName());
			pStmt.setString(3, emp.getPosition());
			pStmt.setString(4, emp.getJoinDate().toString());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void printAllEmployee() {             // 2.2에서 입력한 레코드를 조회하는 메소드를 만들어서 출력
		Connection conn = myGetConnection();     // 종업원 데이터가 입사일자의 오름차순으로 정렬되어 출력하세요.
		List<Employee> list = new ArrayList<>();
		String sql = "SELECT id, name, position, DATE_FORMAT(joinDate, '%Y %m %d') "
					+ "AS joinDate FROM employee ORDER BY joinDate;";
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPosition(rs.getString(3));
				emp.setJoinDate(LocalDate.parse(rs.getString(4)));
				list.add(emp);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(Employee emp:list)
			System.out.println(emp);
	}
}