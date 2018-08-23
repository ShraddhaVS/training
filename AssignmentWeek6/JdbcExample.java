package week6;

import java.sql.*;
public class JdbcExample  {
	public static void main(String[] args) throws Exception {
		
	String url="jdbc:mysql://localhost:3306/mydatabase";
			
	String uname="root";
	String pass="root";
	String query="select * from student";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection(url, uname, pass);
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
	String userdata=rs.getInt(1)+":"+rs.getString(2);
	System.out.println(userdata);
	}
	st.close();
	con.close();
}
}