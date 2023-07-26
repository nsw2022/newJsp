package basic_p;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/basic/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public First() {
        System.out.println("First 생성자 실행");
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		System.out.println("do Get 실행");
		
	    response.getWriter()
	    .append("Served at: ")
	    .append(request.getContextPath())
	    .append(" First 이지롱 크킄");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init 실행");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy 실행");
	}


}
