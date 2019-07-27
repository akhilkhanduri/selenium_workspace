package database.connection.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//TODO Auto-generated method stub	
		String dburl = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String Password = "root";
		String query = "select * from cus;";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(dburl,username,Password);
		
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		
		while (rs.next()){
			String Name = rs.getString(1);
			String Address = rs.getString(2);
			String Age = rs.getString(3);
			System.out.println(Name+" "+Address+" "+Age);	
		}
	}
	

	}
