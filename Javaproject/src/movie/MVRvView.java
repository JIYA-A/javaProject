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
import java.awt.Font;
import javax.swing.SwingConstants;

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

		JPanel panel_2 = new JPanel() { //ÆÐ³Î¿¡ ÀÌ¹ÌÁö ³ÖÀ½
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/ti_m.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, panel_1);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/ti_g.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_3, 79, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_3, 237, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_3, -232, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, panel_3);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, -6, SpringLayout.WEST, panel_3);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);

		JLabel lbl_MVm = new JLabel("\uBA85\uB7C9");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lbl_MVm, 21, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lbl_MVm, 88, SpringLayout.WEST, panel_2);
		lbl_MVm.setForeground(Color.WHITE);
		lbl_MVm.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		panel_2.add(lbl_MVm);

		JCheckBox Ch1 = new JCheckBox("\uC624\uC804 09:30");
		Ch1.setForeground(Color.WHITE);
		Ch1.setOpaque(false);
		JCheckBox Ch2 = new JCheckBox("\uC624\uD6C4 13:30");
		sl_panel_2.putConstraint(SpringLayout.WEST, Ch2, 64, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, Ch1, 0, SpringLayout.WEST, Ch2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, Ch1, -6, SpringLayout.NORTH, Ch2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, Ch2, -10, SpringLayout.SOUTH, panel_2);
		Ch2.setForeground(Color.WHITE);
		Ch2.setOpaque(false);
		JCheckBox Ch3 = new JCheckBox("\uC624\uC804 10:30");
		Ch3.setForeground(Color.WHITE);
		Ch3.setOpaque(false);
		JCheckBox Ch4 = new JCheckBox("\uC624\uD6C4 14:30");
		Ch4.setForeground(Color.WHITE);
		Ch4.setOpaque(false);
		JCheckBox Ch5 = new JCheckBox("\uC624\uC804 11:00");
		Ch5.setForeground(Color.WHITE);
		Ch5.setOpaque(false);
		JCheckBox Ch6 = new JCheckBox("\uC624\uD6C4 12:30");
		Ch6.setForeground(Color.WHITE);
		Ch6.setOpaque(false);
		Ch2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "¸í·®";
				time = "¿ÀÀü 09:30";

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

				movieNm = "¸í·®";
				time = "¿ÀÈÄ 13:30";

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

		JPanel panel_4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/ti_s.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_4, 0, SpringLayout.NORTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_4, 6, SpringLayout.EAST, panel_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_4, -68, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_4, -10, SpringLayout.EAST, panel_1);
		SpringLayout sl_panel_3 = new SpringLayout();
		sl_panel_3.putConstraint(SpringLayout.SOUTH, Ch3, -6, SpringLayout.NORTH, Ch4);
		sl_panel_3.putConstraint(SpringLayout.NORTH, Ch4, 411, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, Ch4, -10, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, Ch4, -36, SpringLayout.EAST, panel_3);
		panel_3.setLayout(sl_panel_3);

		JLabel lbl_MVGuk = new JLabel("\uADF9\uD55C\uC9C1\uC5C5");
		sl_panel_3.putConstraint(SpringLayout.WEST, lbl_MVGuk, 66, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, lbl_MVGuk, -68, SpringLayout.EAST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, Ch3, 0, SpringLayout.WEST, lbl_MVGuk);
		sl_panel_3.putConstraint(SpringLayout.WEST, Ch4, 0, SpringLayout.WEST, lbl_MVGuk);
		lbl_MVGuk.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lbl_MVGuk, 24, SpringLayout.NORTH, panel_3);
		lbl_MVGuk.setForeground(Color.WHITE);
		lbl_MVGuk.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		panel_3.add(lbl_MVGuk);

		Ch3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "±ØÇÑÁ÷¾÷";
				time = "¿ÀÀü 10:30";

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

				movieNm = "±ØÇÑÁ÷¾÷";
				time = "¿ÀÈÄ 14:30";

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
		sl_panel_4.putConstraint(SpringLayout.NORTH, Ch6, 405, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, Ch6, 70, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, Ch6, -10, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, Ch6, -50, SpringLayout.EAST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, Ch5, -6, SpringLayout.NORTH, Ch6);
		sl_panel_4.putConstraint(SpringLayout.EAST, Ch5, -65, SpringLayout.EAST, panel_4);
		panel_4.setLayout(sl_panel_4);

		JLabel lbl_MVSin = new JLabel("\uC2E0\uACFC\uD568\uAED8-\uC8C4\uC640\uBC8C");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lbl_MVSin, 25, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, lbl_MVSin, -40, SpringLayout.EAST, panel_4);
		lbl_MVSin.setForeground(Color.WHITE);
		lbl_MVSin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		panel_4.add(lbl_MVSin);

		Ch5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				movieNm = "½Å°úÇÔ²²-ÁË¿Í¹ú";
				time = "¿ÀÀü 11:00";

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

				movieNm = "½Å°úÇÔ²²-ÁË¿Í¹ú";
				time = "¿ÀÀü 12:30";

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
		
		ImageIcon movie_s_icon = new ImageIcon("imgs/mo_s.jpg");
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
		
		
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MVSeatView.main(movieNm, time);

				frame.dispose();
			}
		});
		panel_1.add(btnNewButton_1);
		
		ImageIcon mmovie_icon = new ImageIcon("imgs/mmovie.png");
		JLabel lblNewLabel = new JLabel(mmovie_icon);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, -18, SpringLayout.NORTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel, 123, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654 \uC608\uB9E4");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1, -302, SpringLayout.WEST, btnNewButton);
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		panel_1.add(lblNewLabel_1);
	}

	private void add(JPanel panel_5) {
		// TODO Auto-generated method stub

	}
}
