import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;


public class CUS {

	private JFrame frame;
	ImageIcon icon[]=new ImageIcon[300];
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CUS window = new CUS();
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
	public CUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 960);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		icon[0]=new ImageIcon(this.getClass().getResource("/develop.jpg"));
		icon[1]=new ImageIcon(this.getClass().getResource("/bear.jpg"));
		
		
		icon[101]=new ImageIcon(this.getClass().getResource("/huhu.gif"));
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(517, 0, 747, 495);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uC0AC\uC9C4");
		lblNewLabel_2.setBounds(35, 25, 321, 250);
		lblNewLabel_2.setIcon(icon[101]);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(489, 58, 140, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(489, 116, 140, 29);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		panel_1.setVisible(false);
		
		JButton btnNewButton_5 = new JButton("\uC800\uC7A5\uD558\uAE30");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				System.out.println(textField_1.getText());
				panel_1.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(562, 403, 140, 36);
		panel_1.add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984 :");
		lblNewLabel_3.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 25));
		lblNewLabel_3.setBounds(408, 51, 67, 36);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C :");
		lblNewLabel_4.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 25));
		lblNewLabel_4.setBounds(368, 113, 119, 29);
		panel_1.add(lblNewLabel_4);
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 960);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 0, 518, 100);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 99, 518, 100);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 198, 518, 100);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 297, 518, 100);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 397, 518, 100);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 494, 1268, 426);
		lblNewLabel.setIcon(icon[0]);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(519, 0, 749, 497);
		lblNewLabel_1.setIcon(icon[1]);
		panel.add(lblNewLabel_1);
		
		
	}
}
