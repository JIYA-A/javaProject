package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 412, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 23, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -77, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 386, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 16, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -21, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		panel_1.setBackground(new Color(153, 204, 255));
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		text_id = new JTextField();
		panel.add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, text_id, 0, SpringLayout.WEST, text_pw);
		sl_panel.putConstraint(SpringLayout.EAST, text_id, 0, SpringLayout.EAST, text_pw);
		sl_panel.putConstraint(SpringLayout.WEST, text_pw, 63, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_pw, -73, SpringLayout.EAST, panel);
		panel.add(text_pw);
		text_pw.setColumns(10);
		
		text_pwCheck = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, text_pwCheck, 63, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_pwCheck, -73, SpringLayout.EAST, panel);
		panel.add(text_pwCheck);
		text_pwCheck.setColumns(10);
		
		text_name = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, text_name, 63, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_name, -73, SpringLayout.EAST, panel);
		panel.add(text_name);
		text_name.setColumns(10);
		
		text_phoneNum = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, text_phoneNum, 0, SpringLayout.WEST, text_id);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_phoneNum, -16, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_phoneNum, 0, SpringLayout.EAST, text_id);
		panel.add(text_phoneNum);
		text_phoneNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -277, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, text_id, 6, SpringLayout.SOUTH, lblNewLabel);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 263, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 63, SpringLayout.WEST, panel);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 63, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_pw, -19, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -6, SpringLayout.NORTH, text_pwCheck);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		sl_panel.putConstraint(SpringLayout.SOUTH, text_pwCheck, -18, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, text_id);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -6, SpringLayout.NORTH, text_name);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, 3, SpringLayout.EAST, lblNewLabel_1);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -43, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, text_phoneNum, 6, SpringLayout.SOUTH, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_name, -16, SpringLayout.NORTH, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, text_id);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, lblNewLabel_2);
		panel.add(lblNewLabel_4);
		
		
		ImageIcon signup_icon = new ImageIcon("imgs/signup.png");
		JLabel lblNewLabel_5 = new JLabel(signup_icon);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, lblNewLabel_5);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 26, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 79, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, -322, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_5, -90, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_5);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//저장하기
				
				
				String id = text_id.getText();
				String pw = text_pw.getText();
				String pwCheck = text_pwCheck.getText();
				String name  = text_name.getText();
				String phoneNum = text_phoneNum.getText();
			
					
				
				if (pw.equals(pwCheck)) {
					CustomerDAO dao = new CustomerDAO();
					dao.addCustomer(new CustomerVO(name, id, pw, phoneNum));
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.", "", JOptionPane.PLAIN_MESSAGE);
					new MVRoginView().main(null);
					frame.dispose();
					
					
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다.", "", JOptionPane.PLAIN_MESSAGE);
				
				}
				
				
				
				
				
			}
		});
		SpringLayout sl_panel_1 = new SpringLayout();
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, 64, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -196, SpringLayout.EAST, panel_1);
		panel_1.setLayout(sl_panel_1);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_1, 29, SpringLayout.EAST, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_1, -51, SpringLayout.EAST, panel_1);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MVRoginView().main(null);
				 
		                frame.dispose();
		            


				
			}

		
		});
		panel_1.add(btnNewButton_1);
	}
}