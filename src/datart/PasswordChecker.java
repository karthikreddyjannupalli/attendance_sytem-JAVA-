package datart;
import java.sql.*;
public class PasswordChecker {
	public String name;
	String rollno;
	String pass;
	ResultSet rs;
	String query;
	public PasswordChecker(String rollno,String pass)
	{
		this.rollno=rollno;
		this.pass=pass;
		query="select * from student where rollno="+"'"+rollno+"'";
	}
	public boolean check() throws Exception
	{
		ConnectorMysql cm=new ConnectorMysql();
		rs=cm.sta.executeQuery(query);
		rs.next();
		name=rs.getString("studentname");
		String y=rs.getString("PASSWORD");
		if(y.equals(pass))
		{
			return true; 
		}
		else
		return false;
	}
	
}
