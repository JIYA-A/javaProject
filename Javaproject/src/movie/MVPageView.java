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
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MVPageView {

	private JFrame frame;
	private DefaultTableModel model; //JTable 데이터 추가, 삭제
	private int row; //선택한 행의 위치
	private JTable rv_table;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVPageView window = new MVPageView();
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

	
	private void initialize() {
		PayDAO dao = new PayDAO();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 70, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 434, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("My \uC608\uB9E4 \uB0B4\uC5ED");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 53, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 66, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 28, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 48, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 240, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -53, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		
		ArrayList<PayVO> rv = dao.selectPayAll();
		String[] columName = {"영화","시간","총 금액"};
		String[][] rowDatas = new String[rv.size()][columName.length];
		for (int i = 0; i < rowDatas.length; i++) { //row
			for (int j = 0; j < columName.length; j++) {//열
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
		
		//1차원 배열 : 컬럼, 2차원배열 : 데이터
		rv_table = new JTable(model);
		scrollPane.setViewportView(rv_table);
		//JTable 데이터초기화
		//DAO,AO -> list에 넣어 배열로 구성 후 출력
		
		
		
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 21, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 48, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 56, SpringLayout.SOUTH, scrollPane);
		
		rv_table = new JTable();
		scrollPane.setViewportView(rv_table);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 381, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton removeBtn = new JButton("\uC608\uB9E4\uCDE8\uC18C");
		sl_panel_1.putConstraint(SpringLayout.WEST, removeBtn, 22, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, removeBtn, -2, SpringLayout.SOUTH, panel_1);
		removeBtn.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      	}
	      });
		removeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = rv_table.getSelectedRow();
				if(n>=0&&n<rv_table.getRowCount()) {
					model.removeRow(n);
					dao.deletePay(n-1);
				}
			
				
			}
		});
		panel_1.add(removeBtn);
		
		JButton btnNewButton = new JButton("\uB418\uB3CC\uC544\uAC00\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new MVRvView().main(null);	
				frame.dispose();
			}
		});
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, removeBtn);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, panel_1);
		panel_1.add(btnNewButton);
	}
}
