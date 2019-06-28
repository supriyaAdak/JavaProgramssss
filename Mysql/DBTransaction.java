	package Mysql;

import java.sql.*;

public class DBTransaction {

	
	 private static String insert = "INSERT INTO mySqlData.Departments (Id, DepartmentName) VALUES (?, ?)";
	  public static void insertRow(Connection conn, int idRow, String contentRow)
	            throws SQLException {
	        PreparedStatement pstmt = null;
	        pstmt = conn.prepareStatement(insert);
	        pstmt.setInt(1, idRow);
	        pstmt.setString(2, contentRow);
	        pstmt.execute();
	        pstmt.close();
	    }
	  public static void main(String[] args) throws SQLException {
	        Connection connection = null;
	        Savepoint savepoint = null;
	        connection = DBConnection.getConnection("mySqlData","root","root");
	        try {
	            connection.setAutoCommit(false);
	            System.err.println("The autocommit was disabled!");
	        } catch (SQLException e) {
	            System.err.println("There was an error disabling autocommit");
	        }
	        // Starts JDBC Transaction
	        try {
	        	
	        	
	            insertRow(connection,18, "pi");
	            insertRow(connection,19 ,"si");
	            savepoint = connection.setSavepoint();
	            insertRow(connection, 20, "sa");
	            connection.rollback(savepoint);
	            connection.commit();
	            System.err.println("The transaction was successfully executed");
}catch (SQLException e) {
    try {
        // We rollback the transaction, to the last SavePoint!
        connection.rollback();
        System.out.println("rollback");
        System.err.println(e.getMessage());
        System.err
                .println("The transaction was rollback to the last savepoint");
    } catch (SQLException e1) {
        System.err.println("There was an error making a rollback");
    }
}
	  }
}
