package projekt;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 

public class Window3 extends JFrame implements ActionListener 
{

private static final long serialVersionUID = 1L;
//private JPanel contentPane;

String ang="en";
String country="US";
Locale l1 = new Locale(ang,country);
ResourceBundle r1 = ResourceBundle.getBundle("projekt.english/language",l1);

JPanel PUpper, PDown, PLeft, PRight, PRight2, DrawPanel;
JLabel label;
JButton PL, ENG, RUS, GE;

JTextField text2; 

	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					Window3 frame = new Window3();
					frame.setVisible(true);					
				}
				catch (Exception es) 
				{
					es.printStackTrace();
				}
			}
		});
	}
 
	
	public Window3() 
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
		
		GE = new JButton ("GE");
	    GE.setActionCommand("german");
	    GE.setBackground(Color.yellow);
		GE.addActionListener(this);
		
		PUpper.add(ENG);
		PUpper.add(PL);
		PUpper.add(RUS);
		PUpper.add(GE);
		PUpper.setLayout(new FlowLayout(1,5,5));
		
		this.add(PUpper, BorderLayout.PAGE_START);
	    
	    DrawPanel= new JPanel();  
	
	    DrawPanel.setBackground(Color.white);
	    this.add(DrawPanel, BorderLayout.CENTER);
	    JButton elo = new JButton("wyswietl ten tekst jebany"); 
	    DrawPanel.add(elo); 
	    elo.addActionListener(new ActionListener() 		 
	    {
	    	@Override       	            	
			public void actionPerformed(ActionEvent es)
	    	{
	    		text2 = new JTextField("Co to");  
				File plik = new File("efekt.txt"); 
				Scanner odczyt;
				try
				{
					odczyt = new Scanner(plik);
					while(odczyt.hasNextLine())
					System.out.print(odczyt.nextLine());
					//text2.setText(odczyt.nextLine()); 
					//DrawPanel.add(text2); 
					  		 
				 }
				catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
				}
	    	}
	    });
	    
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}}