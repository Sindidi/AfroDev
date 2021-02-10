package metier;

import java.io.IOException;

import javax.ejb.EJB;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.afrodev.entities.Profile;
import com.afrodev.session.ImplementationLocal;



/**
 * Servlet implementation class TraitementRegistre
 */
@WebServlet("/TraitementProfile")
@TransactionManagement(TransactionManagementType.CONTAINER)
/*@WebServlet(name="TraitementRegistre", urlPatterns={"*.do"})*/
public class TraitementProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB 
	private ImplementationLocal local;
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraitementProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status=request.getParameter("status");
		String company=request.getParameter("company");
		String website=request.getParameter("website");
		String location=request.getParameter("location");
		String skills=request.getParameter("skills");
		String githubusername=request.getParameter("githubusername");
		String bio=request.getParameter("bio");
		String twitter=request.getParameter("twitter");
		String facebook=request.getParameter("facebook");		
		String youtube=request.getParameter("youtube");
		String linkedin=request.getParameter("linkedin");		
		String instagram=request.getParameter("instagram");
		
		local.addProfile(new Profile(status, company, website, location, skills, githubusername, bio, twitter, facebook, youtube, linkedin, instagram));
		request.getRequestDispatcher("profileSession.jsp").forward(request, response);
	}

}
