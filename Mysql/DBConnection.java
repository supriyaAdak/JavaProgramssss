package Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {
	
	private static String jdbcDriver = "com.mySql.jdbc.Driver";
	 private static String URL = "jdbc:mysql://localhost:3306/mySqlData";
	    private static String USER = "root";
	    private static String PASSWORD = "root";

	    public static Connection getConnection(String db_name,String user_name,String password)
	    { 
	    	
	        Connection con=null;
	        try
	        {
	        Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name+"?user="+user_name+"&password="+password);
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        return con;        
	    }
}