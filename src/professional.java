

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ojp.Student1;

/**
 * Servlet implementation class professional
 */
@WebServlet("/professional")
public class professional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public professional() {
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
	
		String stream=request.getParameter("stream");
		String jobtype=request.getParameter("jobtype");
		String skill=request.getParameter("skill");
		String currentProfile=request.getParameter("currentProfile");
		String batch=request.getParameter("batch");
		String Studentid=request.getParameter("Studentid");
		Student1 s=new Student1();
		s.setStream(stream);
		s.setJobtype(jobtype);
		s.setSkill(skill);
		s.setCurrentProfile(currentProfile);
		s.setBatch(batch);
		s.setStudentid(Studentid);
		try
		{
		boolean b=Student1.ProfessionalInfo(s);
		
		if(b)
		{	HttpSession session=request.getSession(true);
			session.setAttribute("skill", skill);
			session.setAttribute("currentprofile", currentProfile);
			session.setAttribute("stream", stream);
			session.setAttribute("jobtype",jobtype);
			session.setAttribute("batch", batch);
			getServletContext().getRequestDispatcher("/resume_enter.jsp").forward(request,response);
	
		}
		else
		{
			response.sendRedirect("/professional.jsp");
			
		}
		}
		catch(Exception e)
		{System.out.println(e);		}
	}

}
