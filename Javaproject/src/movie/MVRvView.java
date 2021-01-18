package movie;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.nio.file.ClosedDirectoryStreamException;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;

public class MVRvView {

	private JFrame frame;
	public String movieNm;
	public String time;

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
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 720, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JPanel panel_2 = new JPanel() { //패널에 이미지 넣음
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/titi.jpg").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, panel_1);
		panel_1.add(panel_2);

		JPanel panel_3 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 79, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 237, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, -232, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, panel_3);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, -6, SpringLayout.WEST, panel_3);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);

		JLabel lbl_MVm = new JLabel("\uBA85\uB7C9");
		sl_panel_2.putConstraint(SpringLayout.EAST, lbl_MVm, -98, SpringLayout.EAST, panel_2);
		panel_2.add(lbl_MVm);

		JCheckBox Ch1 = new JCheckBox("\uC624\uC804 09:30");
		sl_panel_2.putConstraint(SpringLayout.WEST, Ch1, 64, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, Ch1, -55, SpringLayout.SOUTH, panel_2);
		Ch1.setOpaque(false);
		JCheckBox Ch2 = new JCheckBox("\uC624\uD6C4 13:30");
		sl_panel_2.putConstraint(SpringLayout.NORTH, Ch2, 6, SpringLayout.SOUTH, Ch1);
		sl_panel_2.putConstraint(SpringLayout.WEST, Ch2, 0, SpringLayout.WEST, Ch1);
		Ch2.setOpaque(false);
		JCheckBox Ch3 = new JCheckBox("\uC624\uC804 10:30");
		Ch3.setOpaque(false);
		JCheckBox Ch4 = new JCheckBox("\uC624\uD6C4 14:30");
		Ch4.setOpaque(false);
		JCheckBox Ch5 = new JCheckBox("\uC624\uC804 11:00");
		Ch5.setOpaque(false);
		JCheckBox Ch6 = new JCheckBox("\uC624\uD6C4 12:30");
		Ch6.setOpaque(false);
		Ch2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "명량";
				time = "오전 09:30";

				Ch1.setSelected(false);
				Ch3.setSelected(false);
				Ch4.setSelected(false);
				Ch5.setSelected(false);
				Ch6.setSelected(false);

			}
		});

		Ch1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "명량";
				time = "오후 13:30";

				Ch2.setSelected(false);
				Ch3.setSelected(false);
				Ch4.setSelected(false);
				Ch5.setSelected(false);
				Ch6.setSelected(false);
			}

		});
		panel_2.add(Ch1);
		panel_2.add(Ch2);
		panel_1.add(panel_3);

		JPanel panel_4 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_4, 0, SpringLayout.NORTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_4, 6, SpringLayout.EAST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_4, -68, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_4, -10, SpringLayout.EAST, panel_1);
		SpringLayout sl_panel_3 = new SpringLayout();
		sl_panel_3.putConstraint(SpringLayout.SOUTH, Ch3, -50, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, Ch4, 6, SpringLayout.SOUTH, Ch3);
		sl_panel_3.putConstraint(SpringLayout.WEST, Ch4, 66, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, Ch4, -21, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, Ch4, -36, SpringLayout.EAST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, Ch3, -66, SpringLayout.EAST, panel_3);
		panel_3.setLayout(sl_panel_3);

		JLabel lbl_MVGuk = new JLabel("\uADF9\uD55C\uC9C1\uC5C5");
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_MVGuk, 77, SpringLayout.WEST, panel_3);
		panel_3.add(lbl_MVGuk);

		Ch3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "극한직업";
				time = "오전 10:30";

				Ch1.setSelected(false);
				Ch2.setSelected(false);
				Ch4.setSelected(false);
				Ch5.setSelected(false);
				Ch6.setSelected(false);
			}
		});
		panel_3.add(Ch3);

		Ch4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "극한직업";
				time = "오후 14:30";

				Ch1.setSelected(false);
				Ch2.setSelected(false);
				Ch3.setSelected(false);
				Ch5.setSelected(false);
				Ch6.setSelected(false);
			}
		});
		panel_3.add(Ch4);
		panel_1.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		sl_panel_4.putConstraint(SpringLayout.NORTH, Ch6, 6, SpringLayout.SOUTH, Ch5);
		sl_panel_4.putConstraint(SpringLayout.WEST, Ch6, 0, SpringLayout.WEST, Ch5);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, Ch6, -21, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, Ch6, 15, SpringLayout.EAST, Ch5);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, Ch5, -50, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, Ch5, -65, SpringLayout.EAST, panel_4);
		panel_4.setLayout(sl_panel_4);

		JLabel lbl_MVSin = new JLabel("\uC2E0\uACFC\uD568\uAED8-\uC8C4\uC640\uBC8C");
		sl_panel_4.putConstraint(SpringLayout.EAST, lbl_MVSin, 0, SpringLayout.EAST, Ch5);
		panel_4.add(lbl_MVSin);

		Ch5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "신과함께-죄와벌";
				time = "오전 11:00";

				Ch1.setSelected(false);
				Ch2.setSelected(false);
				Ch3.setSelected(false);
				Ch4.setSelected(false);
				Ch6.setSelected(false);

			}
		});
		panel_4.add(Ch5);

		Ch6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "신과함께-죄와벌";
				time = "오전 12:30";

				Ch1.setSelected(false);
				Ch2.setSelected(false);
				Ch3.setSelected(false);
				Ch4.setSelected(false);
				Ch5.setSelected(false);

			}
		});
		panel_4.add(Ch6);

		JButton btnNewButton = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		
		ImageIcon movie_m_icon = new ImageIcon("imgs/mo_m.jpg");
		JLabel lblNewLabel_1 = new JLabel(movie_m_icon);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 54, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -30, SpringLayout.NORTH, Ch1);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lbl_MVm, -18, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1, 221, SpringLayout.WEST, panel_2);
		panel_2.add(lblNewLabel_1);
		
		ImageIcon movie_s_icon = new ImageIcon("imgs/mo_s.jpg");
		JLabel lblNewLabel_2 = new JLabel( movie_s_icon);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lbl_MVSin, -14, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 52, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -27, SpringLayout.NORTH, Ch5);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, lblNewLabel_2, 216, SpringLayout.WEST, panel_4);
		panel_4.add(lblNewLabel_2);
		btnNewButton.setBackground(Color.WHITE);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, panel_1);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MVPageView().main(null);

				frame.dispose();
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 28, SpringLayout.NORTH, panel_1);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC601\uD654\uC608\uB9E4");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_3, -29, SpringLayout.NORTH, btnNewButton_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_1, 294, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -10, SpringLayout.SOUTH, panel_1);
		
		
		
		
		ImageIcon movie_g_icon = new ImageIcon("imgs/mo_g.jpg");
		JLabel lblNewLabel = new JLabel(movie_g_icon);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel, 50, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblNewLabel, -31, SpringLayout.NORTH, Ch3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lbl_MVGuk, -11, SpringLayout.NORTH, lblNewLabel);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblNewLabel, 215, SpringLayout.WEST, panel_3);
		panel_3.add(lblNewLabel);
		
		
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MVSeatView.main(movieNm, time);

				frame.dispose();
			}
		});
		panel_1.add(btnNewButton_1);
	}

	private void add(JPanel panel_5) {
		// TODO Auto-generated method stub

	}
}
