package datart;
import java.util.*;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
public class AttandancePoster {
	
	int rs;
	Date dt = new Date();
	String query;
	String fname;
	String end=" where rollno=";
	SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
	public AttandancePoster(String fname,String date)
		{	
		this.fname=fname;
		query="update D"+date+" set "+fname+" = ";
		}
	public void post(String rno,boolean b) throws Exception
	{
		
		ConnectorMysql cm=new ConnectorMysql();
		end=end+"'"+rno+"'";
		
		System.out.println(query+b+end);
		rs=cm.sta.executeUpdate(query+b+end);
		end=" where rollno=";
		
	}
}