package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;

public class MVSeatView {

	private JFrame frame;
	private JButton[][] buttons;
	
	public String movieNm;
	public String time;
	public int totalPrice;
	
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
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 209, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 58, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -6, SpringLayout.NORTH, panel_2);
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 363, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -10, SpringLayout.SOUTH, frame.getContentPane());
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("SCREEN");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 40, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -236, SpringLayout.SOUTH, panel_1);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_3, 90, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_3, 446, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, -18, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, 555, SpringLayout.WEST, panel_1);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 6, 0, 0));
		
		//JButton 생성
		buttons = new JButton[5][6];
		
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				final int row = i;
				final int col = j;
				
				buttons[i][j] = new JButton(j+"번 좌석"); //이미지 
				buttons[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println(row+","+col);
					}
				});
			}
		}

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				panel_3.add(buttons[i][j]);
			}
		}
		
//		JButton btnNewButton = new JButton("New button");
//		panel_3.add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("New button");
//		panel_3.add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("New button");
//		panel_3.add(btnNewButton_2);
//		
//		JButton btnNewButton_12 = new JButton("New button");
//		panel_3.add(btnNewButton_12);
//		
//		JButton btnNewButton_16 = new JButton("New button");
//		panel_3.add(btnNewButton_16);
//		
//		JButton btnNewButton_25 = new JButton("New button");
//		panel_3.add(btnNewButton_25);
//		
//		JButton btnNewButton_20 = new JButton("New button");
//		panel_3.add(btnNewButton_20);
//		
//		JButton btnNewButton_3 = new JButton("New button");
//		panel_3.add(btnNewButton_3);
//		
//		JButton btnNewButton_4 = new JButton("New button");
//		panel_3.add(btnNewButton_4);
//		
//		JButton btnNewButton_5 = new JButton("New button");
//		panel_3.add(btnNewButton_5);
//		
//		JButton btnNewButton_6 = new JButton("New button");
//		panel_3.add(btnNewButton_6);
//		
//		JButton btnNewButton_13 = new JButton("New button");
//		panel_3.add(btnNewButton_13);
//		
//		JButton btnNewButton_7 = new JButton("New button");
//		panel_3.add(btnNewButton_7);
//		
//		JButton btnNewButton_8 = new JButton("New button");
//		panel_3.add(btnNewButton_8);
//		
//		JButton btnNewButton_9 = new JButton("New button");
//		panel_3.add(btnNewButton_9);
//		
//		JButton btnNewButton_10 = new JButton("New button");
//		panel_3.add(btnNewButton_10);
//		
//		JButton btnNewButton_11 = new JButton("New button");
//		panel_3.add(btnNewButton_11);
//		
//		JButton btnNewButton_14 = new JButton("New button");
//		panel_3.add(btnNewButton_14);
//		
//		JButton btnNewButton_15 = new JButton("New button");
//		panel_3.add(btnNewButton_15);
//		
//		JButton btnNewButton_17 = new JButton("New button");
//		panel_3.add(btnNewButton_17);
//		
//		JButton btnNewButton_18 = new JButton("New button");
//		panel_3.add(btnNewButton_18);
//		
//		JButton btnNewButton_19 = new JButton("New button");
//		panel_3.add(btnNewButton_19);
//		
//		JButton btnNewButton_21 = new JButton("New button");
//		panel_3.add(btnNewButton_21);
//		
//		JButton btnNewButton_22 = new JButton("New button");
//		panel_3.add(btnNewButton_22);
//		
//		JButton btnNewButton_23 = new JButton("New button");
//		panel_3.add(btnNewButton_23);
//		
//		JButton btnNewButton_24 = new JButton("New button");
//		panel_3.add(btnNewButton_24);
//		
//		JButton btnNewButton_26 = new JButton("New button");
//		panel_3.add(btnNewButton_26);
//		
//		JButton btnNewButton_27 = new JButton("New button");
//		panel_3.add(btnNewButton_27);
//		
//		JButton btnNewButton_28 = new JButton("New button");
//		panel_3.add(btnNewButton_28);
//		
//		JButton btnNewButton_29 = new JButton("New button");
//		panel_3.add(btnNewButton_29);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("\uCCAD\uC18C\uB144");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uC778");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 76, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -81, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -322, SpringLayout.SOUTH, panel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC5B4\uB9B0\uC774");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		//comboBox 생성
		JComboBox comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, -81, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 26, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 20, SpringLayout.SOUTH, lblNewLabel_1);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
			}
		});
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 27, SpringLayout.SOUTH, comboBox_1);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 13, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, lblNewLabel);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85"}));
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_2, 0, SpringLayout.EAST, lblNewLabel);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0\uBA85", "1\uBA85", "2\uBA85", "3\uBA85", "4\uBA85", "5\uBA85", "6\uBA85"}));
		panel.add(comboBox_2);
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JButton btnNewButton_30 = new JButton("\uCE74\uB4DC\uACB0\uC81C");
		btnNewButton_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
//				MVPayView pay = new MVPayView();
//				pay.movieNm = "명량";
//				pay.time = "08:00";
//				pay.totalPrice = 12000;
				
				MVPayView.main(movieNm, time, totalPrice);
			}
		});
		panel_2.add(btnNewButton_30);
		
		JPanel panel_4 = new JPanel();
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_30, 0, SpringLayout.NORTH, panel_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_30, 17, SpringLayout.EAST, panel_4);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnNewButton_30, 0, SpringLayout.SOUTH, panel_4);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_30, 167, SpringLayout.EAST, panel_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, panel_4, 151, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, panel_4, -264, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, panel_4, 20, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, panel_4, 63, SpringLayout.NORTH, panel_2);
		panel_2.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("\uB0A8\uC758 \uC88C\uC11D \uC218");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_4, 10, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -10, SpringLayout.SOUTH, panel_4);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_5, 6, SpringLayout.EAST, lblNewLabel_4);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_5, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_5, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_5, 49, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_5, 784, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_5);
	}
}
