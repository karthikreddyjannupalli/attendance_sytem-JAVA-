package datart;

public class CreateTable {
	ConnectorMysql con;
	String date;
	String query ;
	String s1;
	String s2;
	public CreateTable(String date,String s1,String s2) throws Exception
	{
		con=new ConnectorMysql();
		this.date=date;
		query="create table D"+date+" ("+" rollno varchar(16) primary key,"+s1+" boolean default null,"+s2+" boolean default null "+")";
		System.out.println(query);
		con.sta.execute(query);
	}

}
