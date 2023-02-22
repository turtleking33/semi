package semi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semi.dto.ScoreDto;
import semi.jdbc.JdbcCon;

public class ScoreDao {
	
	public List<ScoreDto> scoreCheck(Connection conn, Integer inte) {
		List<ScoreDto> scorelist=new ArrayList<ScoreDto>();
		
		
		String sql="select * from stuscore where STUID=?";
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, inte);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ScoreDto dto=new ScoreDto();
				dto.setStuid(rs.getInt(1));
				dto.setMajor(rs.getString(2));
				dto.setSubject(rs.getString(3));
				dto.setProfessor(rs.getString(4));
				dto.setScore(rs.getString(5));
				scorelist.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcCon.close(rs);
			
		}
		return scorelist;
		
	}
	
}
