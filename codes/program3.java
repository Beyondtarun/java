import java.sql.*;

class program3{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/bank";
		String username = "root"; 
		String password = "";
		String query = "select *from students";
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
			con.close(); // close connection
		System.out.println("Connection Closed....");
	}
}
