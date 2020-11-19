/**
 * 
 */
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
import java.awt.*; 
import javax.swing.*; 
  
public class guiiiiii extends JApplet { 
  
    public void init() 
    { 
       
        setSize(400, 400); 
  
        repaint(); 
    } 
   
    public void paint(Graphics g) 
    { 
    	Random rand = new Random(); 
    	g.drawRect(rand.nextInt(100),rand.nextInt(100),50,50);
    } 
} 