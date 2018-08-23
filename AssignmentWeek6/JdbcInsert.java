package week6;

import java.sql.*;


public class JdbcInsert {
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/mydata";
		String uname="root";
		String pass="root";
		String name="hello";
		String query="insert into student values(1,\"hello\")";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, uname, pass);
		Statement st =con.createStatement();
		int count =st.executeUpdate(query);
		System.out.println(count+"rows/s affected");
		
	
	/*	int userid=2;
		 name="hi";
		query="intsert into student values (?,?)";
		PreparedStatement st1 =con.prepareStatement(query);
		st1.setInt(1, userid);
		st1.setString(2, name);
		count =st1.executeUpdate(); */
		
		st.close();
		con.close();
}
}