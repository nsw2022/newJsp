package ser_p;

import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class FileDown implements BoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String fName = request.getParameter("fName");
		
		 
		String path = request.getRealPath("up");
		// 보이는게 실제경로지만 이클립스 가상환경안에서함으로
		// 배포할때는 바꿔줘야함
		// E:\NSW\study\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\mvcProj\\up
		path = "E:\\NSW\\study\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileInputStream fis = new FileInputStream(path+"\\"+fName);
			String encFName = URLEncoder.encode(fName,"utf-8");
			System.out.println(fName+"->"+encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			
			ServletOutputStream sos = response.getOutputStream();
			
			byte [] buf = new byte[1024];
			
			//int cnt = 0;
			while(fis.available()>0) { //읽을 내용이 남아 있다면
				int len = fis.read(buf);  //읽어서 -> buf 에 넣음
											//len : 넣은 byte 길이
				
				sos.write(buf, 0, len); //보낸다 :  buf의 0부터 len 만큼
				
				//cnt ++;
				//System.out.println(cnt+":"+len);
			}
			
			sos.close();
			fis.close();
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		System.out.println(path);
		
	}

}
