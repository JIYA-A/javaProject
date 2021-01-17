package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class MVPayView {

	private JFrame frame;
	private CardLayout cardLayout; //카드레이아웃 형성
	private JPanel fir_panel, sec_panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVPayView window = new MVPayView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MVPayView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		//cardlayot 객체 생성
		cardLayout = new CardLayout();
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 99, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 386, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel par = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 55, SpringLayout.WEST, par);
		springLayout.putConstraint(SpringLayout.NORTH, par, 145, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, par, -44, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, par);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn1 = new JButton("\uACC4\uC88C\uC774\uCCB4");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//첫번째 패널 출력
				//show(패널들을 관리하는 부모패널, 출력할 패널 이름);
				cardLayout.show(par, "fir");
				
				
				
			}
		});
		panel.add(btn1);
		
		JButton btn2 = new JButton("\uCE74\uB4DC\uACB0\uC81C");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(par, "sec");
				
				
			}
		});
		panel.add(btn2);
		springLayout.putConstraint(SpringLayout.WEST, par, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, par, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(par);
		
		
		par.setLayout(cardLayout);
		
		fir_panel = new JPanel();
		par.add(fir_panel, "fir");
		SpringLayout sl_fir_panel = new SpringLayout();
		fir_panel.setLayout(sl_fir_panel);
		
		JLabel lblNewLabel = new JLabel("\uACC4\uC88C\uC815\uBCF4 \uC785\uB825");
		sl_fir_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 26, SpringLayout.NORTH, fir_panel);
		sl_fir_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -170, SpringLayout.EAST, fir_panel);
		fir_panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\uC740\uD589\uC120\uD0DD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		sl_fir_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 63, SpringLayout.NORTH, fir_panel);
		sl_fir_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 81, SpringLayout.WEST, fir_panel);
		fir_panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC785\uAE08\uC790\uBA85");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		sl_fir_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 18, SpringLayout.SOUTH, lblNewLabel_2);
		sl_fir_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel_2);
		fir_panel.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		sl_fir_panel.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblNewLabel_2);
		sl_fir_panel.putConstraint(SpringLayout.WEST, comboBox, 22, SpringLayout.EAST, lblNewLabel_2);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uAD6D\uBBFC\uC740\uD589 0000-00-000", "\uB18D\uD611\uC740\uD589 111-1111-1111-11", "\uAD11\uC8FC\uC740\uD589 22222-222-2222"}));
		fir_panel.add(comboBox);
		
		textField = new JTextField();
		sl_fir_panel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_fir_panel.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, comboBox);
		fir_panel.add(textField);
		textField.setColumns(10);
		
		sec_panel = new JPanel();
		par.add(sec_panel, "sec");
		SpringLayout sl_sec_panel = new SpringLayout();
		sec_panel.setLayout(sl_sec_panel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCE74\uB4DC\uC815\uBCF4 \uC785\uB825");
		sl_sec_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 33, SpringLayout.NORTH, sec_panel);
		sl_sec_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -171, SpringLayout.EAST, sec_panel);
		sec_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("\uCE74\uB4DC\uC0AC");
		sl_sec_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 64, SpringLayout.NORTH, sec_panel);
		sl_sec_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 74, SpringLayout.WEST, sec_panel);
		sec_panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uCE74\uB4DC\uBC88\uD638");
		sl_sec_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 20, SpringLayout.SOUTH, lblNewLabel_4);
		sl_sec_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel_4);
		sec_panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uAC00\uC785\uC790\uBA85");
		sl_sec_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 19, SpringLayout.SOUTH, lblNewLabel_5);
		sl_sec_panel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_4);
		sec_panel.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		sl_sec_panel.putConstraint(SpringLayout.NORTH, comboBox_1, -3, SpringLayout.NORTH, lblNewLabel_4);
		sl_sec_panel.putConstraint(SpringLayout.WEST, comboBox_1, 0, SpringLayout.WEST, lblNewLabel_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uAD6D\uBBFC", "\uD604\uB300", "\uC0BC\uC131", "\uB18D\uD611"}));
		sec_panel.add(comboBox_1);
		
		textField_1 = new JTextField();
		sl_sec_panel.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_sec_panel.putConstraint(SpringLayout.WEST, textField_1, 31, SpringLayout.EAST, lblNewLabel_5);
		sec_panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_sec_panel.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_sec_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_1);
		sec_panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, par);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, -399, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 34, SpringLayout.SOUTH, par);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -23, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C \uD655\uC778");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//클릭 시, 결제완료창을 띄우기
				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.", "", JOptionPane.PLAIN_MESSAGE);
				//예매하기 창으로 돌아가기
				new MVRvView().main(null);
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, 139, SpringLayout.WEST, panel_1);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 63, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 433, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
	}
}
