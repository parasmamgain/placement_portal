

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ojp.Student1;

/**
 * Servlet implementation class personal
 */
@WebServlet("/personal")
public class personal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public personal() {
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

		String gender=request.getParameter("gender");
		String mobile=request.getParameter("mobile");
		String nationality=request.getParameter("nationality");
		String currentloc=request.getParameter("currentloc");
		String Studentid=request.getParameter("Studentid");
		Student1 s=new Student1();
		s.setGender(gender);
		s.setMobile(mobile);
		s.setNationality(nationality);
		s.setCurrentloc(currentloc);
		s.setStudentid(Studentid);
		try{
			boolean b=Student1.PersonalInfo(s);
			if(b)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("gender", gender);
				session.setAttribute("mobile", mobile);
				session.setAttribute("nationality", nationality);
				session.setAttribute("current_location", currentloc);
				getServletContext().getRequestDispatcher("/professional.jsp").forward(request,response);
			}
			else
			{
				response.sendRedirect("personal.html");
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
