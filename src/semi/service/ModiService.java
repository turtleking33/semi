package semi.service;

import java.sql.Connection;

import semi.dao.ModiDao;
import semi.dto.ModiDto;
import semi.jdbc.JdbcCon;

public class ModiService {
	
public int modiService(ModiDto dto, Integer stuid) {
		
		Connection conn=JdbcCon.getConnection();
		int result=new ModiDao().modi(conn, dto, stuid);
		
		JdbcCon.close(conn);	
		
		return result; 
		
	}

}
