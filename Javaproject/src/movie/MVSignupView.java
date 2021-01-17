package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MVSignupView {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	private JTextField text_pwCheck;
	private JTextField text_name;
	private JTextField text_phoneNum;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVSignupView window = new MVSignupView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MVSignupView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 53, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 560, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 448, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		text_id = new JTextField();
		text_id.addMouseListener(new MouseAdapter() {
			@Override
			//저장하기 위한 코드 
			public void mouseClicked(MouseEvent e) {
			
				
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, text_id, 23, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_id, -140, SpringLayout.EAST, panel);
		panel.add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, text_pw, 83, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_pw, -140, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_id, -15, SpringLayout.NORTH, text_pw);
		panel.add(text_pw);
		text_pw.setColumns(10);
		
		text_pwCheck = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, text_pwCheck, 152, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_pw, -24, SpringLayout.NORTH, text_pwCheck);
		sl_panel.putConstraint(SpringLayout.EAST, text_pwCheck, 0, SpringLayout.EAST, text_id);
		sl_panel.putConstraint(SpringLayout.WEST, text_pwCheck, 0, SpringLayout.WEST, text_id);
		panel.add(text_pwCheck);
		text_pwCheck.setColumns(10);
		
		text_name = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, text_name, 219, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_name, -125, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_pwCheck, -22, SpringLayout.NORTH, text_name);
		sl_panel.putConstraint(SpringLayout.WEST, text_name, 156, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_name, 0, SpringLayout.EAST, text_id);
		panel.add(text_name);
		text_name.setColumns(10);
		
		text_phoneNum = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, text_phoneNum, 28, SpringLayout.SOUTH, text_name);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_phoneNum, -52, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_phoneNum, -140, SpringLayout.EAST, panel);
		panel.add(text_phoneNum);
		text_phoneNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		sl_panel.putConstraint(SpringLayout.WEST, text_id, 55, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 47, SpringLayout.NORTH, panel);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -449, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, text_pw, 55, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 99, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 15, SpringLayout.NORTH, text_pwCheck);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 15, SpringLayout.NORTH, text_name);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		sl_panel.putConstraint(SpringLayout.WEST, text_phoneNum, 55, SpringLayout.EAST, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 15, SpringLayout.NORTH, text_phoneNum);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 65, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, lblNewLabel);
		panel.add(lblNewLabel_4);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//저장하기
				String id = text_id.getText();
				String pw = text_pw.getText();
				String name  = text_name.getText();
				String phoneNum = text_phoneNum.getText();
				
				
				CustomerDAO dao = new CustomerDAO();
				dao.addCustomer(new CustomerVO(name, id, pw, phoneNum));
				
				
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -3, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
	}
}