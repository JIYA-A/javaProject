package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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




}
