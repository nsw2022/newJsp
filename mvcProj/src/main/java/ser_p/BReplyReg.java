package ser_p;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;
import model_p.PageData;

public class BReplyReg implements BoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		 
		String path = request.getRealPath("up");
		// 보이는게 실제경로지만 이클립스 가상환경안에서함으로
		// 배포할때는 바꿔줘야함
		// E:\NSW\study\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\mvcProj\\up
		path = "E:\\NSW\\study\\mvcProj\\src\\main\\webapp\\up";
		
		
		
		try {
			
			PageData pd = (PageData) request.getAttribute("pd");
			
			BoardDTO dto = new BoardDTO();
			
			dto.setTitle( request.getParameter("title"));
			dto.setPname( request.getParameter("pname"));
			dto.setPw( request.getParameter("pw"));
			dto.setContent( request.getParameter("content"));
			
			dto.setGid( Integer.parseInt(request.getParameter("gid")));
			dto.setLev( Integer.parseInt(request.getParameter("lev")));
			dto.setSeq( Integer.parseInt(request.getParameter("seq")));
			
			
			new BoardDAO().replfy(dto);
			
					
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg","작성되었습니다");
			request.setAttribute("goUrl","BDetail?id="+dto.getId()+"&page="+pd.page);
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		System.out.println(path);
		
	}

}
