package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MVSignup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVSignup window = new MVSignup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MVSignup() {
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
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 23, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField, -140, SpringLayout.EAST, panel);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1, 83, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_1, -140, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField, -15, SpringLayout.NORTH, textField_1);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 152, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_1, -24, SpringLayout.NORTH, textField_2);
		sl_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, 219, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_3, -125, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_2, -22, SpringLayout.NORTH, textField_3);
		sl_panel.putConstraint(SpringLayout.WEST, textField_3, 156, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, 28, SpringLayout.SOUTH, textField_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_4, -52, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, -140, SpringLayout.EAST, panel);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		sl_panel.putConstraint(SpringLayout.WEST, textField, 55, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 47, SpringLayout.NORTH, panel);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -449, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1, 55, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 99, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 15, SpringLayout.NORTH, textField_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 15, SpringLayout.NORTH, textField_3);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		sl_panel.putConstraint(SpringLayout.WEST, textField_4, 55, SpringLayout.EAST, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 15, SpringLayout.NORTH, textField_4);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 65, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, lblNewLabel);
		panel.add(lblNewLabel_4);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
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