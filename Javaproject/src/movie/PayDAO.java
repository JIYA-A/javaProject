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

		String sql = "insert into pay values(pay_Uid.nextval,?,sysdate,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, vo.getTotalPrice());
			pst.setString(2, vo.getCardNumber());
			pst.setString(3, vo.getMovieName());
			pst.setInt(4, vo.getUser_Uid());
			pst.setInt(5, vo.getSeat_Uid());
		
			
			

			pst.executeUpdate(); // sql���� ����

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // DB��������
		}

	}// addContact ��������

	public ArrayList<PayVO> selectPayAll(int user_Uid) {
		ArrayList<PayVO> list = new ArrayList<PayVO>();

		try {
			connection();

			// select���� �����Ͽ� ����ó �������� ArrayList�� �����Ͻÿ�.
			// *BookDAO�� selectBookAll()�޼ҵ� ����

			// 3.DB�� ���� Query �ۼ�
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
		} finally {// try~catch������ ������� ������ �����ϴ� ����

			// 6. DB���� ���ᰳü ����
			// -> �������� ���� ��� ����� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
			close();
		}

		return list;

	}

	public void deletePay(int payUid) {
		try {

			connection();

			// 3. DB�� ���� Query�� �ۼ�
			String sql = "delete from pay where payUid = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, payUid);

			// 4. Query ����
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

			// 3. DB�� ���� Query�� �ۼ�
			String sql = "update seat set isSeatRsv = 0 where seatUid =( select seatUid from pay where payUid = ?)";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, value);
			// 4. Query ����
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
	}
	

}
