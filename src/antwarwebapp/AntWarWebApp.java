package antwarwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home" })
public class AntWarWebApp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AntWarWebApp() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("Hello");
			String message = "HttpServlet: Helloword !";

			response.setContentType("text/html");
			// Actual logic goes here.
			PrintWriter out = response.getWriter();
			String query = request.getQueryString();
			out.println("<h1>" + message + (query == null ? "" : query) + "</h1>");
		} catch (Exception e) {
			request.getRequestDispatcher("/error/404.jsp").forward(request, response);
			e.printStackTrace();
		}
	}
}
