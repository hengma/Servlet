package com.company.servlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class AppSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionListener.sessionCreated(HttpSessionEvent sessionEvent)----------");
		System.out.println("Session Created:: ID="
				+ sessionEvent.getSession().getId());
		System.out.println("--------------------------------------------------------------------------");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionListener.sessionDestroyed(HttpSessionEvent sessionEvent)--------");
		System.out.println("Session Destroyed:: ID="
				+ sessionEvent.getSession().getId());
		System.out.println("--------------------------------------------------------------------------");
	}

}
