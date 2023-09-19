package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
    	Connection c = null ;  
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/newservlet12month2018" ; 
			String username = "root" ; 
			String password ="" ; 
			c = DriverManager.getConnection(url, username, password) ; 
	    	return c; 
		
		} catch (Exception e) {
			return null ; 
		}
    }
    public static void disConnection(Connection c) {
    	if (c!=null) {
    		try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
    	}
    }
}
