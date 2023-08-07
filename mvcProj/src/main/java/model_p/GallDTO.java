package model_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class GallDTO {
	String title,pname,pw,upfile,content,reg_date;
	
	int id;
	boolean isImg;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm");
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUpfile() {
		if (upfile == null ||
			upfile.trim().equals("")||
			upfile.trim().equals("null")) {
			upfile="";
		}
		return upfile;
	}
	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isImg() {
		
		isImg = Pattern.matches(".*[.](jpg||png||gif", getUpfile().toLowerCase());
		
		return isImg;
	}
	public void setImg(boolean isImg) {
		this.isImg = isImg;
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
	
}
