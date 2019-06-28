package Mysql;

import java.sql.*;

public class BatchProcessing {
	public static void main(String args[])throws Exception{  
		Class.forName("com.mysql.jdbc.Driver");  
		 Connection con = DBConnection.getConnection("mySqlData","root","root");
		 
		con.setAutoCommit(false);  
		
		  
		Statement stmt=con.createStatement();  
		stmt.addBatch("insert into Departments (Id,DepartmentName)values(60,'java')"); 
		stmt.addBatch("insert into Departments (Id,DepartmentName)values(61,'python')");  
		stmt.addBatch("insert into Departments (Id,DepartmentName)values(62,'dotnet')");  
	
		stmt.executeBatch();//executing the batch  
		
		int[] count = stmt.executeBatch();
		 System.out.println("data inserted"+count); 
		con.commit();  
		con.close();  
}
}