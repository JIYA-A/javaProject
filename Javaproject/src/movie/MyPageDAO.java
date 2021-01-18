package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import movie.MyPageVO;

public class MyPageDAO {
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

		String sql = "insert into contact values(?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, vo.getPayUid());
			pst.setString(2, vo.getPayMethod());
			pst.setInt(3, vo.getTotalPrice());
			pst.setString(4, vo.getPayDate());
			pst.setInt(5, vo.getUserUid());
			pst.setInt(6, vo.getSeatUid());

			pst.executeUpdate(); // sql문장 실행

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(); // DB연결종료
		}

	}// addContact 마지막줄

	public ArrayList<PayVO> selectContactAll() {
		ArrayList<PayVO> list = new ArrayList<PayVO>();

		try {
			connection();

			// select문을 실행하여 연락처 정보들을 ArrayList에 저장하시오.
			// *BookDAO의 selectBookAll()메소드 참고

			// 3.DB에 보낼 Query 작성
			String sql = "select * from contact";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				String getName = rs.getString(1);
				int getAge = rs.getInt(2);
				String getPhone = rs.getString(3);

//				list.add(new PayVO());

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

	public void deleteContact(String selectName) {
		try {

			connection();

			// 3. DB에 보낼 Query문 작성
			String sql = "delete from contact where name = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, selectName);

			// 4. Query 실행
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		} // end try~catch!finally
	}

}
