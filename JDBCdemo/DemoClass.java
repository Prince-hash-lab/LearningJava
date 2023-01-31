import java.sql.*;

public class DemoClass {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/org";
		String uname="root";
		String pass="root";
		String query="select * from table1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		System.out.println(con);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		String userData="";
		while(rs.next())
		{
			userData=rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(userData);
		}


		st.close();
		con.close();
	}
}
