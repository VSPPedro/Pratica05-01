package br.edu.ifpb.pweb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = "Pedro";
		int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		ArrayList<String> disciplinas = new ArrayList();
		disciplinas.add("Matematica");
		disciplinas.add("Portugues");
		disciplinas.add("Ciencias");
		disciplinas.add("Historia");
		disciplinas.add("Ingles");
		disciplinas.add("Religiao");
		disciplinas.add("Filosofia");
		disciplinas.add("Historia");
		disciplinas.add("Redação");
		disciplinas.add("Frances");
		Date hoje = new Date();
		float media = 4.5f;
		
		getServletContext().setAttribute("aluno", nome);
		getServletContext().setAttribute("notas", notas);
		getServletContext().setAttribute("disciplinas", disciplinas);
		getServletContext().setAttribute("hoje", hoje);
		getServletContext().setAttribute("media", media);
		
		RequestDispatcher rd = request.getRequestDispatcher("cadastro.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
