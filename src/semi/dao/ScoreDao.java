package semi.dao;

import java.sql.Connection;

import semi.dto.StuInfoDto;

public class ScoreDao {
	
	public StuInfoDto scoreCheck(Connection con, Integer inte) {
		StuInfoDto result=null;
		
		
		String sql="select * from stuscore ";
		
		return result;
	}
	
}
