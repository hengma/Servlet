package com.company.servlet.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextAttributeListener implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppContextAttributeListener.attributeAdded(.........................)-----");
		System.out.println("ServletContext attribute added::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		System.out.println("--------------------------------------------------------------------------");
	}

	@Override
	public void attributeReplaced(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppContextAttributeListener.attributeReplaced(......................)-----");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("ServletContext attribute replaced::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
	}

	@Override
	public void attributeRemoved(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppContextAttributeListener.attributeRemoved(......................)------");
		System.out.println("ServletContext attribute removed::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		System.out.println("--------------------------------------------------------------------------");
	}

}