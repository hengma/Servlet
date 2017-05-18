package com.company.servlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class AppSessionActivationListener implements HttpSessionActivationListener {

	@Override
	public void sessionDidActivate(HttpSessionEvent sessionEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionActivationListener.sessionDidActivate(..)-----------------------");
		System.out.println("Session activated:: ID="
				+ sessionEvent.getSession().getId());
		System.out.println("--------------------------------------------------------------------------");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent sessionEvent) {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("AppSessionActivationListener.sessionWillPassivate(..)-----------------------");
		System.out.println("Session passivated:: ID="
				+ sessionEvent.getSession().getId());
		System.out.println("--------------------------------------------------------------------------");
	}

}
