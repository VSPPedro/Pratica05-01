package br.edu.ifpb.pweb.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MeuContextListener
 *
 */
@WebListener
public class MeuContextListener implements ServletContextListener {

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
	public void contextInitialized(ServletContextEvent e) {
		e.getServletContext().log("Servlet context foi criado...");
	}
	
	public void contextDestroyed(ServletContextEvent e) {
		e.getServletContext().log("Servlet context foi destruído...");
	}
}
