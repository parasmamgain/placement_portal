

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ojp.employ;

/**
 * Servlet implementation class e_registration
 */
@WebServlet("/e_registration")
public class e_registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public e_registration() {
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
		String cname=request.getParameter("cname");
		String password=request.getParameter("password");
		String eid=request.getParameter("eid");
		employ e=new employ();
		e.setFirst(first);
		e.setMiddle(middle);
		e.setLast(last);
		e.setCname(cname);
		e.setUser(user);
		e.setEmail(email);
		e.setPassword(password);
		e.setEid(eid);
		
		try {
			boolean b=employ.e_Registration(e);
			if(b)
			{
				
			getServletContext().getRequestDispatcher("/employer_home.jsp").forward(request,response);
			}
			else
			{
				response.sendRedirect("e_signup.html");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

}
