package g10.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static Connection conn;
public static Connection getConnection(){
	if(conn == null) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/g10","root","kavishka");
		} catch (SQLException |ClassNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	return conn;
	
	
}
}
