package week6;

import java.sql.*;

public class UpdateResultSet {
	public static void main(String[] args)  throws SQLException, ClassNotFoundException {

	    Statement stmt = null;
	    try {
	    	String url="jdbc:mysql://localhost:3306/mydatabase";
	    	String uname="root";
	    	String pass="root";
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con= DriverManager.getConnection(url, uname, pass);
	        stmt = con.createStatement();
	        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	                   ResultSet.CONCUR_UPDATABLE);
	        ResultSet uprs = stmt.executeQuery(
	            "SELECT * FROM student");

	        while (uprs.next()) {
	            float f = uprs.getFloat("PRICE");
	            uprs.updateFloat( "PRICE", f * 5);
	            uprs.updateRow();
	        }

	    
	    } finally {
	        if (stmt != null) { stmt.close(); }
	    }
	}
}
