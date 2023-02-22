package semi.service;

import java.sql.Connection;

import semi.dao.StuInfoDao;
import semi.dto.StuInfoDto;
import semi.jdbc.JdbcCon;

public class InfoService {
	public StuInfoDto info(Integer inte) {
		Connection conn=JdbcCon.getConnection();
		
		StuInfoDto result=new StuInfoDao().info(conn, inte);
		JdbcCon.close(conn);
		return result;
	}
}
