package ojp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Student {
	static Student s1=null;
	private String first;
	private String middle;
	private String last;
	private String user;
	private String email;
	private String password;
	private String Studentid;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}

		public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public static boolean Registration(Student s) throws Exception
	{
		String user="root",pass="root";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
		PreparedStatement pt= con.prepareStatement("insert into f_signup values(?,?,?,?,?,?,?)");
		pt.setString(2, s.getFirst());
		pt.setString(3, s.getMiddle());
		pt.setString(4, s.getLast());
		pt.setString(5, s.getUser());
		pt.setString(1, s.getEmail());
		pt.setString(6, s.getPassword());
		pt.setString(7, s.getStudentid());
		int a=pt.executeUpdate();
		PreparedStatement pt1= con.prepareStatement("insert into personaldetails (jsid) values(?)");
		pt1.setString(1, s.getStudentid());
		int b=pt1.executeUpdate();
		PreparedStatement pt2= con.prepareStatement("insert into professionaldetails (jsid) values (?)");
		pt2.setString(1, s.getStudentid());
		int c=pt2.executeUpdate();
		PreparedStatement pt3= con.prepareStatement("insert into resume (jsid,resumeno) values (?,?)");
		pt3.setString(1, s.getStudentid());
		String resumeno="re"+s.getStudentid();
		pt3.setString(2,resumeno);
		int d=pt3.executeUpdate();
		pt3.close();pt2.close();pt1.close();pt.close();con.close();
		if(a!=0 && b!=0 && c!=0 && d!=0)
		{	
			return true;
		}
		else
		{return false;
		}
	}
public String getMiddle() {
	return middle;
}
public void setMiddle(String middle) {
	this.middle = middle;
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
public String getStudentid() {
	return Studentid;
}
public void setStudentid(String Studentid) {
	this.Studentid = Studentid;
}
}

