package ederminio.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sqrt")
public class My2ndServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		//processRequest(req, res);
		//int resul=Integer.parseInt(req.getParameter("resul"));
//		
//		HttpSession session=req.getSession();
//		int resul=(int)session.getAttribute("resul");
//		resul=resul*resul;
		
		int resul=0;
		Cookie[] cookies=req.getCookies();
		
		for(Cookie cookie: cookies) {
			if(cookie.getName().contentEquals("resul")) {
				resul=Integer.parseInt(cookie.getValue());
				break;
			}				
		}
		
		out=res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("The sqrt of "+resul+" is :"+resul*resul);
		out.print("</body></html>");
		
//		ServletConfig sc=getServletConfig();
//		String name=sc.getInitParameter("name");
//		out.write(" ------> "+name);
	
		

	}
	public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int resul=(int)req.getAttribute("resul");
		resul=resul*resul;
		out=res.getWriter();
		out.println("The sqrt of the sum is :"+resul);

	}

}
