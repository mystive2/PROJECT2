import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ppop extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	ImageIcon icon21, icon22, icon23, icon24, icon25, icon26;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ppop window = new ppop();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 */
	public ppop() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 293);
		frame.getContentPane().setLayout(null);

		textField = new JTextField("bb");
		textField.setBounds(258, 41, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(23, 21, 131, 121);
		frame.getContentPane().add(panel);

		textField_1 = new JTextField();
		textField_1.setBounds(258, 79, 116, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel label = new JLabel("\uC774\uB984");
		label.setFont(new Font("����", Font.BOLD, 20));
		label.setBounds(182, 40, 64, 18);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\uC0DD\uC77C");
		label_1.setFont(new Font("����", Font.BOLD, 20));
		label_1.setBounds(182, 72, 42, 31);
		frame.getContentPane().add(label_1);

		JButton button = new JButton("\uC870\uC0B0\uC77C\uACBD\uC6B0 \uB20C\uB7EC\uC8FC\uC138\uC694~");
		button.setBounds(34, 215, 173, 23);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\uC800\uC7A5\uD558\uAE30");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String queryb = "insert into BABYI (name) value ("+textField.getText()+")";
				MemberDAO M = new MemberDAO();
				getS();
				// b=textField.getText();
				// System.out.println(b);
				M.insert();

			}
		});
		button_1.setBounds(296, 215, 97, 23);
		frame.getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("");
		icon21 = new ImageIcon(this.getClass().getResource("/first.jpg"));
		lblNewLabel.setIcon(icon21);
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);

	}

	public void run() {
		ppop window = new ppop();
		window.frame.setVisible(true);

	};

	public String getS() {
		String a = textField.getText();
		System.out.println("ppop.java - getS() : " + a);
		System.out.println("ppop.java - getS() : " + textField_1.getText());
		return a;
	}
}
