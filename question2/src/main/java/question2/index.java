package question2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index extends  HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String Name = req.getParameter("Username");
		int Pass =Integer.parseInt(req.getParameter("Password"));

	    
		String rightUsername="admin";
		int rightPassword=271195;
		
		PrintWriter out=res.getWriter();
		 if (rightUsername.equals(Name) && rightPassword==Pass) {
	            out.println("Hello admin");
	        } else {
	            out.println("Login failed");
	        }
		
		
	}

}
