package crud.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.dao.CadastroCarroDAO;
import crud.dao.CadastroCarroMemoriaDAO;

@WebServlet("/listagem")
public class ListagemServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1491155931295506010L;
	private CadastroCarroDAO dao = new CadastroCarroMemoriaDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("carros", dao.obtemCarros());
		req.getRequestDispatcher("listagem.jsp").forward(req, resp);
	}
}
