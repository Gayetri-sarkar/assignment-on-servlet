package cookiesq4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VisitCounter extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException {
		res.setContentType("text/html");
		Cookie[] cookies = req.getCookies();
		int visitCount = 0;
		if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("visitCount".equals(cookie.getName())) {
                    visitCount = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }
		visitCount++;
		Cookie visitCookie = new Cookie("visitCount", Integer.toString(visitCount));
	    visitCookie.setMaxAge(24 * 60 * 60); // Cookie expires in 1 day
	    res.addCookie(visitCookie);
	    PrintWriter out = res.getWriter();
	    out.println("<html><body>");
	    out.println("<h1>Welcome Back!</h1>");
	    out.println("<p>You have visited this page " + visitCount + " times.</p>");
	    out.println("</body></html>");    
	}

}
