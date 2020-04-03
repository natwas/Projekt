package projekt;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 

public class Window2 extends JFrame implements ActionListener 
{

private static final long serialVersionUID = 1L;
private JPanel contentPane;

String ang="en";
String country="US";
Locale l1 = new Locale(ang,country);
ResourceBundle r1 = ResourceBundle.getBundle("projekt.english/language",l1);

JPanel PUpper, PDown, PLeft, PRight, PRight2, DrawPanel;
JLabel label;
JButton PL, ENG, RUS;
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
 
	
	public Window2() 
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(900,600);
	    this.setLayout(new BorderLayout());
	    
	    PUpper = new JPanel();
	    
	    ENG = new JButton ("ENG");
	    ENG.setActionCommand("english");
	    ENG.setBackground(Color.red);
		ENG.addActionListener(this);
		
		PL = new JButton ("PL");
	    PL.setActionCommand("polish");
	    PL.setBackground(Color.blue);
		PL.addActionListener(this);
		
		RUS = new JButton ("RUS");
	    RUS.setActionCommand("rus");
	    RUS.setBackground(Color.green);
		RUS.addActionListener(this);
		
		PUpper.add(ENG);
		PUpper.add(PL);
		PUpper.add(RUS);
		PUpper.setLayout(new FlowLayout(1,5,5));
		
		this.add(PUpper, BorderLayout.PAGE_START);
	    
	    DrawPanel= new JPanel();
	    label= new JLabel("ok");
	    DrawPanel.add(label);
	    DrawPanel.setBackground(Color.white);
	    this.add(DrawPanel, BorderLayout.CENTER);
	    
	    
	}
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand() == "english")
		{
			
		}
		if (e.getActionCommand() == "polish")
		{
			
		}
		if (e.getActionCommand() == "rus")
		{
			
		}
	
	}
	
	
}