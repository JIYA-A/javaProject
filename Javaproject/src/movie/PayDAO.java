package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import movie.PayVO;

public class PayDAO {
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

	public void addPay(PayVO vo) {

		connection(); // DB연결

		String sql = "insert into pay values(pay_Uid.nextval,?,sysdate,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, vo.getTotalPrice());
			pst.setString(2, vo.getCardNumber());
			pst.setString(3, vo.getMovieName());
			pst.setInt(4, vo.getUser_Uid());
			pst.setInt(5, vo.getSeat_Uid());
		
			
			

			pst.executeUpdate(); // sql문장 실행

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // DB연결종료
		}

	}// addContact 마지막줄

	public ArrayList<PayVO> selectPayAll(int user_Uid) {
		ArrayList<PayVO> list = new ArrayList<PayVO>();

		try {
			connection();

			// select문을 실행하여 연락처 정보들을 ArrayList에 저장하시오.
			// *BookDAO의 selectBookAll()메소드 참고

			// 3.DB에 보낼 Query 작성
			String sql = "select movieName,payDate,totalPrice,payUid from pay where userUid = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, user_Uid);
			rs = pst.executeQuery();

			while (rs.next()) {
				String getMovieName = rs.getString(1);
				String getPayDate = rs.getString(2);
				int getTotalPrice = rs.getInt(3);
				int getpayUid = rs.getInt(4);
			
				
				

				list.add(new PayVO(getMovieName,  getPayDate,getTotalPrice,getpayUid));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// try~catch문과는 상관없이 무조건 실행하는 구문

			// 6. DB관련 연결개체 종료
			// -> 종료하지 않을 경우 연결된 객체들이 쌓이게 되면서 DB연결에 문제가 발생
			close();
		}

		return list;

	}

	public void deletePay(int payUid) {
		try {

			connection();

			// 3. DB에 보낼 Query문 작성
			String sql = "delete from pay where payUid = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, payUid);

			// 4. Query 실행
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		} // end try~catch!finally
	}

	public void deleteseatrv(int value) {
		try {

			connection();

			// 3. DB에 보낼 Query문 작성
			String sql = "update seat set isSeatRsv = 0 where seatUid =( select seatUid from pay where payUid = ?)";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, value);
			// 4. Query 실행
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
	}
	

}
