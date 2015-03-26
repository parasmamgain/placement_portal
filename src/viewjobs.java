

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class viewjobs
 */
@WebServlet("/viewjobs")
public class viewjobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewjobs() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=null,password=null;
		Connection conn = null;
	    ResultSet rs	= null;
	    
		username=request.getParameter("username");
		password=request.getParameter("password");
		String choice=request.getParameter("category");
		String user = "root";
        String pass = "root";
        Connection con = null;
        String query="select * from postjobs";
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
	        	response.setContentType("text/html");
	        	PrintWriter out=response.getWriter();
	        	String title="list of all jobs posted";
	        	
	        	String docType=
	        			"<!doctype html public \"-//w3c//dtd html 4.0 "+
	        					"transitional//en\">\n";
	        					out.println(docType +
	        					"<html>\n"+
	        					"<head>"+"<link rel='stylesheet' type='text/css' href='file1.css'/>"
	        					+ "<title>"+ title +"</title></head>\n"+
	        					"<body bgcolor=\"#f0f0f0\">\n"+
	        					"<h1 align=\"center\">"+ title +"</h1>\n");
	        						
	        			        PreparedStatement st = con.prepareStatement(query);
	        			        
	        			        rs=st.executeQuery();
	        			        
	        			        while(rs.next()){
	        					//Retrieve by column name
	        					String cname = rs.getString(1);
	        					int totalposts = rs.getInt(2);
	        					String description = rs.getString(5);
	        					int batch= rs.getInt(6);
	        					String stream=rs.getString(7);
	        					//Display values
	        					
	        					out.print("Cname: "+ cname +"<br>");
	        					out.print(", Totalposts: "+ totalposts +"<br>");
	        					out.print(", Description: "+ description +"<br>");
	        					out.print(", Batcht: "+batch+"<br>");
	        					out.print(", Stream: "+stream+"<br>");
	        					out.println();
	        					}
	        					out.println("</body></html>");
	        					// Clean-up environment
		}
	        					catch(Exception e){System.out.println(e);}
	        					
	        					
	        					

	        			
	        
		
	}
}
