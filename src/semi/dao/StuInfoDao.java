package semi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import semi.dto.StuInfoDto;
import semi.jdbc.JdbcCon;

public class StuInfoDao {
	
	public StuInfoDto info(Connection conn, Integer inte) {
		StuInfoDto result=new StuInfoDto();
		
		String sql="select * from stuinfo where STUID=?";
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, inte);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				result.setStuid(rs.getInt(1));
				result.setAddress(rs.getString(2));
				result.setEmail(rs.getString(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcCon.close(rs);
		
		return result;
		
	}
		
}
