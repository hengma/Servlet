package com.company.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//Done when stop server
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------AppContextListener.contextDestroyed(ServletContextEvent arg0)-----");
		System.out.println("--------------------------------------------------------------------------");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//Done whens start Server
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------AppContextListener.contextInitialized(ServletContextEvent arg0)---");
		System.out.println("--------------------------------------------------------------------------");
	}

}
