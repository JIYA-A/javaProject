package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class MovieDAO {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	// DB연결하는기능
	public void connection() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			// 1.JDBC드라이버 로딩(동적로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.DB연결
			conn = DriverManager.getConnection(url, user, password);

			if (conn == null) {
				System.out.println("DB연결 실패..");
			} else {
				System.out.println("DB연결 성공!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 오류메세지 출력
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// DB연결을 종료하는 기능
	public void close() {
		// 6.DB관련연결객체 종료
		// ->종료하지 않을 경우연결된 객체들이 쌓이게 되면서 DB연결에 문제가 발생
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<MovieVO> selectmovieall() {
	      ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	      //DB연결기능
	      
	      
	      try {
	         //1~2
	         connection();
	         // 3.DB에 보낼 Query 작성
	         String sql = "select * from movie";
	         pst = conn.prepareStatement(sql);

	         // 4.Query 실행
	         // DB에 저장된 정보를 ResultSet 객체에 저장
	         rs = pst.executeQuery();

	         // 5.ResultSet객체에 저장된 DB 정보 가져오기
	        
	         while (rs.next()) {
	            int movieUid = rs.getInt(1);
	            String movieTitle = rs.getString(2);
	            String movieTime = rs.getString(3);
	            
	            
	            
	            //리스트에 회원정보 저장 
	            list.add(new MovieVO(movieUid,movieTitle,movieTime));
	           
	         }

	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {// try~catch문과는 상관없이 무조건 실행하는 구문

	         // 6. DB관련 연결개체 종료
	         // -> 종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 DB연결에 문제가 발생
	         close();
	         }
	      
	      
	      //DB연결종료
	      
	      return list;
	      
	   }

	public int selectMovieUid(String movieNm, String time) {
		try {
	         connection();
	         String sql = "select movieUid from movie where movieTitle =? and movieTime=?";
	      
	         pst = conn.prepareStatement(sql);
	         pst.setString(1, movieNm);
	         pst.setString(2, time);
	         // 4.Query 실행
	         // DB에 저장된 정보를 ResultSet 객체에 저장
	         rs = pst.executeQuery();

	         // 5.ResultSet객체에 저장된 DB 정보 가져오기
	         if (rs.next()) {
					int getuid = rs.getInt(1);
					return getuid;

					// 리스트에 회원정보저장
					
				}
		}

	       catch (SQLException e) {
	         e.printStackTrace();
	      } finally {// try~catch문과는 상관없이 무조건 실행하는 구문

	         // 6. DB관련 연결개체 종료
	         // -> 종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 DB연결에 문제가 발생
	         close();
	         }
	
		return 0;
	
	}
	


}
