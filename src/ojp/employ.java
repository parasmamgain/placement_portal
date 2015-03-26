package ojp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class employ {
	static employ e=null;
	private String first;
	private String middle;
	private String last;
	private String user;
	private String email;
	private String password;
	private String eid;
	private String cname;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public static boolean e_Registration(employ e) throws Exception {
		String user="root",pass="root";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
		PreparedStatement pt= con.prepareStatement("insert into e_signup values(?,?,?,?,?,?,?,?)");
		pt.setString(2, e.getFirst());
		pt.setString(3, e.getMiddle());
		pt.setString(4, e.getLast());
		pt.setString(5, e.getCname());
		pt.setString(6, e.getUser());
		pt.setString(1, e.getEmail());
		pt.setString(7, e.getPassword());
		pt.setString(8, e.getEid());
		int a=pt.executeUpdate();
		if(a!=0)
		{			
			return true;
		}
		else
		{return false;
		}
		
	}
	
	

}
