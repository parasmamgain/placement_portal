

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try{
			HttpSession session=request.getSession(true);
			Class.forName("oracle.jdbc.OracleDriver");
	        	String query=null;
	        	PreparedStatement st=null;
	        	String username1=null,password=null;
	        	String username,mname,fname,lname,email,jsid;
			Connection conn = null;
		    ResultSet rs	= null,rs1=null,rs2=null,rs3=null;
			username1=request.getParameter("username");
			password=request.getParameter("password");
			String choice=request.getParameter("category");
			String user = "root";
	        String pass = "root";
	        if(choice.equals("student")){
	        conn = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
	          query="select * from f_signup where EMAIL=? and PASSWORD=?";
	          String query_personal="select * from personaldetails where JSID=?";
	          String query_professional="select * from professionaldetails where JSID=?";
	          String query_resume="select * from resume where JSID=?";
	          
	          st = conn.prepareStatement(query);
	            st.setString(1,username1);
	            st.setString(2,password);
	            rs=st.executeQuery();
	            
	            if(rs.next()){	            
	            	fname=rs.getString("fname");username=rs.getString("username");lname=rs.getString("lname");
	            	mname=rs.getString("mname");jsid=rs.getString("jsid");email=rs.getString("email");
	            session.setAttribute("fname",fname);
	            session.setAttribute("username",username);
	            session.setAttribute("mname",mname);
            	session.setAttribute("jsid",jsid);
            	session.setAttribute("lname",lname);
            	session.setAttribute("email",email);
            	           	rs.close();st.close();
	            				PreparedStatement st1 = conn.prepareStatement(query_personal);
				            	st1.setString(1,jsid);
				            	rs1=st1.executeQuery();
				            	if(rs1.next()){																					//personal details
				            		
				        			session.setAttribute("nationality",(String)rs1.getString(1));
				        			session.setAttribute("current_location",(String)rs1.getString(2));
				        			session.setAttribute("mobile",(String)rs1.getString(3));
				        			session.setAttribute("gender",(String)rs1.getString(4));
				        			rs1.close();st1.close();
				        			
				        						PreparedStatement st2 = conn.prepareStatement(query_professional);
								            	st2.setString(1,jsid);
								            	rs2=st2.executeQuery();
												if(rs2.next()){																//	professional details
													session.setAttribute("skill",(String)rs2.getString(5));
									            	session.setAttribute("jobtype",(String)rs2.getString(2));
									            	session.setAttribute("stream",(String)rs2.getString(6));
									            	session.setAttribute("batch",(String)rs2.getString(3));		
									            	session.setAttribute("currentprofile",(String)rs2.getString(4));
									            	rs2.close();st2.close();
									            			PreparedStatement st3 = conn.prepareStatement(query_resume);
												            	st3.setString(1,jsid);
												            	rs3=st3.executeQuery();
																if(rs3.next()){					//resume details			
																	session.setAttribute("tenth",(String)rs3.getString(3));	      
													            	session.setAttribute("twelfth",(String)rs3.getString(4));
													            	session.setAttribute("graduation",(String)rs3.getString(5));
													            	rs3.close();st3.close();conn.close();
													            	response.sendRedirect("candidate_home.jsp");
																}conn.close();response.sendRedirect("resume_enter.jsp");
												}conn.close();response.sendRedirect("professional.jsp");
				            	}conn.close();response.sendRedirect("personal.jsp");
	            }
				
	            else{conn.close();
	            	response.sendRedirect("login.html");
	            	}
	        }
	        else if(choice.equals("employer"))
	        {
	        	conn = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
	            query="select * from e_signup where EMAIL=? and PASSWORD=?";
	            st = conn.prepareStatement(query);
	            st.setString(1,username1);
	            st.setString(2,password);
	            rs=st.executeQuery();
	            if(rs.next()){
	            	HttpSession session1=request.getSession();
	            	session1.setAttribute("cname",rs.getString(5));
	            	session1.setAttribute("username",rs.getString(6));
	            	rs.close();st.close();conn.close();
	            	response.sendRedirect("employer_home.jsp");
	            	}
	            else{
	            	response.sendRedirect("login.html");
	            	}
	        
	        }
			}       
	        catch(Exception e){System.out.println(e);}
	
	}

}
