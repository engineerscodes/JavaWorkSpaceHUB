import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * 
 */

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
public class newFrame  extends JFrame{
	public newFrame()
	{   
		setBounds(0, 0, 600, 600);
		getContentPane().setLayout(null);
		
		JLabel main = new JLabel("Main Application");
		main.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		main.setBounds(128, 241, 295, 57);
		getContentPane().add(main);
		
		
	      
		setVisible(true);
	}	
}

