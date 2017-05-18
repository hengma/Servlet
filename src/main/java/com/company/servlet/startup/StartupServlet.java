/*
 *
 * Classname: StartupServlet
 * Version:   $Id: StartupServlet.java,v 1.10 2014-08-15 10:38:48 hengma Exp $
 *
 *
 * Copyright: This document has been produced by FIMASYS. It is property
 *            of FIMASYS until the complete property transfer is completed
 *            according to contractual agreements - copyright, 2004.
 *
 */
package com.company.servlet.startup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "startup", 
	displayName = "StartupServlet", 
	description = "StartupServlet", 
	loadOnStartup = 1, 
	urlPatterns = "/startup",
	initParams = {	@WebInitParam(name = "param1", value = "aaa", description = " Test param 1"),
					@WebInitParam(name = "param2", value = "bbb", description = " Test param 2")
					}
)
public class StartupServlet extends HttpServlet {

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
		
		//Test Listener AppContextAttributeListener
		/*ServletContext ctx = request.getServletContext();
		ctx.setAttribute("user", "user");
		ctx.setAttribute("user", "user");
		ctx.removeAttribute("user");*/
		
		// Test Listener AppSessionListener , AppSessionAttributeListener
		/*HttpSession session = request.getSession(true);
		session.setAttribute("user", "user");
		session.setAttribute("user", "user");
		session.removeAttribute("user");
        session.invalidate();*/

		
		
		response.setContentType("text/html");
		PrintWriter out = new PrintWriter(response.getOutputStream());

		// create HTML output
		out.print("<HTML><HEAD><TITLE>HUB Startup Servlet</TITLE></HEAD><BODY bgcolor=\"white\">");
		out.println("<H2>Startup Servlet</H2>");
		out.println("</BODY></HTML>");
		out.flush();
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