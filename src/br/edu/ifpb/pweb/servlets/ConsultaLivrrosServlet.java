package br.edu.ifpb.pweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.pweb.model.Livro;

/**
 * Servlet implementation class ConsultaLivrrosServlet
 */
@WebServlet("/consulta")
public class ConsultaLivrrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaLivrrosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Cria a fábrica de EntityManagers e uma EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livros");
		EntityManager em = emf.createEntityManager();
		
		// Consulta todos os livros do banco de dados
		List<Livro> livros = (List<Livro>) em.createQuery("from Livro").getResultList();
		em.close();
		
		// Poe a lista de livros como atributo do request
		request.setAttribute("livros", livros);
		
		// Encaminha a requisição para o JSP que vai exibir a lista de livros
		request.getRequestDispatcher("livros.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
