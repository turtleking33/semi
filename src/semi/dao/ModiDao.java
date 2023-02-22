package semi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import semi.dto.ModiDto;
import semi.jdbc.JdbcCon;

public class ModiDao {
	
	public int modi(Connection conn, ModiDto dto, Integer stuid) {
		int update=-1;

		ModiDto result=new ModiDto();
		
		String sql="update stuinfo set ADDRESS=? , EMAIL=? where STUID=?";
		
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getAddress());
			pstmt.setString(2, dto.getEmail());
			pstmt.setInt(3, stuid);
			update=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcCon.close(pstmt);
			
		}
		
		return update;
		
	}
	
}
