/**
 * 
 */
package Day11_Swing;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField.AbstractFormatter;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	String Name,mName,LName,Number,Adrress,profession;
    String gender;
    Date datee;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 693, 776);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(35, 20, 115, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(20, 56, 161, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Middle Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(241, 20, 137, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(230, 54, 161, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(494, 20, 101, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(473, 54, 161, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(34, 136, 130, 37);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(230, 144, 161, 109);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_4 = new JLabel("Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(35, 294, 124, 37);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(230, 305, 161, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				gender="Male";
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(187, 378, 103, 41);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(35, 380, 129, 37);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				gender="Female";
			}
		});
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFemale.setBounds(319, 378, 103, 41);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				gender="Other";
			}
		});
		rdbtnOther.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOther.setBounds(456, 378, 103, 41);
		frame.getContentPane().add(rdbtnOther);
		
		JLabel lblNewLabel_6 = new JLabel("Profession");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(36, 460, 114, 26);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(187, 466, 342, 37);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("DOB");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(35, 557, 101, 29);
		frame.getContentPane().add(lblNewLabel_7);
		JPanel panel = new JPanel();
		panel.setBounds(187, 557, 352, 63);
		frame.getContentPane().add(panel);
		
		UtilDateModel model = new UtilDateModel();
		
		model.setDate(20,04,2014);
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		
		 
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter() );
		panel.add(datePicker);
		//String d =  datePicker.getModel().getValue().toString();
		//System.out.println(d);
		ButtonGroup G = new ButtonGroup();
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnFemale );
		G.add(rdbtnOther);
		
		JButton btnNewButton = new JButton("Rest");
		btnNewButton.setBounds(187, 630, 124, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				Name=textField.getText();
			//	System.out.println("Nmae :"+Name);
				mName=textField_1.getText();
				LName=textField_2.getText();
				String Adrress=textArea.getText();
				//System.out.println(Adrress);
				String Number=textField_3.getText();
				String profession=textField_4.getText();
				JOptionPane.showMessageDialog(textField,"NAME :"+Name+" "+mName+" "+LName+"\n"+"Adress :"+Adrress+"\n"+"Number :"+Number+"\nProfession :"+profession);
				
			}
		});
		btnPrint.setBounds(387, 630, 124, 41);
		frame.getContentPane().add(btnPrint);
		
		
		
	}
}

class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }

        return "";
    }

}

