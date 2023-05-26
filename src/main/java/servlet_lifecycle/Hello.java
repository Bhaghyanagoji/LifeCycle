package servlet_lifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/hello")
public class Hello implements Servlet            //4-4-23
{

	static
	{
		System.out.println("Hello class is loaded");
	}
	
	public Hello() {
		System.out.println("Object for hello class is created");
	}
	
	public void destroy() {
		System.out.println("Hello class destroy method is invoked");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Hello class init method is invoked");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hello class service method is invoked");
		
	}

}
