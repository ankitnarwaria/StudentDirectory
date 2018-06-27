package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashboardServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ServletContext servletContext = request.getServletContext();
		request.setAttribute("pageBody", "dashboard.jsp");
		servletContext.getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);
	}

}
