import java.util.*;
import java.sql.*;
class Sample
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/emp";
			String username="root";
			String password="system";
			Connection con=DriverManager.getConnection(url,username,password);
			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else{
				System.out.println("Connection is created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}