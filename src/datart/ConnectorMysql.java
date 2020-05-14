package datart;

import java.sql.*;

public class ConnectorMysql{
	String url="jdbc:mysql://localhost:3306/vasavi";
	String uname="root";
	String pass="MYSQL-DATA-BASE-PASSWORD";
	Connection con;
	Statement sta;
	public ConnectorMysql() throws Exception
	{	
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection(this.url,this.uname,this.pass);
		sta=con.createStatement();
	}
}
