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
	
	public ArrayList<MovieVO> selectmovieall() {
	      ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	      //DB������
	      
	      
	      //��ü ������ ��ȸ�ϴ� ����� �����Ͻÿ�.
	      try {
	         //1~2
	         connection();
	         // 3.DB�� ���� Query �ۼ�
	         String sql = "select * from movie";
	         pst = conn.prepareStatement(sql);

	         // 4.Query ����
	         // DB�� ����� ������ ResultSet ��ü�� ����
	         rs = pst.executeQuery();

	         // 5.ResultSet��ü�� ����� DB ���� ��������
	        
	         while (rs.next()) {
	            int movieUid = rs.getInt(1);
	            String movieTitle = rs.getString(2);
	            String movieTime = rs.getString(3);
	            
	            
	            
	            //����Ʈ�� ȸ������ ���� 
	            list.add(new MovieVO(movieUid,movieTitle,movieTime));
	           
	         }

	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {// try~catch������ ������� ������ �����ϴ� ����

	         // 6. DB���� ���ᰳü ����
	         // -> �������� ���� ��� ����� ��ü���� ���̰� �Ǹ鼭 DB���ῡ ������ �߻�
	         close();
	         }
	      
	      
	      //DB��������
	      
	      return list;
	      
	   }
	
	


}
