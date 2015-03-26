

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ojp.Student;

/**
 * Servlet implementation class s_registration
 */
@WebServlet("/s_registration")
public class s_registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s_registration() {
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
		
		String first=request.getParameter("first");
		String middle=request.getParameter("middle");
		String last=request.getParameter("last");
		String user=request.getParameter("user");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String Studentid=request.getParameter("Studentid");
		Student s=new Student();
		s.setFirst(first);
		s.setMiddle(middle);
		s.setLast(last);
		s.setUser(user);
		s.setEmail(email);
		s.setPassword(password);
		s.setStudentid(Studentid);
		
		try {
			boolean b=Student.Registration(s);
			
			if(b)
			{	
				response.sendRedirect("login.html");
			}
			else
			{
				
				response.sendRedirect("f_signup.html");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
