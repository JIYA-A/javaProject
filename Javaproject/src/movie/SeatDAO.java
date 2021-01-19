package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SeatDAO {
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

	public void addSeat(SeatVO vo) {

		connection(); // DB����

		String sql = "insert into seat values(seat_seatUid.nextval,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getSeatName());
			pst.setInt(2, vo.getIsSeatRsv());
			pst.setInt(3, vo.getMovieUid());

			pst.executeUpdate(); // sql���� ����

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // DB��������
		}

	}

	public ArrayList<SeatVO> selectSeatAll(String seatName, int movieuid) {
		ArrayList<SeatVO> list = new ArrayList<SeatVO>();

		try {
			connection();

			// select���� �����Ͽ� ����ó �������� ArrayList�� �����Ͻÿ�.
			// *BookDAO�� selectBookAll()�޼ҵ� ����

			// 3.DB�� ���� Query �ۼ�
			String sql = "select * from seat where seatName = ?and movieUid =?";
			pst = conn.prepareStatement(sql);
			 pst.setString(1, seatName);
			 pst.setInt(2,movieuid);
			
			rs = pst.executeQuery();

			while (rs.next()) {
				int getSeatUid = rs.getInt(1);
				String getSeatName = rs.getString(2);
				int getIsSeatRsv = rs.getInt(3);
				int getMovieUid = rs.getInt(5);

				list.add(new SeatVO(getSeatUid, getSeatName, getIsSeatRsv, getMovieUid));

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

	public String one(int i) {

		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		String E = "E";

		switch (i) {
		case 1:
			return A;
			
		case 2:
			return B;
			
		case 3:
			return C;
		
		case 4:
			return D;
		
		case 5:
			return E;
			

		default:
			return "";
		}
	}
	

	

	public void deleteSeat (int selectSeatUid) {
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

	public void seatRvChange(String seat_name, int movie_Uid) {
		try {

			connection();

			// 3. DB�� ���� Query�� �ۼ�
			String sql = "update seat set isSeatRsv = 1 where seatName = ?and movieUid =?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, seat_name);
			pst.setInt(2, movie_Uid);
			// 4. Query ����
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		} // end try~catch!finally
		
	}

	public void seatRvRechange(String seat_name, int movie_Uid) {
		try {

			connection();

			// 3. DB�� ���� Query�� �ۼ�
			String sql = "update seat set isSeatRsv = 0 where seatName = ?and movieUid =?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, seat_name);
			pst.setInt(2, movie_Uid);
			// 4. Query ����
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		} // end try~catch!finally
		
	}

	public int selectSeatUid(String seat_name, int movie_Uid) {
		
		try {
	         connection();
	         String sql = "select seatUid from seat where seatName =? and movieUid=?";
	      
	         pst = conn.prepareStatement(sql);
	         pst.setString(1, seat_name);
	         pst.setInt(2, movie_Uid);
	         // 4.Query ����
	         // DB�� ����� ������ ResultSet ��ü�� ����
	         rs = pst.executeQuery();

	         // 5.ResultSet��ü�� ����� DB ���� ��������
	         if (rs.next()) {
					int getuid = rs.getInt(1);
					return getuid;

					// ����Ʈ�� ȸ����������
					
				}
		}

	       catch (SQLException e) {
	         e.printStackTrace();
	      } finally {// try~catch������ ������� ������ �����ϴ� ����

	         // 6. DB���� ���ᰳü ����
	         // -> �������� ���� ��� ����� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
	         close();
	         }
	
		return 0;
	}

	public int selectSetrv(String seat_name, int movie_Uid) {
		
		try {
	         connection();
	         String sql = "select isSeatRsv from seat where seatName =? and movieUid=?";
	      
	         pst = conn.prepareStatement(sql);
	         pst.setString(1, seat_name);
	         pst.setInt(2, movie_Uid);
	         // 4.Query ����
	         // DB�� ����� ������ ResultSet ��ü�� ����
	         rs = pst.executeQuery();

	         // 5.ResultSet��ü�� ����� DB ���� ��������
	         if (rs.next()) {
					int getrv = rs.getInt(1);
					return getrv;

					// ����Ʈ�� ȸ����������
					
				}
		}

	       catch (SQLException e) {
	         e.printStackTrace();
	      } finally {// try~catch������ ������� ������ �����ϴ� ����

	         // 6. DB���� ���ᰳü ����
	         // -> �������� ���� ��� ����� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
	         close();
	         }
		
		
		
		return 0;
	}

	

}
