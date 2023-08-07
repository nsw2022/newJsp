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

public class BDeleteReg implements BoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		 
		String path = request.getRealPath("up");
		// 보이는게 실제경로지만 이클립스 가상환경안에서함으로
		// 배포할때는 바꿔줘야함
		// E:\NSW\study\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\mvcProj\\up
		path = "E:\\NSW\\study\\mvcProj\\src\\main\\webapp\\up";
		

		BoardDTO dto = new BoardDTO();
		dto.setId(Integer.parseInt(request.getParameter("id")));
		dto.setPw(request.getParameter("pw"));
		
		PageData pd = (PageData) request.getAttribute("pd");
		
		String msg = "비밀번호가 일치하지 안습니다";
		String goUrl = "BDeleteForm?id="+dto.getId()+"&page="+pd.page;
		// id/pw검사로직
		BoardDTO delDTO = new BoardDAO().idPwChk(dto);
		if (delDTO != null) {
			if (!delDTO.getUpfile().equals("")) {// 파일명이 존재한다면
				//파일 삭제
				new File(path+"\\"+delDTO.getUpfile()).delete();
			}
			// DB에서 삭제
			new BoardDAO().delete(dto);
			msg = "삭제되었습니다.";
			goUrl = "BList?page="+pd.page;
		}
		
		request.setAttribute("mainPage", "alert");
		request.setAttribute("msg", msg);
		request.setAttribute("goUrl", goUrl);
		
		
		
	}

}
