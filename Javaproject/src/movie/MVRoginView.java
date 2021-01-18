package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class MVRoginView{

	private JFrame frame;
	private JTextField text_password;
	private JTextField text_id;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVRoginView window = new MVRoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MVRoginView() {
		initialize();
	}

	private void initialize() {
		CustomerDAO customer = new CustomerDAO();
		frame = new JFrame("편안한 영예씨");
		frame.getContentPane().setBackground(new Color(0, 102, 204));
		frame.setBounds(100, 100, 359, 589);
		frame.setLocationRelativeTo(null);    // 창이 가운데에서 열리게 하는 명령어
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, frame.getContentPane());
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 333, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btn_signup = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sl_panel.putConstraint(SpringLayout.NORTH, btn_signup, 403, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btn_signup, -49, SpringLayout.EAST, panel);
		btn_signup.setBackground(Color.WHITE);
		btn_signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new MVSignupView().main(null);;
			}
		});
		panel.add(btn_signup);
		
		JButton btn_rogin = new JButton("\uB85C\uADF8\uC778");
		sl_panel.putConstraint(SpringLayout.NORTH, btn_rogin, 403, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btn_rogin, -87, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btn_signup, 21, SpringLayout.EAST, btn_rogin);
		sl_panel.putConstraint(SpringLayout.SOUTH, btn_signup, 40, SpringLayout.NORTH, btn_rogin);
		sl_panel.putConstraint(SpringLayout.WEST, btn_rogin, 45, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btn_rogin, -174, SpringLayout.EAST, panel);
		btn_rogin.setBackground(Color.WHITE);
		btn_rogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userId = text_id.getText();
				String userPw = text_password.getText();
				CustomerVO vo = new CustomerVO();
				vo.setUserId(userId);
				vo.setUserPw(userPw);
				vo = customer.selectCustomerByUserIdAndPw(vo);
				System.out.println(vo);
				System.out.println(text_id.getText());
				
				if(userId == null || "".equals(userId) || userPw == null || "".equals(userPw)) {
					JOptionPane.showMessageDialog(null, "Please enter your ID or PASSWORD");
				}else {
					if(vo.getUserUid() != 0) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						panel.setVisible(false); // 로그인 성공시 더이상 로그인 패널이 보이지 않음
					}else {
						JOptionPane.showMessageDialog(null, "you failed to log in");
					}
				}
			}
		});
		panel.add(btn_rogin);
		
		text_password = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, text_password, 313, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, text_password, 81, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_password, -177, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_password, -86, SpringLayout.EAST, panel);
		panel.add(text_password);
		text_password.setColumns(10);
		
		text_id = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, text_id, 234, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, text_id, 0, SpringLayout.WEST, text_password);
		sl_panel.putConstraint(SpringLayout.EAST, text_id, -86, SpringLayout.EAST, panel);
		panel.add(text_id);
		text_id.setColumns(10);
		
		JLabel lbl_PassWord = new JLabel("PassWord");
		sl_panel.putConstraint(SpringLayout.SOUTH, text_id, -18, SpringLayout.NORTH, lbl_PassWord);
		sl_panel.putConstraint(SpringLayout.WEST, lbl_PassWord, 0, SpringLayout.WEST, text_password);
		sl_panel.putConstraint(SpringLayout.SOUTH, lbl_PassWord, -6, SpringLayout.NORTH, text_password);
		panel.add(lbl_PassWord);
		
		JLabel lbl_ID = new JLabel("ID");
		sl_panel.putConstraint(SpringLayout.WEST, lbl_ID, 0, SpringLayout.WEST, text_password);
		sl_panel.putConstraint(SpringLayout.SOUTH, lbl_ID, -6, SpringLayout.NORTH, text_id);
		sl_panel.putConstraint(SpringLayout.EAST, lbl_ID, 115, SpringLayout.WEST, panel);
		panel.add(lbl_ID);
		
		ImageIcon rogin_icon = new ImageIcon("imgs/ti.png");
		
		JLabel lblNewLabel = new JLabel(rogin_icon);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 95, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, text_password);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -24, SpringLayout.NORTH, lbl_ID);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, text_password);
		panel.add(lblNewLabel);
		
		
		
	}
}