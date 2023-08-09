package ser_g;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.GallDAO;
import model_p.GallDTO;

public class GallList implements GalleryService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "갤러리 리스트");
		System.out.println("GallList 실행");
		request.setAttribute("GallList", new GallDAO().list());
		
	}

}
