import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class pop1 extends JFrame{
	ImageIcon icon11,icon12,icon13,icon14,icon15,icon16;
	public pop1() {
		icon11=new ImageIcon(this.getClass().getResource("first.jpg"));
		JScrollPane scrollPane2;
		JPanel background2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon11.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
				
			}
		};
		JButton btn11=new JButton("수행가능");
		JButton btn12=new JButton("수행불가");
		
		background2.add(btn11);
		background2.add(btn12);
		scrollPane2 = new JScrollPane(background2);
		setContentPane(scrollPane2);

		
	}
	
}
