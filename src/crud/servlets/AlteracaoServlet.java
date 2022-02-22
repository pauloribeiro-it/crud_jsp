package crud.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.dao.CadastroCarroDAO;
import crud.dao.CadastroCarroMemoriaDAO;
import crud.entities.Carro;

@WebServlet("/alteracao")
public class AlteracaoServlet extends HttpServlet{
	
	private static final long serialVersionUID = 336189705958907142L;
	
	private CadastroCarroDAO dao = new CadastroCarroMemoriaDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Carro carro = dao.obtemPorId(Integer.valueOf(req.getParameter("id")));
		req.setAttribute("carro", carro);
		req.getRequestDispatcher("cadastro.jsp").forward(req, resp);
	}
}
