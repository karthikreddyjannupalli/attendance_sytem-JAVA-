package datart;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Studentdget {
	ConnectorMysql con;
	String date;
	String query;
	String s1;
	String s2;
	ResultSet res1;
	ResultSet res2;
	String req;
	String rollno;
	public Studentdget(String rollno,String s1,String s2) throws Exception
	{
		this.rollno=rollno;
		con=new ConnectorMysql();
		this.s1=s1;
		this.s2=s2;
	}
	
	public String getdetails(String date) throws SQLException
	{
		res1=con.sta.executeQuery("select "+s1+" from D"+date+" where rollno="+"'"+rollno+"'");
		res2=con.sta.executeQuery("select "+s2+" from D"+date+" where rollno="+"'"+rollno+"'");
		req=res1.next()+" "+res2.next();
		return req;
	}
}
