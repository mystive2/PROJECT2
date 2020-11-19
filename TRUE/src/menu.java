import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public menu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 804, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon ii=new ImageIcon(this.getClass().getResource("/menubtn1.jpg"));
		ImageIcon iii=new ImageIcon(this.getClass().getResource("/develop.jpg"));
		ImageIcon iv=new ImageIcon(this.getClass().getResource("/bear.jpg"));
		
		
		JButton button = new JButton("New button"); //아기 등록
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ppop P=new ppop();
				P.run();
			}
		});
		button.setBounds(0, 0, 434, 59);
		button.setIcon(ii);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("New button"); //불러오기
		btnNewButton.setBounds(0, 61, 434, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button"); //검사하기
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test frame = new test();
				frame.run();
			}
		});
		btnNewButton_1.setBounds(0, 122, 434, 59);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button"); //결과보기
		btnNewButton_2.setBounds(0, 182, 434, 59);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button"); //놀이추천
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(0, 241, 434, 59);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(308, 0, 480, 267);
		lblNewLabel.setIcon(iv);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 170, 788, 355);
		lblNewLabel_1.setIcon(iii);
		frame.getContentPane().add(lblNewLabel_1);
	}


	public void run() {
		menu window = new menu();
		window.frame.setVisible(true);
		
	}
}
