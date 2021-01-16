package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MVRoginView {

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
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 333, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btn_signup = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sl_panel.putConstraint(SpringLayout.SOUTH, btn_signup, -69, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btn_signup, -113, SpringLayout.EAST, panel);
		panel.add(btn_signup);
		
		JButton btn_rogin = new JButton("\uB85C\uADF8\uC778");
		sl_panel.putConstraint(SpringLayout.SOUTH, btn_rogin, -130, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, btn_signup, 21, SpringLayout.SOUTH, btn_rogin);
		sl_panel.putConstraint(SpringLayout.WEST, btn_signup, 0, SpringLayout.WEST, btn_rogin);
		sl_panel.putConstraint(SpringLayout.WEST, btn_rogin, 106, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btn_rogin, -113, SpringLayout.EAST, panel);
		panel.add(btn_rogin);
		
		text_password = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, btn_rogin, 103, SpringLayout.SOUTH, text_password);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_password, -273, SpringLayout.SOUTH, panel);
		panel.add(text_password);
		text_password.setColumns(10);
		
		text_id = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, text_password, 0, SpringLayout.EAST, text_id);
		sl_panel.putConstraint(SpringLayout.NORTH, text_id, 150, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, text_id, -340, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, text_password, 27, SpringLayout.SOUTH, text_id);
		sl_panel.putConstraint(SpringLayout.WEST, text_password, 0, SpringLayout.WEST, text_id);
		sl_panel.putConstraint(SpringLayout.WEST, text_id, 81, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, text_id, -86, SpringLayout.EAST, panel);
		panel.add(text_id);
		text_id.setColumns(10);
	}

}