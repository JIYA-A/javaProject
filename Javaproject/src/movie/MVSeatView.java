package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class MVSeatView {

	private JFrame frame;
	private JButton[][] buttons;

	public String movieNm;
	public String time;
	public int totalPrice;
	public int user_Uid;
	public int seat_Uid;

	private int num;
	private int count = 0;
	private int value1 = 0;
	private int value2 = 0;
	private int value3 = 0;

	public static void main(String movieNm, String time, int user_Uid) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVSeatView window = new MVSeatView(movieNm, time, user_Uid);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MVSeatView(String movieNm, String time, int user_Uid) {
		this.movieNm = movieNm;
		this.time = time;
		this.user_Uid = user_Uid;
		initialize();
	}

	private void initialize() {
		SeatDAO dao = new SeatDAO();
		frame = new JFrame();

		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 800, 578);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, frame.getContentPane());
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		panel_1.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 209, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JLabel lblNewLabel_3 = new JLabel("SCREEN");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_3, 530, SpringLayout.WEST, panel_1);
		lblNewLabel_3.setBackground(Color.WHITE);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_3, 93, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -379, SpringLayout.SOUTH, panel_1);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);

		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 64, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, 555, SpringLayout.WEST, panel_1);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 6, 0, 0));

		JLabel lblNewLabel_6 = new JLabel("A");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 167, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_6, -17, SpringLayout.WEST, panel_3);
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("B");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_7, 25, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_7, -17, SpringLayout.WEST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_7);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, -46, SpringLayout.NORTH, lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("C");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_8, 25, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_8, -17, SpringLayout.WEST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_7, -42, SpringLayout.NORTH, lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("D");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_9, 25, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_9, -12, SpringLayout.WEST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_8, -34, SpringLayout.NORTH, lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("E");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_10, 25, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_10, -12, SpringLayout.WEST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_9, -37, SpringLayout.NORTH, lblNewLabel_10);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_10, -86, SpringLayout.SOUTH, panel_1);
		lblNewLabel_10.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("1            2            3            4            5            6");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_11, 469, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, -6, SpringLayout.NORTH, lblNewLabel_11);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_11, 104, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_11, 0, SpringLayout.EAST, panel_3);
		lblNewLabel_11.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_11);

		// JButton 생성
		buttons = new JButton[5][6];
		boolean[][] buttonCheck = new boolean[5][6]; // boolean 타입으로 선언
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				buttonCheck[i][j] = false;
				// 초기값으로 모두 false(버튼을 누르지 않은 상태)
			}
		}

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				final int row = i;
				final int col = j;
		
				ImageIcon seat_icon = new ImageIcon("imgs/sseat.jpg");
				ImageIcon seatrv_icon = new ImageIcon("imgs/ssseat.jpg");
				buttons[i][j] = new JButton(seat_icon); // 이미지
				buttons[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println(row + "," + col);
						switch (movieNm) {
						case "명량":
							switch (time) {
							case "9:30":
								switch (row) {
								case 0:
									switch (col) {
									case 1:
										
										break;

									default:
										break;
									}

									break;
								case 1:

									break;
								case 2:

									break;
								case 3:

									break;
								case 4:

									break;
								case 5:

									break;

								default:
									break;
								}

								break;
							case "13:30":

								break;

							default:
								break;
							}
							break;
						case "극한직업":
							break;
						case "신과함께-죄와벌":
							break;
						default:
							break;
						}
						// type이 boolean이면 앞에 !을 붙이면 해당 값의 반대라는 의미 true면 false, false면 true 일종의 스위치 처럼
						// 작동함
						buttonCheck[row][col] = !buttonCheck[row][col];

						System.out.println(buttonCheck[row][col]);
						if (buttonCheck[row][col]) {
							// 색깔 바꿈 ON
							buttons[row][col].setIcon(seatrv_icon);
							count++;
						} else {
							// 색깔 바꿈 OFF
							buttons[row][col].setIcon(seat_icon);
							count--;
						}
					}
				});
			}
		}

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				panel_3.add(buttons[i][j]);
			}
		}

		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblNewLabel = new JLabel("\uCCAD\uC18C\uB144");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 76, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -283, SpringLayout.SOUTH, panel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC131\uC778");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -81, SpringLayout.EAST, panel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uC5B4\uB9B0\uC774");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -200, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);

		// comboBox 생성
		JComboBox comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 162, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, comboBox);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 68, SpringLayout.WEST, panel);
		comboBox.addMouseListener(new MouseAdapter() {

		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85" }));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
				value1 = comboBox.getSelectedIndex();
				System.out.println("값" + value1);
			}
		});
		panel.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, lblNewLabel);
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85" }));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_1.getSelectedItem());
				value2 = comboBox_1.getSelectedIndex();
				System.out.println("값" + value2);
			}
		});
		panel.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_2, 0, SpringLayout.EAST, lblNewLabel);
		comboBox_2.setModel(new DefaultComboBoxModel(
				new String[] { "0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85" }));
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_2.getSelectedItem());
				value3 = comboBox_2.getSelectedIndex();
				System.out.println("값" + value3);
			}
		});
		panel.add(comboBox_2);

		JButton btnNewButton_30 = new JButton("\uACB0\uC81C\uD558\uAE30");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_30, -28, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_30, -55, SpringLayout.EAST, panel);
		btnNewButton_30.setBackground(Color.WHITE);
		btnNewButton_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int sum = value1 + value2 + value3;
				System.out.println("count : " + count);
				System.out.println("합계 : " + sum);
				totalPrice = value1 * 10000 + value2 * 8000 + value3 * 5000;
				if (sum == count) {
					new MVPayView().main(movieNm, time, totalPrice, user_Uid);
					frame.dispose();
				} else if (count > sum) {
					JOptionPane.showMessageDialog(null, "선택한 인원보다 많습니다.", "", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "선택한 인원보다 적습니다.", "", JOptionPane.PLAIN_MESSAGE);
				}
//				MVPayView pay = new MVPayView();
//				pay.movieNm = "명량";
//				pay.time = "08:00";
//				pay.totalPrice = 12000;
			}
		});
		panel.add(btnNewButton_30);

		JLabel lblNewLabel_4 = new JLabel("\uB0A8\uC740 \uC790\uC11D");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, comboBox);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -101, SpringLayout.SOUTH, panel);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("New label");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 6, SpringLayout.SOUTH, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, comboBox);
		panel.add(lblNewLabel_5);
	}
}
