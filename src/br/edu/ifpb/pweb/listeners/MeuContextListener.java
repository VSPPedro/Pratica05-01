package br.edu.ifpb.pweb.listeners;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.edu.ifpb.pweb.model.Livro;

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
		Livro livros[] = { 
				new Livro("Dom Casmurro", "Machado de Assis", new Date(), 200), 
				new Livro("Uma BreveHistoria do Tempo", "Stephen Hawking", new Date(), 160),
				new Livro("Pálido Ponto Azul", "Carl Sagan", new Date(), 410), 
				new Livro("A Origem das Especies", "Charles Darwin", new Date(), 502),
				new Livro("A Dança do Universo", "Marcelo Gleiser", new Date(), 341),
				new Livro("O Guardião de Memórias", "Kim Edwards", new Date(), 287),
				new Livro("A Mente Nova do Rei", "Roger Penrose", new Date(), 309) };
		
		//Cria a fábrica de EntityManagers e a EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livros");
		EntityManager em = emf.createEntityManager();
		
		//Grava cada um dos livros do array no banco de dados
		em.getTransaction().begin();
		for(Livro livro : livros) {
			em.persist(livro);
		}
		
		em.getTransaction().commit();
		e.getServletContext().log("Banco de Dados populado.");
	}
	
	public void contextDestroyed(ServletContextEvent e) {
		e.getServletContext().log("Servlet context foi destruído...");
	}
}
