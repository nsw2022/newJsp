package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ser_g.GalleryService;


@WebServlet("/gallery/*")
public class GalleryController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String servletStr = request.getRequestURI().replace(request.getContextPath()+"/gallery/","");
		System.out.println(servletStr);
		request.setCharacterEncoding("utf-8");
		request.setAttribute("mainPage", "gallery/" +servletStr);
		
		
		try {
			GalleryService service = (GalleryService)Class.forName("ser_g."+servletStr).newInstance();
			service.execute(request, response);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template.jsp");
			dispatcher.forward(request, response);
			
			
		} catch (Exception e) {
			
			e.getMessage();
		} 
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
