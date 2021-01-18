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

	public void addPay(PayVO vo) {

		connection(); // DB����

		String sql = "insert into pay values(pay_payUid.nextval,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(2, vo.getTotalPrice());
			pst.setString(3, vo.getPayDate());
			pst.setString(4, vo.getCardNumber());
			pst.setNString(5, vo.getMovieName());
			

			pst.executeUpdate(); // sql���� ����

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // DB��������
		}

	}// addContact ��������

	public ArrayList<PayVO> selectPayAll() {
		ArrayList<PayVO> list = new ArrayList<PayVO>();

		try {
			connection();

			// select���� �����Ͽ� ����ó �������� ArrayList�� �����Ͻÿ�.
			// *BookDAO�� selectBookAll()�޼ҵ� ����

			// 3.DB�� ���� Query �ۼ�
			String sql = "select movie,payDate,totalPrice from pay";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();

			while (rs.next()) {
				String getMovieName = rs.getString(1);
				String getPayDate = rs.getString(2);
				int getTotalPrice = rs.getInt(3);
				
				

				list.add(new PayVO( getTotalPrice, getPayDate, getMovieName));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// try~catch������ ������� ������ �����ϴ� ����

			// 6. DB���� ���ᰳü ����
			// -> �������� ���� ��� ����� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
			close();
		}

		return list;

	}

	public void deletePay(int selectUid) {
		try {

			connection();

			// 3. DB�� ���� Query�� �ۼ�
			String sql = "delete from pay where payUid = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, selectUid);

			// 4. Query ����
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		} // end try~catch!finally
	}
	

}
