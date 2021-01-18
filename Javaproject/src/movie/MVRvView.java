package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MVRvView {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVRvView window = new MVRvView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MVRvView() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 59, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 589, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 466, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btn_Mypage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_Mypage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MVPageView().main(null);
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btn_Mypage, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btn_Mypage, -21, SpringLayout.EAST, panel);
		panel.add(btn_Mypage);
		frame.getContentPane().add(panel_1);
		
		JButton btn_MVgo = new JButton("\uC601\uD654\uC608\uB9E4");
		btn_MVgo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MVSeatView().main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btn_MVgo, 25, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, btn_MVgo, 250, SpringLayout.WEST, frame.getContentPane());
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, 426, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, 195, SpringLayout.WEST, panel_1);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 6, SpringLayout.EAST, panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lbl_MVm = new JLabel("\uBA85\uB7C9");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lbl_MVm, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lbl_MVm, 78, SpringLayout.WEST, panel_2);
		panel_2.add(lbl_MVm);
		
		JComboBox comboBox = new JComboBox();
		sl_panel_2.putConstraint(SpringLayout.SOUTH, comboBox, -28, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox, -48, SpringLayout.EAST, panel_2);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC624\uC804 09:30", "\uC624\uC804 11:30", "\uC624\uD6C4 13:45", "\uC624\uD6C4 16:30"}));
		panel_2.add(comboBox);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, 426, SpringLayout.NORTH, panel_1);
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, -6, SpringLayout.WEST, panel_4);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JLabel lbl_MVGuk = new JLabel("\uADF9\uD55C\uC9C1\uC5C5");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lbl_MVGuk, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_MVGuk, 69, SpringLayout.WEST, panel_3);
		panel_3.add(lbl_MVGuk);
		
		JComboBox comboBox_1 = new JComboBox();
		sl_panel_3.putConstraint(SpringLayout.WEST, comboBox_1, 52, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, comboBox_1, -28, SpringLayout.SOUTH, panel_3);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC624\uC804 10:30", "\uC624\uC804 11:30", "\uC624\uD6C4 14:45", "\uC624\uD6C4 17:30"}));
		panel_3.add(comboBox_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_4, 400, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_4, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_4, 426, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_4, -10, SpringLayout.EAST, panel_1);
		panel_1.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel lbl_MVSin = new JLabel("\uC2E0\uACFC\uD568\uAED8-\uC8C4\uC640\uBC8C");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lbl_MVSin, 10, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lbl_MVSin, 44, SpringLayout.WEST, panel_4);
		panel_4.add(lbl_MVSin);
		
		JComboBox comboBox_2 = new JComboBox();
		sl_panel_4.putConstraint(SpringLayout.SOUTH, comboBox_2, -29, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, comboBox_2, 0, SpringLayout.EAST, lbl_MVSin);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uC624\uC804 11:20", "\uC624\uD6C4 13:30", "\uC624\uD6C4 15:45", "\uC624\uD6C4 17:30"}));
		panel_4.add(comboBox_2);
		frame.getContentPane().add(btn_MVgo);
	}
}
