package semi.service;

import java.sql.Connection;
import java.util.List;

import semi.dao.ScoreDao;
import semi.dto.ScoreDto;
import semi.jdbc.JdbcCon;

public class ScoreService {
	
public List<ScoreDto> getscore(Integer inte) {
		
		Connection conn=JdbcCon.getConnection();
		List<ScoreDto> score=new ScoreDao().scoreCheck(conn, inte);
		
		JdbcCon.close(conn);	
		
		return score; 
		
	}

}
