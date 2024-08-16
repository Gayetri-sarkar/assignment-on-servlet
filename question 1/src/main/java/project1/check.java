package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class check extends HttpServlet {
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		int l=i/j;
		int m=i*j;
		int n=i-j;
		PrintWriter out=res.getWriter();
		out.println(i+"+"+j+"="+k);
		out.println(i+"/"+j+"="+l);
		out.println(i+"*"+j+"="+m);
		out.println(i+"-"+j+"="+n);
	}

}
