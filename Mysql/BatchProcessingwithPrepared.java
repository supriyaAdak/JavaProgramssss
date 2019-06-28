package Mysql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class BatchProcessingwithPrepared {
	public static void main(String args[]){  
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			
			 Connection con = DBConnection.getConnection("mySqlData","root","root");
		
		  
		PreparedStatement ps=con.prepareStatement("insert into Departments values(?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter Departmentname");  
		String name=br.readLine();  
		  
		  
		  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		
		  
		ps.addBatch();  
		System.out.println("Want to add more records y/n");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		ps.executeBatch();  
		  
		System.out.println("record successfully saved");  
		  
		con.close();  
		}catch(Exception e){System.out.println(e);}  
		  

}
}
