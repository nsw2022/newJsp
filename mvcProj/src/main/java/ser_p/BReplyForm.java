package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BReplyForm implements BoardService{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle", "답변이에요");
		System.out.println("BReplyForm.execute 실행");
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		
		request.setAttribute("mainDTO", new BoardDAO().detail(id));
		
		
	}


}
