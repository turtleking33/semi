package semi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import semi.dto.LoginDto;
import semi.jdbc.JdbcCon;

public class LoginDao {
	
	public int login(Connection conn, String id, String pw) {
		LoginDto result=new LoginDto();
		String sql="select count(*) from semilogin where STUID=? and STUPSS=?";
		
		PreparedStatement pstmt=null;
		int login = -1;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			login=pstmt.executeUpdate();
			if(login==1) {
				login=1;
			}else {
				login=0;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			JdbcCon.close(conn);
		}
		
		return login;
		 
	}
	
}
