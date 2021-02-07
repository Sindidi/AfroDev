
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lood
 */
@WebServlet(name="wp-admin", urlPatterns={"*.html"})
public class lood extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("404.jsp").forward(request, response);
	}
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		
	}

}
