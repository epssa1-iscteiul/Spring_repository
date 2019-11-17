package ederminio.com;

import java.io.IOException;
import java.net.HttpCookie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class MyServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		processRequest(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		processRequest(req, res);
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int resul=n1+n2;
//		HttpSession session=req.getSession();
//		session.setAttribute("resul", resul);
//		res.sendRedirect("sqrt?resul="+resul); //URL Rewriting
		
		Cookie cookie=new Cookie("resul",resul+"");
		res.addCookie(cookie);
		res.sendRedirect("sqrt");
		/*req.setAttribute("resul", resul);
		RequestDispatcher rd=req.getRequestDispatcher("sqrt");
		rd.forward(req, res);*/

	}
}
