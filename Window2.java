package projekt;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 

public class Window2 extends JFrame 
{

private static final long serialVersionUID = 1L;
private JPanel contentPane;

JPanel PUpper, PDown, PLeft, PRight, PRight2, DrawPanel;
JLabel label;
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				
				try 
				{
					
					Window2 frame = new Window2();
					
					frame.setVisible(true);					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
 
	
	public Window2() //constructor
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(900,600);
	    this.setLayout(new BorderLayout());
	    
	    DrawPanel= new JPanel();
	    label= new JLabel("Czym jest efekt fotoelektryczny?");
	    DrawPanel.add(label);
	    this.add(DrawPanel, BorderLayout.CENTER);
	    
	}
	
	
	
}
