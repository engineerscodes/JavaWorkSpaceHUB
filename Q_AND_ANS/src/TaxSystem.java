import java.awt.EventQueue;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 * 
 */

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class TaxSystem {

	private JFrame frame;
	private JTextField userName;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaxSystem window = new TaxSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TaxSystem() {
		initialize();
	}

	private void initialize() {
		HashMap<String,String> map=new HashMap<String,String>(); 
		map.put("Naveen", "123456789");
		map.put("Praveen","963852741");
		map.put("Rhea", "789456123");
		map.put("Thilak","741852963");
		System.out.println(map);
		frame = new JFrame();
		frame.setTitle("Please Enter Name and Password");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Name :");
		name.setFont(new Font("Tahoma", Font.BOLD, 16));
		name.setBounds(53, 65, 96, 29);
		frame.getContentPane().add(name);
		
		JLabel password = new JLabel("Password :");
		password.setFont(new Font("Tahoma", Font.BOLD, 16));
		password.setBounds(53, 133, 96, 29);
		frame.getContentPane().add(password);
		
		userName = new JTextField();
		userName.setBounds(188, 67, 184, 29);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 133, 184, 29);
		frame.getContentPane().add(passwordField);
		frame.setTitle("Please Enter Name and Password");
		JButton submit = new JButton("Ok\r\n");
		submit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		submit.setBounds(150, 194, 96, 36);
		
		submit.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				if(map.get(userName.getText()).equals(passwordField.getText()))
				{
					JOptionPane.showMessageDialog(submit,"Login Successfull!!!");
					newFrame nf=new newFrame();
					nf.setVisible(true);
			
				}
				else
					JOptionPane.showMessageDialog(submit,"Login Failed Invalid Username and Password!!");
			
			}
			catch(NullPointerException f1) {JOptionPane.showMessageDialog(submit,"Login Failed Invalid Username and Password!!"); //usename is not in HashMap
			}
	}
		});
		frame.getContentPane().add(submit);
		
		
		JButton cancel = new JButton("Cancel\r\n");
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			}
			
		});
		cancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		cancel.setBounds(260, 194, 96, 36);
		frame.getContentPane().add(cancel);
		
		
	}
}

