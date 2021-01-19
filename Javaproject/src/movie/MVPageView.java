package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;



import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

public class MVPageView {

	private JFrame frame;
	private DefaultTableModel model; //JTable ������ �߰�, ����
	private int row; //������ ���� ��ġ
	private JTable rv_table;
	public int user_Uid;
	
	public static void main(int user_Uid) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVPageView window = new MVPageView(user_Uid);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MVPageView() {
		initialize();
	}
	public MVPageView(int user_Uid) {
		this.user_Uid = user_Uid;
		
		initialize();
	}
	
	private void initialize() {
		PayDAO dao = new PayDAO();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 500);
		frame.setLocationRelativeTo(null);    // â�� ������� ������ �ϴ� ��ɾ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 70, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 434, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("\uC608\uB9E4 \uB0B4\uC5ED");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -197, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, -52, SpringLayout.NORTH, scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -25, SpringLayout.NORTH, scrollPane);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 166, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -83, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 48, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -53, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		//���ų���Ȯ��
		
		ArrayList<PayVO> rv = dao.selectPayAll();
		String[] columName = {"��ȭ","�ð�","�� �ݾ�"};
		String[][] rowDatas = new String[rv.size()][columName.length];
		for (int i = 0; i < rowDatas.length; i++) { //row
			for (int j = 0; j < columName.length; j++) {//��
				if(j==0) {
					rowDatas[i][j] = rv.get(i).getMovieName();
				}else if(j==1) {
					rowDatas[i][j] = rv.get(i).getPayDate();
				}else{
					rowDatas[i][j] = rv.get(i).getTotalPrice()+"";
				}
			}
		}
		
		
		
		model = new DefaultTableModel(rowDatas,columName);
		//JTable �������ʱ�ȭ
		//DAO,AO -> list�� �־� �迭�� ���� �� ���
		
		
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 399, SpringLayout.NORTH, frame.getContentPane());
		panel_1.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 48, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 56, SpringLayout.SOUTH, scrollPane);
		
		rv_table = new JTable(model);
		scrollPane.setViewportView(rv_table);
		
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 381, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton removeBtn = new JButton("\uC608\uB9E4\uCDE8\uC18C");
		removeBtn.setBackground(Color.WHITE);
		sl_panel_1.putConstraint(SpringLayout.WEST, removeBtn, 35, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, removeBtn, -2, SpringLayout.SOUTH, panel_1);
		removeBtn.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      	}
	      });
		removeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//�����Ѱ� �����
				row = rv_table.getSelectedRow();
				if(row>=0&&row<rv_table.getRowCount()) {
					model.removeRow(row);
					dao.deletePay(row-1);
				}
				
			}
		});
		panel_1.add(removeBtn);
		
		JButton btnreturn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnreturn.setBackground(Color.WHITE);
		btnreturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MVRvView.main(user_Uid);	
			frame.dispose();
			}
		});
		btnreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnreturn, 0, SpringLayout.NORTH, removeBtn);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnreturn, -28, SpringLayout.EAST, panel_1);
		panel_1.add(btnreturn);
		
		
		ImageIcon page_icon = new ImageIcon("imgs/page.png");
		JLabel lblNewLabel_1 = new JLabel(page_icon);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 6, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -287, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 48, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -7, SpringLayout.NORTH, scrollPane);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	
	}
}
