package com.company.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.jdbc.UserDAO;
import com.company.jdbc.UserDAOImp;
import com.company.model.User;

@WebServlet(name = "MainServlet", 
	displayName = "MainServlet", 
	description = "MainServlet", 
	urlPatterns = "/MainServlet",
	initParams = {	@WebInitParam(name = "param1", value = "aaa", description = " Test param 1"),
					@WebInitParam(name = "param2", value = "bbb", description = " Test param 2")
					}
)
public class MainServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7286787282449057796L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("----------------------------------------");
		System.out.println("			  Init						");
		System.out.println("----------------------------------------");
		super.init(config);
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------service(ServletRequest req, ServletResponse res)------------------");
		System.out.println("--------------------------------------------------------------------------");
		super.service(req, res);
	}
	
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------service(HttpServletRequest req, HttpServletResponse resp)---------");
		System.out.println("--------------------------------------------------------------------------");
		super.service(req, resp);
	}
	
	public long getLastModified(HttpServletRequest req) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("----------------getLastModified(HttpServletRequest req)-------------------");
		System.out.println("--------------------------------------------------------------------------");
		return super.getLastModified(req);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("-----doGet(HttpServletRequest request, HttpServletResponse response)------");
		System.out.println("--------------------------------------------------------------------------");
		
		/*response.setContentType("text/html");
		PrintWriter out = new PrintWriter(response.getOutputStream());

		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		// create HTML output
		out.print("<HTML><HEAD><TITLE>Main Servlet</TITLE></HEAD><BODY bgcolor=\"white\">");
		out.println("<H2>First Name:" + firstName + "</H2>");
		out.println("<H2>Last Name:" + lastName + "</H2>");
		out.println("</BODY></HTML>");
		out.flush();*/
		
		UserDAO userDao = new UserDAOImp();
		List<User> userList = null;
		try {
			userList = userDao.loaduser();
		} catch (SQLException e) {
			System.out.print("Error: " + e.getMessage());
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("userList", userList);
		
		getServletContext().getRequestDispatcher("/user.jsp")
        .forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("-----doPost(HttpServletRequest request, HttpServletResponse response)-----");
		System.out.println("--------------------------------------------------------------------------");
		this.doGet(request, response);
	}
	
	public void doHead(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------doHead(HttpServletRequest req, HttpServletResponse resp)----------");
		System.out.println("--------------------------------------------------------------------------");
		super.doHead(req, resp);
	}

	public void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------doPut(HttpServletRequest req, HttpServletResponse resp)-----------");
		System.out.println("--------------------------------------------------------------------------");
		super.doPut(req, resp);
	}

	public void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------doDelete(HttpServletRequest req, HttpServletResponse resp)--------");
		System.out.println("--------------------------------------------------------------------------");
		super.doDelete(req, resp);
	}

	public void doOptions(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------doOptions(HttpServletRequest req, HttpServletResponse resp)-------");
		System.out.println("--------------------------------------------------------------------------");
		super.doOptions(req, resp);
	}

	public void doTrace(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, java.io.IOException {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------doTrace(HttpServletRequest req, HttpServletResponse resp)---------");
		System.out.println("--------------------------------------------------------------------------");
		super.doTrace(req, resp);
	}
	
}
