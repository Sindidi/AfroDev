package metier;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.afrodev.entities.User;
import com.afrodev.session.ImplementationLocal;

/*import metier.entites.Profile;
import metier.entites.Users;
import metier.session.ProfileInterfaceLocale;
import metier.session.UsersInterfaceLocale;*/

/**
 * Servlet implementation class TraitementRegistre
 */
@WebServlet("/TraitementRegistre")
/*@WebServlet(name="TraitementRegistre", urlPatterns={"*.do"})*/
public class TraitementRegistre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB 
	private ImplementationLocal local;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraitementRegistre() {
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
		String pname=request.getParameter("pnom");
		String name=request.getParameter("nom");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String photo=request.getParameter("photo");
		String password=request.getParameter("password");
		
		 local.addUser(new User(pname, name, username, email, password, photo));
		 request.getRequestDispatcher("create-profile.jsp").forward(request, response);
	}

}
