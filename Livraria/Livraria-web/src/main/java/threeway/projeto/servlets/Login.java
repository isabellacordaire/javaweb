package threeway.projeto.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String login = request.getParameter("login");
		final String senha = request.getParameter("senha");
		final String cookieName = "usuario";
		final String cookieValue = login;
		// criando o objeto cookie
		Cookie cookieUser = new Cookie(cookieName, cookieValue);
		// vamos criar um cookie da senha apenas como exemplo para termos mais
		// de um cookie
		Cookie cookiePsw = new Cookie("senha", senha);
		// duração de um dia
		cookieUser.setMaxAge(60 * 60 * 24);
		cookiePsw.setMaxAge(60 * 60 * 24);
		// adicionando o cookie ao navegador
		response.addCookie(cookieUser);
		response.addCookie(cookiePsw);
		// Esta funcionalidade será ensinada nas proximas aulas
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
			}

}
