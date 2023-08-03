package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/board/*")
public class boardController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(request.getRequestURI());
		System.out.println(request.getContextPath()+"/board/");
		String allURI = request.getRequestURI();
		String ServletStr = allURI.substring(
					(request.getContextPath().length())
				);
		System.out.println("내가원하는거가당신인가요?"+ServletStr);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(ServletStr);
		
		request.setAttribute("Test", response);
		
		
		/*
		dispatcher.forward(request, response);
		*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
