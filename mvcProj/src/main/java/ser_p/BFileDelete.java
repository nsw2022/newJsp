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

public class BFileDelete implements BoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		 
		String path = request.getRealPath("up");
		// 보이는게 실제경로지만 이클립스 가상환경안에서함으로
		// 배포할때는 바꿔줘야함
		// E:\NSW\study\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\mvcProj\\up
		path = "E:\\NSW\\study\\mvcProj\\src\\main\\webapp\\up";
		
		
		
		try {
			PageData pd = (PageData) request.getAttribute("pd");
			
			
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
			
			BoardDTO dto = new BoardDTO();
			dto.setId( Integer.parseInt(mr.getParameter("id")));
			dto.setTitle( mr.getParameter("title"));
			dto.setPname( mr.getParameter("pname"));
			dto.setPw( mr.getParameter("pw"));
			dto.setContent( mr.getParameter("content"));
			dto.setUpfile( mr.getFilesystemName("upfile"));
			
			String msg = "비밀번호가 일치하지 않습니다.";
			String goUrl = "BModifyForm?id="+dto.getId()+"&page="+pd.page;
			
			System.out.println(dto);
			
			BoardDTO delDTO = new BoardDAO().idPwChk(dto);
			
			if (delDTO != null) {
				
				//파일 삭제
				new File(path+"\\"+delDTO.getUpfile()).delete();
				new BoardDAO().fileDelete(dto);
				
				msg = "파일 삭제되었습니다.";
				//goUrl = "BList";
				
			}
			
				
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg",msg);
			request.setAttribute("goUrl",goUrl);
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		System.out.println(path);
		
	}

}
