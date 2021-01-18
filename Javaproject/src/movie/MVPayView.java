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
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;

public class MVPayView {

	private JFrame frame;
	private CardLayout cardLayout; // 카드레이아웃 형성
	private JPanel fir_panel, sec_panel;
	private JTextField textField;
	private JTextField textCardNumber;
	private JTextField textField_2;

	private JLabel lbl_moiveName, lbl_movieTime, lbl_total;
	private int pos = 0;

//	public static String movieNm;
//	public static String time;
//	public static int totalPrice;
	public String movieNm;
	public String time;
	public int totalPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String movieNm, String time, int totalPrice) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVPayView window = new MVPayView(movieNm, time, totalPrice);
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
	public MVPayView(String movieNm, String time, int totalPrice) {
		this.movieNm = movieNm;
		this.time = time;
		this.totalPrice = totalPrice;

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PayDAO dao = new PayDAO();
		MovieDAO ad = new MovieDAO();

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 349, 453);
		frame.setLocationRelativeTo(null);    // 창이 가운데에서 열리게 하는 명령어
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		// cardlayot 객체 생성
		cardLayout = new CardLayout();

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);

		JPanel par = new JPanel();
		par.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, par);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, par);
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, par);
		springLayout.putConstraint(SpringLayout.NORTH, par, 210, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, par, 323, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, par, -44, SpringLayout.SOUTH, frame.getContentPane());
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btn1 = new JButton("\uACC4\uC88C\uC774\uCCB4");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// 첫번째 패널 출력
				// show(패널들을 관리하는 부모패널, 출력할 패널 이름);
				cardLayout.show(par, "fir");

			}
		});
		panel.add(btn1);

		JButton btn2 = new JButton("\uC2E0\uC6A9/\uCCB4\uD06C\uCE74\uB4DC");
		btn2.setBackground(Color.WHITE);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(par, "sec");

			}
		});
		panel.add(btn2);
		springLayout.putConstraint(SpringLayout.WEST, par, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(par);

		par.setLayout(cardLayout);

		fir_panel = new JPanel();
		fir_panel.setBackground(Color.WHITE);
		par.add(fir_panel, "fir");
		SpringLayout sl_fir_panel = new SpringLayout();
		fir_panel.setLayout(sl_fir_panel);

		JLabel lblNewLabel = new JLabel("\uACC4\uC88C\uC815\uBCF4 \uC785\uB825");
		fir_panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("\uC740\uD589\uC120\uD0DD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		fir_panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uC785\uAE08\uC790\uBA85");
		sl_fir_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -13, SpringLayout.NORTH, lblNewLabel_3);
		sl_fir_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -45, SpringLayout.SOUTH, fir_panel);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		fir_panel.add(lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		sl_fir_panel.putConstraint(SpringLayout.WEST, comboBox, 121, SpringLayout.WEST, fir_panel);
		sl_fir_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, -6, SpringLayout.WEST, comboBox);
		sl_fir_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, comboBox);
		sl_fir_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -39, SpringLayout.NORTH, comboBox);
		sl_fir_panel.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblNewLabel_2);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uAD6D\uBBFC\uC740\uD589 0000-00-000",
				"\uB18D\uD611\uC740\uD589 111-1111-1111-11", "\uAD11\uC8FC\uC740\uD589 22222-222-2222" }));
		fir_panel.add(comboBox);

		textField = new JTextField();
		sl_fir_panel.putConstraint(SpringLayout.WEST, textField, 151, SpringLayout.WEST, fir_panel);
		sl_fir_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, -36, SpringLayout.WEST, textField);
		sl_fir_panel.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblNewLabel_3);
		fir_panel.add(textField);
		textField.setColumns(10);

		sec_panel = new JPanel();
		sec_panel.setBackground(Color.WHITE);
		par.add(sec_panel, "sec");
		SpringLayout sl_sec_panel = new SpringLayout();
		sec_panel.setLayout(sl_sec_panel);

		JLabel lblNewLabel_1 = new JLabel("\uCE74\uB4DC\uC815\uBCF4 \uC785\uB825");
		sl_sec_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 25, SpringLayout.NORTH, sec_panel);
		sl_sec_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -118, SpringLayout.EAST, sec_panel);
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
		comboBox_1.setBackground(Color.WHITE);
		sl_sec_panel.putConstraint(SpringLayout.NORTH, comboBox_1, -3, SpringLayout.NORTH, lblNewLabel_4);
		sl_sec_panel.putConstraint(SpringLayout.WEST, comboBox_1, 45, SpringLayout.EAST, lblNewLabel_4);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "\uAD6D\uBBFC\uCE74\uB4DC",
				"\uD604\uB300\uCE74\uB4DC", "\uC0BC\uC131\uCE74\uB4DC", "\uB18D\uD611\uCE74\uB4DC" }));
		sec_panel.add(comboBox_1);

		textCardNumber = new JTextField();
		sl_sec_panel.putConstraint(SpringLayout.NORTH, textCardNumber, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_sec_panel.putConstraint(SpringLayout.WEST, textCardNumber, 31, SpringLayout.EAST, lblNewLabel_5);
		sec_panel.add(textCardNumber);
		textCardNumber.setColumns(10);

		textField_2 = new JTextField();
		sl_sec_panel.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_sec_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textCardNumber);
		sec_panel.add(textField_2);
		textField_2.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, par);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, -299, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -23, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JButton btnNewButton = new JButton("\uACB0\uC81C \uD655\uC778");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, 92, SpringLayout.WEST, panel_1);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 클릭 시, 결제완료창을 띄우기
				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.", "", JOptionPane.PLAIN_MESSAGE);
				// DB저장하기하기기
				
				String cardNumber = textCardNumber.getText();
				dao.addPay(new PayVO(totalPrice, cardNumber, movieNm));
				
				// 예매하기 창으로 돌아가기
				new MVRvView().main(null);	
				frame.dispose();
			}
		});


		

		panel_1.add(btnNewButton);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 255));
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 333, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 49, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -267, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel, 17, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -6, SpringLayout.NORTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel);
		frame.getContentPane().add(panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);

		JLabel lbl_movieName = new JLabel("New label");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lbl_movieName, 24, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_movieName, 35, SpringLayout.WEST, panel_3);
		panel_3.add(lbl_movieName);

		JLabel lbl_movieTime = new JLabel("New label");
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_movieTime, 0, SpringLayout.WEST, lbl_movieName);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lbl_movieTime, -21, SpringLayout.SOUTH, panel_3);
		panel_3.add(lbl_movieTime);

		JLabel lbl_total = new JLabel("New label");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lbl_total, 0, SpringLayout.NORTH, lbl_movieTime);
		sl_panel_3.putConstraint(SpringLayout.EAST, lbl_total, -30, SpringLayout.EAST, panel_3);
		panel_3.add(lbl_total);

		lbl_movieName.setText(movieNm);
		lbl_movieTime.setText(time);
		lbl_total.setText(totalPrice + "");
	}

}
