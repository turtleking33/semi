package semi.service;

import java.sql.Connection;

import semi.dao.LoginDao;
import semi.jdbc.JdbcCon;

public class LoginService {
	
	public  int login(String id, String pw) {
		
		Connection conn=JdbcCon.getConnection();
		int daoResult=new LoginDao().login(conn, id, pw);
		
		JdbcCon.commit(conn);		
		
		return daoResult; 
		
	}
	
	
}
