package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

public class GallDAO {
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;

	public GallDAO() {
		Context init;
		try {
			init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:/comp/env/mvc322");
			con = ds.getConnection();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}// 생성자

	
	public ArrayList<GallDTO> list() {
		
		sql = "select * from gallery";
		
		ArrayList<GallDTO> res = new ArrayList<>();
		
		try {
			ptmt = con.prepareStatement(sql);
			
			rs=ptmt.executeQuery();
			
			while (rs.next()) {
				GallDTO dto = new GallDTO();
				dto.setId(rs.getInt("id"));
				dto.setContent(rs.getString("content"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setPname(rs.getString("pname"));
				dto.setTitle(rs.getString("title"));
				dto.setReg_date(rs.getString("reg_date"));
				res.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	public void close() {
		if(rs!=null) try { rs.close();	} catch (Exception e) {}
		if(ptmt!=null) try { ptmt.close();	} catch (Exception e) {}
		if(con!=null) try { con.close();	} catch (Exception e) {}
	}



}
