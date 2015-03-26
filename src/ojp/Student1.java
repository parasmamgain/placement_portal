package ojp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student1 {
	static Student1 s=null;
	private String Studentid;
	public String getStudentid() {
		return Studentid;
	}
	public void setStudentid(String Studentid) {
		this.Studentid = Studentid;
	}
	/*personal details setter---getter*/
	private String gender;
	private String mobile;
	private String nationality;
	private String currentloc;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCurrentloc() {
		return currentloc;
	}
	public void setCurrentloc(String currentloc) {
		this.currentloc = currentloc;
	}
	/*resume details-----getter and setter--*/
	private String tenth;
	private String twelfth;
	private String graduation;
	private String resume;
	public String getTenth() {
		return tenth;
	}
	public void setTenth(String tenth) {
		this.tenth = tenth;
	}
	public String getTwelfth() {
		return twelfth;
	}
	public void setTwelfth(String twelfth) {
		this.twelfth = twelfth;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
/*professional details---getter and setter*/	
	private String stream;
	private String jobtype;
	private String skill;
	private String currentProfile;
	private String batch;
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCurrentProfile() {
		return currentProfile;
	}
	public void setCurrentProfile(String currentProfile) {
		this.currentProfile = currentProfile;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public static boolean PersonalInfo(Student1 s) throws Exception
	{	String user="root",pass="root";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
		PreparedStatement pt= con.prepareStatement("update personaldetails set nationality=?,current_location=?,mobile=?,gender=? where jsid=?");
		pt.setString(4, s.getGender());
		pt.setString(3, s.getMobile());
		pt.setString(1, s.getNationality());
		pt.setString(2, s.getCurrentloc());
		pt.setString(5, s.getStudentid());
		int a=pt.executeUpdate();
		pt.close();con.close();
		if(a!=0)
		{		
			return true;
		}			
		else{return false;
		}
	}
	
 public static boolean ProfessionalInfo(Student1 s)throws Exception
 { 
	String user="root",pass="root";
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
	PreparedStatement pt= con.prepareStatement("update PROFESSIONALDETAILS set STREAM=? , JOBTYPE=? , SKILLS=? ,CURRENTPROFILE=? , BATCH=? where JSID=?");
	pt.setString(1, s.getStream());
	pt.setString(2, s.getJobtype());
	pt.setString(3, s.getSkill());
	pt.setString(4, s.getCurrentProfile());
	pt.setString(5, s.getBatch());
	pt.setString(6, s.getStudentid());
	int a=pt.executeUpdate();
	pt.close();con.close();
	if(a!=0)
	{	
		return true;
	}		
	else
	{return false;
	}
 }
 public static boolean Resume(Student1 s) throws Exception
	{
	 String user="root",pass="root";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
		PreparedStatement pt= con.prepareStatement("update RESUME set tenth=?,twelth=?,graduation=? where jsid=?");
		pt.setString(1, s.getTenth());
		pt.setString(2, s.getTwelfth());
		pt.setString(3, s.getGraduation());
		//pt.setString(1, s.getResume());
		pt.setString(4, s.getStudentid());
		
		int a=pt.executeUpdate();
		pt.close();con.close();
		if(a!=0)
		{			
			return true;
		}
			
		else
		{return false;
		}
	}
 }

