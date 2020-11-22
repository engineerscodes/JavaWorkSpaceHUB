/**
 * 
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class GUIDEMO implements ActionListener,Serializable
{
	  JFrame frame;
	  int count=0;
	    static  JComboBox <String>cb;
	     JLabel label;
	     JRadioButton male,female;
	     ButtonGroup gender;
	     JButton btn;
		public GUIDEMO()
		{
	      frame=new JFrame("main frame");
	      cb =new JComboBox<String>();
	      btn=new JButton();
	      add();
		}

		private void add()
		{
			frame.setBounds(0,0,500,500);
			frame.setLayout(null);
			
			frame.setBackground(Color.CYAN); //must use .getContentPane()
			frame.getContentPane().setBackground(Color.CYAN);
			label=new JLabel("name");
			label.setBounds(250,250,150,50);
			label.setText("ComboBox ");
			frame.add(label);
			cb.addItem("TN");
			cb.addItem("ap");
			cb.setBounds(50,50,100,100);
			cb.setBackground(Color.green);
			
		    frame.add(cb);
		    male=new JRadioButton("male",true);
		    male.setText("MALE");
		    male.setBackground(Color.red);
		    male.setBounds(150,330,120,50);
		    female=new JRadioButton("Female");
		    
		    female.setText("Female");
		    female.setBounds(300,100,150,100);
		    female.addActionListener(this);
		    frame.add(male);
		    frame.add(female);
		    gender =new ButtonGroup();
		    gender.add(male);
		    gender.add(female);
		    DefaultListModel<String> dlist=new DefaultListModel();
		    dlist.addElement("Java");
		    dlist.addElement("c++");
		    JList<String>list=new JList<>(dlist);
		    list.setBounds(50,150,200,130);
		     frame.add(list);
		     list.setBackground(Color.ORANGE);
		     btn.setText("Click");
		     btn.setBounds(350,400,100, 50);
		     frame.add(btn);
		     
		     btn.addActionListener(this);
		    //list.add("java"); error
		     try {
					FileOutputStream f=new FileOutputStream("Output.ser");	
					ObjectOutputStream obj=new ObjectOutputStream(f);
					obj.writeObject(frame);
					obj.flush();
					obj.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		    frame.setVisible(true);
		}


		public static void main(String[] args) 
		{
	       new GUIDEMO ();
		}
		public void actionPerformed(ActionEvent e) 
		{     
		
		if(count%2==0)
			female.setBackground(Color.RED);
		else
			female.setBackground(Color.yellow);
		count++;
			 try {  
					FileOutputStream f=new FileOutputStream("Output.ser");	
					ObjectOutputStream obj=new ObjectOutputStream(f);
					obj.writeObject(frame);
					//obj.writeObject(btn);
					obj.flush();
					obj.close();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			
		}
}

