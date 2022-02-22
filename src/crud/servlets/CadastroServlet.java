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

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet{

	private static final long serialVersionUID = 1521980604131890810L;
	
	private CadastroCarroDAO dao = new CadastroCarroMemoriaDAO();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String marca = req.getParameter("marca");
		String modelo = req.getParameter("modelo");
		Integer ano = Integer.parseInt(req.getParameter("ano"));
		String id = req.getParameter("id");
		boolean isCadastro = id == null || id.isEmpty();
		if(isCadastro) {
			Carro carro = new Carro(marca, modelo, ano);
			this.dao.cadastro(carro);
		}else {
			Carro carro = new Carro(Integer.parseInt(id),marca, modelo, ano);
			this.dao.alteraCarro(carro);
		}
		
		resp.sendRedirect("listagem");
	}
}
