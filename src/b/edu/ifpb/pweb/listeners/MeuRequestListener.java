package b.edu.ifpb.pweb.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MeuRequestListener
 *
 */
@WebListener
public class MeuRequestListener implements ServletRequestListener {

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent e)  { 
    	e.getServletContext().log("ServletListener context foi destruido...");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent e)  { 
    	e.getServletContext().log("ServletListener context foi criado...");
    }
	
}
