package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.DAO.BandaDao;
import br.com.caelum.controller.Banda;

@WebServlet("/adicionaBanda")
public class AdicionaBandaServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 885926685202019945L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// busca o writer
		PrintWriter out = response.getWriter();

		// buscando os parâmetros no request
		String nomeBanda = request.getParameter("nomeBanda");
		String genero = request.getParameter("genero");
<<<<<<< HEAD
		String lugar = request.getParameter("lugar");
		String capacidade = request.getParameter("capacidade");
		String data = request.getParameter("data");
		
=======

>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
		// monta um objeto contato
		Banda banda = new Banda();
		banda.setNomeBanda(nomeBanda);
		banda.setGenero(genero);
<<<<<<< HEAD
		banda.setLugar(lugar);
		banda.setCapacidade(capacidade);
		banda.setDataShow(data);
=======
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d

		// salva o contato
		BandaDao dao = new BandaDao();
		dao.insertBanda(banda);

		// imprime o nome do contato que foi adicionado
		out.println("<html>");
		out.println("<body>");
<<<<<<< HEAD
		out.println("adicionado com sucesso!");
=======
		out.println(
				"Banda " + banda.getNomeBanda() + " do genero " + banda.getGenero() + " adicionado com sucesso");
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
		out.println("</body>");
		out.println("</html>");
	}
}
