import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ojp.postjobs_entry;

/**
 * Servlet implementation class postjobs
 */
@WebServlet("/postjobs")
public class postjobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postjobs() {
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
	
		String cname=request.getParameter("cname");
		int totalposts=Integer.parseInt(request.getParameter("totalposts"));
		int batch=Integer.parseInt(request.getParameter("batch"));
		String experience=request.getParameter("experience");
		String post=request.getParameter("post");
		String description=request.getParameter("description");
		String stream=request.getParameter("stream");
		postjobs_entry pj=new postjobs_entry();
		pj.setBatch(batch);
		pj.setCname(cname);
		pj.setDescription(description);
		pj.setExperience(experience);
		pj.setPost(post);
		pj.setStream(stream);
		pj.setTotalposts(totalposts);
		try{
		boolean b=postjobs_entry.pj_postjobs(pj);
		if(b){
			response.sendRedirect("employer_home.html");
		}
		else
		{
			response.sendRedirect("postjobs.jsp");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
