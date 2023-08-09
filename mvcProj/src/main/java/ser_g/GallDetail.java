package ser_g;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.GallDAO;

public class GallDetail implements GalleryService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "갤러리 상세보기");
		int id = Integer.parseInt( request.getParameter("id") );
		System.out.println("GellDetail 실행");
		request.setAttribute("GallDetail", new GallDAO().gallDetail(id));
		
	}

}
