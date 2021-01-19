package movie;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.Icon;
import java.awt.Font;

public class MVRvView {

   private JFrame frame;
   private CardLayout cardLayout;
   private JPanel first_panel, second_panel;
   public String movieNm;
   public String time;
public int user_Uid;

	public static void main(int user_Uid) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MVRvView window = new MVRvView(user_Uid);
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
//
//   public MVRvView() {
//      initialize();
//   }
	public MVRvView(int user_Uid) {
		this.user_Uid = user_Uid;
		
		initialize();
	}
   private void initialize() {
	  
	  JCheckBox Ch1 = new JCheckBox("\uC624\uC804 10:30");
	  Ch1.setForeground(Color.WHITE);
	  Ch1.setOpaque(false);
	  JCheckBox Ch2 = new JCheckBox("\uC624\uD6C4 14:30");
	  Ch2.setForeground(Color.WHITE);
	  Ch2.setOpaque(false);
	  JCheckBox Ch3 = new JCheckBox("\uC624\uC804 11:00");
	  Ch3.setForeground(Color.WHITE);
	  Ch3.setOpaque(false);
	  JCheckBox Ch4 = new JCheckBox("\uC624\uD6C4 12:30");
	  Ch4.setForeground(Color.WHITE);
	  Ch4.setOpaque(false);
	  JCheckBox Ch5 = new JCheckBox("\uC624\uC804 09:30");
	  Ch5.setForeground(Color.WHITE);
	  Ch5.setOpaque(false);
      JCheckBox Ch6 = new JCheckBox("\uC624\uD6C4 13:30");
      Ch6.setForeground(Color.WHITE);
	  Ch6.setOpaque(false);
      JCheckBox Ch7 = new JCheckBox("\uC624\uC804 11:40");
      Ch7.setForeground(Color.WHITE);
	  Ch7.setOpaque(false);
      JCheckBox Ch8 = new JCheckBox("\uC624\uD6C4 15:45");
      Ch8.setForeground(Color.WHITE);
	  Ch8.setOpaque(false);
	  
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(153, 204, 255));
      frame.setBounds(100, 100, 661, 635);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SpringLayout springLayout = new SpringLayout();
      frame.getContentPane().setLayout(springLayout);
      cardLayout = new CardLayout();
      
      JPanel par = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, par, 10, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, par, -10, SpringLayout.SOUTH, frame.getContentPane());
      par.setBackground(Color.WHITE);
      springLayout.putConstraint(SpringLayout.WEST, par, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, par, -10, SpringLayout.EAST, frame.getContentPane());
      frame.getContentPane().add(par);
      par.setLayout(cardLayout);
      
      first_panel = new JPanel();
      first_panel.setBackground(Color.WHITE);
      par.add(first_panel, "first");
      SpringLayout sl_fir_panel = new SpringLayout();
      first_panel.setLayout(sl_fir_panel);
      
      ImageIcon img1 = new ImageIcon("imgs/ti_m.png");
      
      ImageIcon img2 = new ImageIcon("imgs/ti_s.png");
      
      JButton btn_r1 = new JButton("New button");
      sl_fir_panel.putConstraint(SpringLayout.WEST, btn_r1, 579, SpringLayout.WEST, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.EAST, btn_r1, -10, SpringLayout.EAST, first_panel);
      btn_r1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent arg0) {
      		cardLayout.show(par, "second");
      	}
      });
      first_panel.add(btn_r1);
      
      ImageIcon btn4 = new ImageIcon("imgs/btn2.png");
      JButton btn_l1 = new JButton(btn4);
      sl_fir_panel.putConstraint(SpringLayout.WEST, btn_l1, 10, SpringLayout.WEST, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, btn_l1, -278, SpringLayout.SOUTH, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.EAST, btn_l1, 46, SpringLayout.WEST, first_panel);
      btn_l1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      	}
      });
      first_panel.add(btn_l1);
      
      JButton btn_MVgo1 = new JButton("\uC608\uB9E4\uD558\uAE30");
      btn_MVgo1.setBackground(Color.WHITE);
      btn_MVgo1.setForeground(Color.BLACK);
      btn_MVgo1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if(Ch1.isSelected() == true || Ch2.isSelected() == true || Ch3.isSelected() == true || 
 				   Ch4.isSelected() == true || Ch5.isSelected() == true || Ch6.isSelected() == true || Ch7.isSelected() == true || Ch8.isSelected() == true) {
 					
 					MVSeatView.main(movieNm, time,user_Uid);
 					frame.dispose();
 				}else {
 					JOptionPane.showMessageDialog(null, "체크박스를 눌러주세요!");
 				}
      		
      	}
      });
      sl_fir_panel.putConstraint(SpringLayout.WEST, btn_MVgo1, 264, SpringLayout.WEST, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, btn_MVgo1, -10, SpringLayout.SOUTH, first_panel);
      first_panel.add(btn_MVgo1);
      
      JButton btn_my1 = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, btn_r1, 255, SpringLayout.SOUTH, btn_my1);
      sl_fir_panel.putConstraint(SpringLayout.EAST, btn_my1, -10, SpringLayout.EAST, first_panel);
      btn_my1.setBackground(Color.WHITE);
      sl_fir_panel.putConstraint(SpringLayout.NORTH, btn_r1, 222, SpringLayout.SOUTH, btn_my1);
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, btn_my1, -533, SpringLayout.SOUTH, first_panel);
      btn_my1.setForeground(Color.BLACK);
      sl_fir_panel.putConstraint(SpringLayout.NORTH, btn_my1, 10, SpringLayout.NORTH, first_panel);
      btn_my1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		MVPageView.main(user_Uid);

			frame.dispose();
      	}
      });
      first_panel.add(btn_my1);
      
      JPanel JP_g = new JPanel() {
    	  @Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/ti_g.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
      };
      sl_fir_panel.putConstraint(SpringLayout.NORTH, JP_g, 69, SpringLayout.NORTH, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.WEST, JP_g, 16, SpringLayout.EAST, btn_l1);
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, JP_g, -6, SpringLayout.NORTH, btn_MVgo1);
      first_panel.add(JP_g);
      
      JPanel JP_s = new JPanel() {
    	  @Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/ti_s.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
      };
      sl_fir_panel.putConstraint(SpringLayout.WEST, JP_s, 319, SpringLayout.WEST, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.EAST, JP_s, -21, SpringLayout.WEST, btn_r1);
      sl_fir_panel.putConstraint(SpringLayout.EAST, JP_g, -18, SpringLayout.WEST, JP_s);
      sl_fir_panel.putConstraint(SpringLayout.NORTH, JP_s, 29, SpringLayout.SOUTH, btn_my1);
      SpringLayout sl_JP_g = new SpringLayout();
      JP_g.setLayout(sl_JP_g);
      
      
      Ch1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "극한직업";
			time = "오전 :30";

			Ch2.setSelected(false);
			Ch3.setSelected(false);
			Ch4.setSelected(false);
			Ch5.setSelected(false);
			Ch6.setSelected(false);
			Ch7.setSelected(false);
			Ch8.setSelected(false);
      	}
      });
      sl_JP_g.putConstraint(SpringLayout.SOUTH, Ch1, -62, SpringLayout.SOUTH, JP_g);
      sl_JP_g.putConstraint(SpringLayout.EAST, Ch1, -75, SpringLayout.EAST, JP_g);
      JP_g.add(Ch1);
      
      
      Ch2.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "극한직업";
			time = "오후 14:30";

			Ch1.setSelected(false);
			Ch3.setSelected(false);
			Ch4.setSelected(false);
			Ch5.setSelected(false);
			Ch6.setSelected(false);
			Ch7.setSelected(false);
			Ch8.setSelected(false);
      		
      	}
      });
      sl_JP_g.putConstraint(SpringLayout.NORTH, Ch2, 6, SpringLayout.SOUTH, Ch1);
      sl_JP_g.putConstraint(SpringLayout.WEST, Ch2, 0, SpringLayout.WEST, Ch1);
      JP_g.add(Ch2);
      
      JLabel lblNewLabel = new JLabel("\uADF9\uD55C\uC9C1\uC5C5");
      lblNewLabel.setForeground(Color.WHITE);
      lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
      sl_JP_g.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, JP_g);
      sl_JP_g.putConstraint(SpringLayout.WEST, lblNewLabel, 84, SpringLayout.WEST, JP_g);
      JP_g.add(lblNewLabel);
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, JP_s, -6, SpringLayout.NORTH, btn_MVgo1);
      first_panel.add(JP_s);
      SpringLayout sl_JP_s = new SpringLayout();
      sl_JP_s.putConstraint(SpringLayout.SOUTH, Ch3, -59, SpringLayout.SOUTH, JP_s);
      sl_JP_s.putConstraint(SpringLayout.NORTH, Ch4, 7, SpringLayout.SOUTH, Ch3);
      sl_JP_s.putConstraint(SpringLayout.WEST, Ch4, 74, SpringLayout.WEST, JP_s);
      sl_JP_s.putConstraint(SpringLayout.WEST, Ch3, 75, SpringLayout.WEST, JP_s);
      JP_s.setLayout(sl_JP_s);
      
      Ch3.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "신과함께-죄와벌";
			time = "오전 11:00";

			Ch1.setSelected(false);
			Ch2.setSelected(false);
			Ch4.setSelected(false);
			Ch5.setSelected(false);
			Ch6.setSelected(false);
			Ch7.setSelected(false);
			Ch8.setSelected(false);
      	}
      	
      });
      JP_s.add(Ch3);
      
      
      Ch4.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "신과함께-죄와벌";
			time = "오전 12:30";

			Ch1.setSelected(false);
			Ch2.setSelected(false);
			Ch3.setSelected(false);
			Ch5.setSelected(false);
			Ch6.setSelected(false);
			Ch7.setSelected(false);
			Ch8.setSelected(false);
      		
      	}
      });
      JP_s.add(Ch4);
      
      JLabel lblNewLabel_1 = new JLabel("\uC2E0\uACFC \uD568\uAED8-\uC8C4\uC640 \uBC8C");
      lblNewLabel_1.setForeground(Color.WHITE);
      sl_JP_s.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 22, SpringLayout.NORTH, JP_s);
      sl_JP_s.putConstraint(SpringLayout.WEST, lblNewLabel_1, 57, SpringLayout.WEST, JP_s);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
      sl_JP_g.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, JP_s);
      sl_JP_g.putConstraint(SpringLayout.WEST, lblNewLabel_1, 25, SpringLayout.WEST, JP_s);
      JP_s.add(lblNewLabel_1);
      
      ImageIcon mmovie_icon = new ImageIcon("imgs/mmovie.png");
      JLabel mmovie1 = new JLabel(mmovie_icon);
      sl_fir_panel.putConstraint(SpringLayout.NORTH, btn_l1, 202, SpringLayout.SOUTH, mmovie1);
      sl_fir_panel.putConstraint(SpringLayout.NORTH, mmovie1, 0, SpringLayout.NORTH, btn_my1);
      sl_fir_panel.putConstraint(SpringLayout.WEST, mmovie1, 33, SpringLayout.WEST, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, mmovie1, -6, SpringLayout.NORTH, JP_g);
      first_panel.add(mmovie1);
      
      JLabel lblNewLabel_4 = new JLabel("\uC601\uD654 \uC608\uB9E4");
      sl_fir_panel.putConstraint(SpringLayout.EAST, mmovie1, -4, SpringLayout.WEST, lblNewLabel_4);
      sl_fir_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 108, SpringLayout.WEST, first_panel);
      sl_fir_panel.putConstraint(SpringLayout.WEST, btn_my1, 326, SpringLayout.EAST, lblNewLabel_4);
      lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 17));
      sl_fir_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -20, SpringLayout.NORTH, JP_g);
      first_panel.add(lblNewLabel_4);
      
      second_panel = new JPanel();
      second_panel.setBackground(Color.WHITE);
      par.add(second_panel, "second");
      SpringLayout sl_sec_panel = new SpringLayout();
      second_panel.setLayout(sl_sec_panel);
      
      ImageIcon img3 = new ImageIcon("imgs/ti_g.png");
      
      ImageIcon img4 = new ImageIcon("imgs/ti_j.png");
      
      ImageIcon btn2 = new ImageIcon("imgs/btn2.png");
      JButton btn_l2 = new JButton(btn2);
      sl_sec_panel.putConstraint(SpringLayout.WEST, btn_l2, 10, SpringLayout.WEST, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, btn_l2, -273, SpringLayout.SOUTH, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.EAST, btn_l2, -579, SpringLayout.EAST, second_panel);
      btn_l2.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      	}
      });
      btn_l2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		cardLayout.show(par, "first");
      	}
      });
      second_panel.add(btn_l2);
      
      JButton btn_r2 = new JButton("New button");
      sl_sec_panel.putConstraint(SpringLayout.WEST, btn_r2, -48, SpringLayout.EAST, second_panel);
      btn_r2.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      	}
      });
      second_panel.add(btn_r2);
      
      JButton btn_Mp = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
      sl_sec_panel.putConstraint(SpringLayout.NORTH, btn_r2, 221, SpringLayout.SOUTH, btn_Mp);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, btn_r2, 257, SpringLayout.SOUTH, btn_Mp);
      sl_sec_panel.putConstraint(SpringLayout.EAST, btn_r2, 0, SpringLayout.EAST, btn_Mp);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, btn_Mp, -530, SpringLayout.SOUTH, second_panel);
      btn_Mp.setBackground(Color.WHITE);
      sl_sec_panel.putConstraint(SpringLayout.NORTH, btn_Mp, 10, SpringLayout.NORTH, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.WEST, btn_Mp, -117, SpringLayout.EAST, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.EAST, btn_Mp, -10, SpringLayout.EAST, second_panel);
      btn_Mp.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		new MVPageView().main(user_Uid);

			frame.dispose();
      	}
      });
      second_panel.add(btn_Mp);
      
      JButton btnNewButton = new JButton("\uC608\uB9E4\uD558\uAE30");
      btnNewButton.setBackground(Color.WHITE);
      sl_sec_panel.putConstraint(SpringLayout.WEST, btnNewButton, 265, SpringLayout.WEST, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, second_panel);
      btnNewButton.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
  		if(Ch1.isSelected() == true || Ch2.isSelected() == true || Ch3.isSelected() == true || 
				   Ch4.isSelected() == true || Ch5.isSelected() == true || Ch6.isSelected() == true || Ch7.isSelected() == true || Ch8.isSelected() == true) {
					
					MVSeatView.main(movieNm, time,user_Uid);
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "체크박스를 눌러주세요!");
				}

      	}
      });
      second_panel.add(btnNewButton);
      
      JPanel JP_m = new JPanel() { //패널에 이미지 넣음
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/ti_m.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
      sl_sec_panel.putConstraint(SpringLayout.WEST, JP_m, 17, SpringLayout.EAST, btn_l2);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, JP_m, -2, SpringLayout.NORTH, btnNewButton);
      second_panel.add(JP_m);
      
      JPanel JP_j = new JPanel() {
    	  @Override
			protected void paintComponent(Graphics g) {
				g.drawImage(new ImageIcon("imgs/mo_j.png").getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
      };
      sl_sec_panel.putConstraint(SpringLayout.WEST, JP_j, 320, SpringLayout.WEST, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.EAST, JP_j, -35, SpringLayout.WEST, btn_r2);
      sl_sec_panel.putConstraint(SpringLayout.EAST, JP_m, -20, SpringLayout.WEST, JP_j);
      sl_sec_panel.putConstraint(SpringLayout.NORTH, JP_j, 27, SpringLayout.SOUTH, btn_Mp);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, JP_j, -2, SpringLayout.NORTH, btnNewButton);
      sl_sec_panel.putConstraint(SpringLayout.NORTH, JP_m, 0, SpringLayout.NORTH, JP_j);
      SpringLayout sl_JP_m = new SpringLayout();
      JP_m.setLayout(sl_JP_m);
      
      
      Ch5.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "명량";
			time = "오전 09:30";

			Ch1.setSelected(false);
			Ch2.setSelected(false);
			Ch3.setSelected(false);
			Ch4.setSelected(false);
			Ch6.setSelected(false);
			Ch7.setSelected(false);
			Ch8.setSelected(false);
      	}
      });
      sl_JP_m.putConstraint(SpringLayout.WEST, Ch5, 65, SpringLayout.WEST, JP_m);
      sl_JP_m.putConstraint(SpringLayout.SOUTH, Ch5, -64, SpringLayout.SOUTH, JP_m);
      JP_m.add(Ch5);
      
      
      Ch6.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "명량";
			time = "오전 13:30";

			Ch1.setSelected(false);
			Ch2.setSelected(false);
			Ch3.setSelected(false);
			Ch4.setSelected(false);
			Ch5.setSelected(false);
			Ch7.setSelected(false);
			Ch8.setSelected(false);
      	}
      });
      sl_JP_m.putConstraint(SpringLayout.NORTH, Ch6, 5, SpringLayout.SOUTH, Ch5);
      sl_JP_m.putConstraint(SpringLayout.WEST, Ch6, 0, SpringLayout.WEST, Ch5);
      JP_m.add(Ch6);
      
      JLabel lblNewLabel_2 = new JLabel("\uBA85\uB7C9");
      lblNewLabel_2.setForeground(Color.WHITE);
      sl_JP_m.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 20, SpringLayout.NORTH, JP_m);
      sl_JP_m.putConstraint(SpringLayout.WEST, lblNewLabel_2, 98, SpringLayout.WEST, JP_m);
      sl_JP_m.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 49, SpringLayout.NORTH, JP_m);
      sl_JP_m.putConstraint(SpringLayout.EAST, lblNewLabel_2, -37, SpringLayout.EAST, JP_m);
      lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
      JP_m.add(lblNewLabel_2);
      second_panel.add(JP_j);
      SpringLayout sl_JP_j = new SpringLayout();
      JP_j.setLayout(sl_JP_j);
      
      
      Ch7.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "조커";
			time = "오전 11:40";

			Ch1.setSelected(false);
			Ch2.setSelected(false);
			Ch3.setSelected(false);
			Ch4.setSelected(false);
			Ch5.setSelected(false);
			Ch6.setSelected(false);
			Ch8.setSelected(false);
      	}
      });
      JP_j.add(Ch7);
      
      
      Ch8.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		movieNm = "명량";
			time = "오후 15:45";

			Ch1.setSelected(false);
			Ch2.setSelected(false);
			Ch3.setSelected(false);
			Ch4.setSelected(false);
			Ch5.setSelected(false);
			Ch6.setSelected(false);
			Ch7.setSelected(false);
      	}
      });
      sl_JP_j.putConstraint(SpringLayout.NORTH, Ch8, 404, SpringLayout.NORTH, JP_j);
      sl_JP_j.putConstraint(SpringLayout.WEST, Ch8, 68, SpringLayout.WEST, JP_j);
      sl_JP_j.putConstraint(SpringLayout.WEST, Ch7, 0, SpringLayout.WEST, Ch8);
      sl_JP_j.putConstraint(SpringLayout.SOUTH, Ch7, -6, SpringLayout.NORTH, Ch8);
      JP_j.add(Ch8);
      
      JLabel lblNewLabel_3 = new JLabel("\uC870\uCEE4");
      lblNewLabel_3.setForeground(Color.WHITE);
      sl_JP_j.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 20, SpringLayout.NORTH, JP_j);
      sl_JP_j.putConstraint(SpringLayout.WEST, lblNewLabel_3, 94, SpringLayout.WEST, JP_j);
      sl_JP_j.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 51, SpringLayout.NORTH, JP_j);
      sl_JP_j.putConstraint(SpringLayout.EAST, lblNewLabel_3, -25, SpringLayout.EAST, JP_j);
      lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
      JP_j.add(lblNewLabel_3);
      
      
      ImageIcon mmoviee_icon = new ImageIcon("imgs/mmovie.png");
      JLabel lblNewLabel_5 = new JLabel(mmoviee_icon);
      sl_sec_panel.putConstraint(SpringLayout.NORTH, btn_l2, 200, SpringLayout.SOUTH, lblNewLabel_5);
      sl_sec_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 10, SpringLayout.NORTH, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 33, SpringLayout.WEST, second_panel);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, -6, SpringLayout.NORTH, JP_m);
      sl_sec_panel.putConstraint(SpringLayout.EAST, lblNewLabel_5, -511, SpringLayout.EAST, second_panel);
      second_panel.add(lblNewLabel_5);
      
      JLabel lblNewLabel_6 = new JLabel("\uC601\uD654 \uC608\uB9E4");
      sl_sec_panel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 6, SpringLayout.EAST, lblNewLabel_5);
      sl_sec_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, -20, SpringLayout.NORTH, JP_m);
      lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 17));
      second_panel.add(lblNewLabel_6);
   }
}