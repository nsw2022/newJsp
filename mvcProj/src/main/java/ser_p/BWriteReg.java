package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BWriteReg implements BoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		 
		String path = request.getRealPath("up");
		// 보이는게 실제경로지만 이클립스 가상환경안에서함으로
		// 배포할때는 바꿔줘야함
		// E:\NSW\study\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\mvcProj\\up
		path = "E:\\NSW\\study\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					1024*1024*10,
					"utf-8",
					new DefaultFileRenamePolicy()
					);
			BoardDTO dto = new BoardDTO();
			dto.setTitle(mr.getParameter("title"));
			dto.setPname(mr.getParameter("pname"));
			dto.setPw(mr.getParameter("pw"));
			dto.setContent(mr.getParameter("content"));
			dto.setUpfile(mr.getFilesystemName("upfile"));
			
			new BoardDAO().write(dto);
			
			System.out.println("newId"+dto.getId());
			
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg", "입력이 완료되었습니다.");
			request.setAttribute("goUrl", "BDetail?id="+dto.getId());
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		System.out.println(path);
		
	}

}
