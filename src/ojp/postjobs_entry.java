package ojp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class postjobs_entry {
	String cname;
	int totalposts;
	int batch;
	String experience;
	String post;
	String description;
	String stream;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getTotalposts() {
		return totalposts;
	}
	public void setTotalposts(int totalposts) {
		this.totalposts = totalposts;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public static boolean pj_postjobs(postjobs_entry pj) throws Exception {
		String user="root",pass="root";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
		PreparedStatement pt= con.prepareStatement("insert into postjobs values(?,?,?,?,?,?,?)");
		pt.setString(1, pj.getCname());
		pt.setInt(2, pj.getTotalposts());
		pt.setInt(6, pj.getBatch());
		pt.setString(7, pj.getStream());
		pt.setString(4, pj.getPost());
		pt.setString(5, pj.getDescription());
		pt.setString(3, pj.getExperience());
		
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
