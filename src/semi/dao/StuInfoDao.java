package semi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import semi.dto.StuInfoDto;

public class StuInfoDao {
	
	public StuInfoDto info(Connection conn) {
		StuInfoDto result=new StuInfoDto();
		
		String sql="select * from STUINFO";
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				result.setStuid(rs.getInt(1));
				result.setAddress(rs.getString(2));
				result.setEmail(rs.getString(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
		
}
