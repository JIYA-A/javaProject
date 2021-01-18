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

public class MVSeatView {

	private JFrame frame;
	private JButton[][] buttons;
	
	public String movieNm;
	public String time;
	public int totalPrice;
	
	private int num;
	private int count =0;
	private int value1 =0;
	private int value2 = 0;
	private int value3 = 0;
	
	public static void main(String movieNm, String time) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVSeatView window = new MVSeatView(movieNm, time);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MVSeatView(String movieNm, String time) {
		this.movieNm = movieNm;
		this.time = time;
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();

		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 800, 578);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 209, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -6, SpringLayout.NORTH, panel_2);
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 460, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -10, SpringLayout.SOUTH, frame.getContentPane());
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("SCREEN");
		lblNewLabel_3.setBackground(Color.WHITE);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_3, 93, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -379, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_3, 449, SpringLayout.WEST, panel_1);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, 555, SpringLayout.WEST, panel_1);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 6, 0, 0));
		
		//JButton 생성
		buttons = new JButton[5][6];
		
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				final int row = i;
				final int col = j;
				
				ImageIcon seat_icon = new ImageIcon("imgs/sseat.jpg");
				ImageIcon seatrv_icon = new ImageIcon("imgs/ssseat.jpg");
				buttons[i][j] = new JButton(seat_icon); //이미지 
				buttons[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println(row+","+col);
						
//						if(buttons){
//							buttons[row][col].setIcon(seat_icon);
//							count--;
//							System.out.println(count);
//							num--;
//						int a = row;
//						int b = col;
//						}
//						buttons[row][col].setIcon(seatrv_icon);
//						count++;
//						num++;
//						System.out.println(count);
						
						
						
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
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uC778");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 76, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -81, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -341, SpringLayout.SOUTH, panel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC5B4\uB9B0\uC774");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -185, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		//comboBox 생성
		JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
		
		});
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 68, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 33, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, lblNewLabel_1);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
				value1 = comboBox.getSelectedIndex();
				System.out.println("값"+value1);
			}
		});
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, lblNewLabel);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85"}));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_1.getSelectedItem());
				value2 = comboBox_1.getSelectedIndex();
				System.out.println("값"+value2);
			}
		});
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_2, 0, SpringLayout.EAST, lblNewLabel);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85"}));
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_2.getSelectedItem());
				value3 = comboBox_2.getSelectedIndex();
				System.out.println("값"+value3);
			}
		});
		panel.add(comboBox_2);
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JButton btnNewButton_30 = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton_30.setBackground(Color.WHITE);
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_30, 23, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_30, 313, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnNewButton_30, -10, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_30, -102, SpringLayout.EAST, panel_2);
		btnNewButton_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int sum = value1+value2+value3;
				System.out.println("합계"+sum);
				totalPrice = value1*10000+value2*8000+value3*5000;
				if (sum == count) {
					new MVPayView(movieNm, time, totalPrice);
					frame.dispose();
				}else if(count>sum){
					JOptionPane.showMessageDialog(null, "선택한 인원보다 많습니다.", "", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "선택한 인원보다 적습니다.", "", JOptionPane.PLAIN_MESSAGE);
				}
//				MVPayView pay = new MVPayView();
//				pay.movieNm = "명량";
//				pay.time = "08:00";
//				pay.totalPrice = 12000;
				
				
			}
		});
		panel_2.add(btnNewButton_30);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		sl_panel_2.putConstraint(SpringLayout.NORTH, panel_4, 23, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, panel_4, 146, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, panel_4, 0, SpringLayout.SOUTH, btnNewButton_30);
		sl_panel_2.putConstraint(SpringLayout.EAST, panel_4, -17, SpringLayout.WEST, btnNewButton_30);
		panel_2.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("\uB0A8\uC740 \uC88C\uC11D \uC218");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_4, 10, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -10, SpringLayout.SOUTH, panel_4);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_5, 5, SpringLayout.EAST, lblNewLabel_4);
		panel_4.add(lblNewLabel_5);
	}
}
