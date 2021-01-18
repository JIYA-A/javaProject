package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	// DB�����ϴ±��
	public void connection() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			// 1.JDBC����̹� �ε�(�����ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.DB����
			conn = DriverManager.getConnection(url, user, password);

			if (conn == null) {
				System.out.println("DB���� ����..");
			} else {
				System.out.println("DB���� ����!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // �����޼��� ���
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// DB������ �����ϴ� ���
	public void close() {
		// 6.DB���ÿ��ᰴü ����
		// ->�������� ���� ��쿬��� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
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

	// ȸ������ �߰��ϴ� ���

	public void addCustomer(CustomerVO vo) {

		connection();

		String sql = "insert into customer values(user_Uid.nextval,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getUserName());
			pst.setString(2, vo.getUserId());
			pst.setString(3, vo.getUserPw());
			pst.setString(4, vo.getUserPhoneNum());

			pst.executeUpdate(); // sql���� ����

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // DB��������
		}

	}

	public CustomerVO selectCustomerByUserIdAndPw(CustomerVO vo) {
		
		CustomerVO userInfo = new CustomerVO();
		try {
			connection();

			// select���� �����Ͽ� ����ó �������� ArrayList�� �����Ͻÿ�.
			// *BookDAO�� selectBookAll()�޼ҵ� ����

			// 3.DB�� ���� Query �ۼ�
			String sql = "select * from customer where userId = ? and userPw = ?";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, vo.getUserId());
			pst.setString(2, vo.getUserPw());

			rs = pst.executeQuery();

			while (rs.next()) {
				userInfo.setUserId(rs.getString("userId"));
				userInfo.setUserName(rs.getString("userName"));
				userInfo.setUserPhoneNum(rs.getString("userPhoneNum"));
				userInfo.setUserUid(rs.getInt("userUid"));
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// try~catch������ ������� ������ �����ϴ� ����

			// 6. DB���� ���ᰳü ����
			// -> �������� ���� ��� ����� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
			close();
		}
		

		return userInfo;

	}

	public void deleteSeat(int selectSeatUid) {
		try {

			connection();

			// 3. DB�� ���� Query�� �ۼ�
			String sql = "delete from seat where seatUid = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, selectSeatUid);

			// 4. Query ����
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		} // end try~catch!finally
	}

}
