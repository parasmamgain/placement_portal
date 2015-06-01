

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ojp.Student1;

/**
 * Servlet implementation class resume
 */
@WebServlet("/resume")
public class resume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resume() {
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
		String tenth=request.getParameter("tenth");
		String twelfth=request.getParameter("twelfth");
		String graduation=request.getParameter("graduation");
		String resume=request.getParameter("resume");
		String Studentid=request.getParameter("Studentid");
		Student1 s=new Student1();
		s.setTenth(tenth);
		s.setTwelfth(twelfth);
		s.setGraduation(graduation);
;		s.setResume(resume);
		s.setStudentid(Studentid);
		try
		{	
			boolean b=Student1.Resume(s);
			if(b)
			{	
				HttpSession session=request.getSession();
				session.setAttribute("tenth", tenth);
				session.setAttribute("twelfth", twelfth);
				session.setAttribute("graduation", graduation);
				session.setAttribute("resume", resume);
				getServletContext().getRequestDispatcher("/resumedetails.jsp").forward(request, response);
			}
			else
			{
				response.sendRedirect("resume.jsp");
			}
		}
		catch(Exception e)
		{
		}
	}

}
