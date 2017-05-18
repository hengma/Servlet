package com.company.servlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class AppSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionAttributeListener.attributeAdded(.........................)-----");
		System.out.println("HttpSessionAttributeListener attribute added::{"
				+ arg0.getName() + ","
				+ arg0.getValue() + "}");
		System.out.println("--------------------------------------------------------------------------");
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionAttributeListener.attributeRemoved(.........................)---");
		System.out.println("HttpSessionAttributeListener attribute removed::{"
				+ arg0.getName() + ","
				+ arg0.getValue() + "}");
		System.out.println("--------------------------------------------------------------------------");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionAttributeListener.attributeReplaced(.........................)--");
		System.out.println("HttpSessionAttributeListener attribute replaced::{"
				+ arg0.getName() + ","
				+ arg0.getValue() + "}");
		System.out.println("--------------------------------------------------------------------------");
		
	}

}
