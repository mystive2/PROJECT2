import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class top extends JFrame{
	JScrollPane scrollPane;
	ImageIcon icon,icon2,icon3,icon4,icon5,icon6;
	
	public top() {
		icon=new ImageIcon(this.getClass().getResource("first.jpg"));
		icon2=new ImageIcon(this.getClass().getResource("menubtn1.jpg"));
		icon3=new ImageIcon(this.getClass().getResource("menubtn2.jpg"));
		icon4=new ImageIcon(this.getClass().getResource("menubtn3.jpg"));
		icon5=new ImageIcon(this.getClass().getResource("menubtn4.jpg"));
		icon6=new ImageIcon(this.getClass().getResource("menubtn5.jpg"));
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		JButton btn1=new JButton(icon2);
		JButton btn2=new JButton(icon3);
		JButton btn3=new JButton(icon4);
		JButton btn4=new JButton(icon5);
		JButton btn5=new JButton(icon6);
		background.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ppop P=new ppop();
				P.run();
			
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test frame = new test();
				frame.run();
				
			}
		});	
		
		background.add(btn2);
		background.add(btn3);
		background.add(btn4);
		background.add(btn5);
		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);
	}
}
