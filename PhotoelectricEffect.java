package projekt;


//import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
//import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.HeadlessException;
//import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
//import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
//import java.util.Random;
import java.util.ResourceBundle;
//import java.sql.*;





public class PhotoelectricEffect extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	
	
	// Deklaracja paneli, zmiennych, sta³ych nie wszystkie narazie u¿ywane

	JMenuBar menubar;
	JMenu menu, language, windowpane;
	JMenuItem menuZapisz, menuNowyplik, Polish, English, Rus, creators, effect;
	JPanel PUpper, PDown, PLeft, PRight, DrawPanel;
	JSlider slider;
	JTextField text1;
	JRadioButton radio1, radio2;
	JButton selectMaterial, frequency , changeColor, start, Ebonit, Porcelana, Szklo, Kalafonia;
	public ButtonGroup group;
	static final int SLIDER_MIN = 3;
	static final int SLIDER_MAX = 30;
	static final int SLIDER_INIT = 3;
	static int numberOfTextFieldsRows = SLIDER_INIT;
	String choosenPanel = "choice";
	//Deklaracje do rysowania 
	static final int promien = 100;
	int dlugosclini = 1;
	Color kolorlinii = Color.black;
	String ang="en";
	String country="US";
	Locale l1 = new Locale(ang,country);
	ResourceBundle r1 = ResourceBundle.getBundle("projekt.english/language",l1);
	
	//do obrazkow 
	BufferedImage image; 

	public PhotoelectricEffect() throws HeadlessException{
   
		
		super();
		
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.setSize(900,600);
    this.setLayout(new BorderLayout());
		//Menu
		menubar = new JMenuBar();		
	    menu = new JMenu("Menu");
	    
	    menuZapisz=new JMenuItem(r1.getString("menuZapisz"));
	    menuZapisz.setActionCommand("zapisz");
		menuZapisz.addActionListener(this);
		
		
		menuNowyplik =new JMenuItem(r1.getString("menuNowyplik"));
		menuNowyplik.setActionCommand("nowyplik");
		menuNowyplik.addActionListener(this);
		
		menu.add(menuZapisz);
		menu.add(menuNowyplik);
		
		language=new JMenu(r1.getString("language"));
		
		Polish=new JMenuItem("PL");
		Polish.setActionCommand("polish");
		Polish.addActionListener(this);
		
		English=new JMenuItem("ENG");
		English.setActionCommand("english");
		English.addActionListener(this);
		
		Rus=new JMenuItem("RUS");
		Rus.setActionCommand("rus");
		Rus.addActionListener(this);
		
		windowpane = new JMenu("Info");
		
		creators = new JMenuItem(r1.getString("creators"));
		creators.setActionCommand("creators");
		creators.addActionListener(this);
		
		effect = new JMenuItem(r1.getString("effect"));
		effect.setActionCommand("effect");
		effect.addActionListener(this);
		
		windowpane.add(creators);
		windowpane.add(effect);
		
		language.add(English);
		language.add(Polish);
		language.add(Rus);
		
		menubar.add(menu);
		menubar.add(language);
		menubar.add(windowpane);
		this.setJMenuBar(menubar);
		//Panel od przyciskow, lewy 
		PRight = new JPanel();
			
		JLabel selectMaterial = new JLabel(r1.getString("selectMaterial")); 
		Ebonit = new JButton(r1.getString("Ebonit"));
		Ebonit.setActionCommand("Ebonit");
		Ebonit.addActionListener(new ActionListener() 		 
  {
      @Override
      public void actionPerformed(ActionEvent es) 
      {
      	
      	URL resource = getClass().getResource("dielektryk2.JPG");
      	 try 
      	 {
      	 image = ImageIO.read(resource);
      	 Graphics g2d = DrawPanel.getGraphics();
      	 g2d.drawImage(image, 0, 0, DrawPanel);
      	 } 
      	 catch (IOException en) 
      	 {
      	 System.err.println("Blad odczytu obrazka");
      	 en.printStackTrace();
      	 }
      	 
      	 Dimension dimension =
      	new Dimension(image.getWidth(), image.getHeight());
      	 setPreferredSize(dimension);
      }	
    }
	
  );
         
		
		Porcelana = new JButton(r1.getString("Porcelana"));
		Porcelana.setActionCommand("Porcelana");
		Porcelana.addActionListener(new ActionListener() 		 
      {
			 @Override
	            public void actionPerformed(ActionEvent es) 
	            {
	            	
	            	URL resource = getClass().getResource("dielektryk3.JPG");
	            	 try 
	            	 {
	            	 image = ImageIO.read(resource);
	            	 Graphics g2d = DrawPanel.getGraphics();
	            	 g2d.drawImage(image, 0, 0, DrawPanel);
	            	 } 
	            	 catch (IOException en) 
	            	 {
	            	 System.err.println("Blad odczytu obrazka");
	            	 en.printStackTrace();
	            	 }
	            	 
	            	 Dimension dimension =
	            	new Dimension(image.getWidth(), image.getHeight());
	            	 setPreferredSize(dimension);
	            }	
      });
		
		Kalafonia = new JButton(r1.getString("Kalafonia"));
		Kalafonia.setActionCommand("Kalafonia");
		Kalafonia.addActionListener(new ActionListener() 		 
      {
			 @Override
	            public void actionPerformed(ActionEvent es) 
	            {
	            	
	            	URL resource = getClass().getResource("dielektryk4.JPG");
	            	 try 
	            	 {
	            	 image = ImageIO.read(resource);
	            	 Graphics g2d = DrawPanel.getGraphics();
	            	 g2d.drawImage(image, 0, 0, DrawPanel);
	            	 } 
	            	 catch (IOException en) 
	            	 {
	            	 System.err.println("Blad odczytu obrazka");
	            	 en.printStackTrace();
	            	 }
	            	 
	            	 Dimension dimension =
	            	new Dimension(image.getWidth(), image.getHeight());
	            	 setPreferredSize(dimension);
	            }	
      });
		
		Szklo = new JButton(r1.getString("Szklo"));
		Szklo.setActionCommand("Szklo");
		Szklo.addActionListener(new ActionListener() 		 
      {
			 @Override
	            public void actionPerformed(ActionEvent es) 
	            {
	            	
	            	URL resource = getClass().getResource("plytkaPoczatkowa.PNG");
	            	 try 
	            	 {
	            	 image = ImageIO.read(resource);
	            	 Graphics g2d = DrawPanel.getGraphics();
	            	 g2d.drawImage(image, 0, 0, DrawPanel);
	            	 } 
	            	 catch (IOException en) 
	            	 {
	            	 System.err.println("Blad odczytu obrazka");
	            	 en.printStackTrace();
	            	 }
	            	 
	            	 Dimension dimension =
	            	new Dimension(image.getWidth(), image.getHeight());
	            	 setPreferredSize(dimension);
	            }	
      });

		changeColor = new JButton(r1.getString("Tlo"));
		changeColor.setActionCommand("changeColor");
		changeColor.addActionListener(new ActionListener() 		 
      {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
              Color newColor = JColorChooser.showDialog
              (null, "Wybierz kolor", Color.white);
                  DrawPanel.setBackground(newColor);
          }
      });
		
		frequency  = new JButton(r1.getString("frequency"));
		frequency .setActionCommand("frequency ");
		frequency .addActionListener(this); /*(new ActionListener()
      {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
          	BufferedImage image = null;
              JFileChooser chooser = new JFileChooser();
              chooser.setDialogTitle("Wybierz plik");
              int result = chooser.showDialog(null,"Wczytaj");
              if(result == JFileChooser.APPROVE_OPTION)
              {
                  File inputFile = new File(chooser.getSelectedFile().getAbsolutePath());
                  try
                  {
                      image = ImageIO.read(inputFile);
                      Graphics g = DrawPanel.getGraphics();
                      g.drawImage(image, 0, 0, getWidth(), getHeight(),null);
                  }
                  catch(IOException ex)
                  {
                      System.out.println(ex.getMessage());
                  }
              }
      		
          }
      });*/ 
		
		start = new JButton("START/STOP");
		start.setActionCommand("start");
		start.addActionListener(this);
		
		text1 = new JTextField("0");
		
		PRight.setLayout(new GridLayout(9,1)); 
		PRight.add(frequency ,GridLayout(1,1));
		PRight.add(changeColor, GridLayout(2,1));		
		PRight.add(text1, GridLayout(3,1));
		PRight.add(selectMaterial, GridLayout(4,1));
		PRight.add(Ebonit, GridLayout(5,1));
		PRight.add(Szklo, GridLayout(6,1));
		PRight.add(Porcelana, GridLayout(7,1));
		PRight.add(Kalafonia, GridLayout(8,1));
		PRight.add(start, GridLayout(9,1));
		Random r = new Random();
		Color k = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		start.setBackground(k);
		
		this.add(PRight, BorderLayout.LINE_START); 
		
		//Panel do rysowania i symulacji 
		
		DrawPanel = new JPanel();
		
		DrawPanel.setBackground(Color.white);
	    this.add(DrawPanel, BorderLayout.CENTER);
	    
	    
	}
	
	private Object GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, 0, 0, this);
	}
	
	//Action Performer
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "start")
		{
		////////////////////////////////////////	
		}
		if (e.getActionCommand() == "zapisz") 
		{
			 BufferedImage image = new BufferedImage(DrawPanel.getWidth(), DrawPanel.getHeight(),BufferedImage.TYPE_INT_ARGB);
			 Graphics2D g2d = image.createGraphics();
			 DrawPanel.paintAll(g2d);
			 JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			 FileNameExtensionFilter filter = new FileNameExtensionFilter(
	                    "PNG images", "png");
	            chooser.setFileFilter(filter);
	            int returnVal = chooser.showSaveDialog(null);
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	                File outputFile = new File(chooser.getSelectedFile().getAbsolutePath() + ".png");
	                try {
	                    ImageIO.write(image, "png", outputFile);
	                } catch (IOException exception) {
	                    System.out.println(exception.getMessage());
	                }
	            }
		}
		if (e.getActionCommand() == "nowyplik")
		{
			 JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	            FileNameExtensionFilter filter = new FileNameExtensionFilter(
	                    "PNG images", "png");
	            chooser.setFileFilter(filter);
	            int returnVal = chooser.showOpenDialog(null);
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	                BufferedImage image = null;
	                File inputFile = new File(chooser.getSelectedFile().getAbsolutePath());
	                try {
	                    image = ImageIO.read(inputFile);
	                    Graphics g = DrawPanel.getGraphics();
	                    g.drawImage(image, 0, 0, null);
	                } catch(IOException ex) {
	                    System.out.println(ex.getMessage());
	                }

	            }
		}
		
		if (e.getActionCommand() == "creators")
		{
			//call the object of NewWindow and set visible true
			Window2 frame = new Window2();
			frame.setVisible(true);
			//set default close operation
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getActionCommand() == "polish")
		{
	    String pol="pl";
		String kraj="PL";
		Locale l2 = new Locale(pol,kraj);
		ResourceBundle r2 = ResourceBundle.getBundle("projekt.polish/language_pl_PL",l2);
		language.setText(r2.getString("language"));
		frequency.setText(r2.getString("frequency"));
		menuZapisz.setText(r2.getString("menuZapisz"));
		menuNowyplik.setText(r2.getString("menuNowyplik"));
		creators.setText(r2.getString("creators"));
		Ebonit.setText(r2.getString("Ebonit"));
		Porcelana.setText(r2.getString("Porcelana"));
		Kalafonia.setText(r2.getString("Kalafonia"));
		Szklo.setText(r2.getString("Szklo"));
		changeColor.setText(r2.getString("Tlo"));
		effect.setText(r2.getString("effect"));
		//selectMaterial.setText(r2.getString("selectMaterial"));
		}
		if (e.getActionCommand() == "english")
		{
	   
		language.setText(r1.getString("language"));
		frequency.setText(r1.getString("frequency"));
		menuZapisz.setText(r1.getString("menuZapisz"));
		menuNowyplik.setText(r1.getString("menuNowyplik"));
		creators.setText(r1.getString("creators"));
		Ebonit.setText(r1.getString("Ebonit"));
		Porcelana.setText(r1.getString("Porcelana"));
		Kalafonia.setText(r1.getString("Kalafonia"));
		Szklo.setText(r1.getString("Szklo"));
		changeColor.setText(r1.getString("Tlo"));
		effect.setText(r1.getString("effect"));
		//selectMaterial.setText(r1.getString("selectMaterial"));
		}
		if (e.getActionCommand() == "rus")
		{
		String ru="ru";
		String kraj="RUS";
		Locale l3 = new Locale(ru,kraj);
		ResourceBundle r3 = ResourceBundle.getBundle("projekt.russian/language_ru_RUS",l3);
		language.setText(r3.getString("language"));
		frequency.setText(r3.getString("frequency"));
		menuZapisz.setText(r3.getString("menuZapisz"));
		menuNowyplik.setText(r3.getString("menuNowyplik"));
		creators.setText(r3.getString("creators"));
		Ebonit.setText(r3.getString("Ebonit"));
		Porcelana.setText(r3.getString("Porcelana"));
		Kalafonia.setText(r3.getString("Kalafonia"));
		Szklo.setText(r3.getString("Szklo"));
		changeColor.setText(r3.getString("Tlo"));
		//selectMaterial.setText(r3.getString("selectMaterial"));
		}
	}
			
	//main 
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
	{
		public void run()
		{
			//try - catch block
			try 
			{
				PhotoelectricEffect ramka = new  PhotoelectricEffect();
				ramka.setTitle("Symulacja Efektu Fotoelektrycznego");
				ramka.setVisible(true);				
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	  });
		
}
}