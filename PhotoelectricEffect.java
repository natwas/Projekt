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






public class PhotoelectricEffect extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	
	
	// Deklaracja paneli, zmiennych, sta³ych nie wszystkie narazie u¿ywane

	JMenuBar menubar;
	JMenu menu, language, windowpane;
	JMenuItem menuZapisz, menuNowyplik, Polish, English, creators;
	JPanel PUpper, PDown, PLeft, PRight, DrawPanel;
	JSlider slider;
	JTextField text1;
	JRadioButton radio1, radio2;
	JButton selectmaterial, frequency , changeColor, start, Ebonit, Porcelana, Szklo, Kalafonia;
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
	    
	    menuZapisz=new JMenuItem("Zapisz plik");
	    menuZapisz.setActionCommand("zapisz");
		menuZapisz.addActionListener(this);
		
		
		menuNowyplik =new JMenuItem("Nowy plik");
		menuNowyplik.setActionCommand("nowyplik");
		menuNowyplik.addActionListener(this);
		
		menu.add(menuZapisz);
		menu.add(menuNowyplik);
		
		language=new JMenu("Jêzyk/Language");
		
		Polish=new JMenuItem("Polski/Polish");
		
		English=new JMenuItem("English/Angielski");
		
		windowpane = new JMenu("Info");
		creators = new JMenuItem("Twórcy/Creators");
		creators.setActionCommand("creators");
		creators.addActionListener(this);
		windowpane.add(creators);
		language.add(Polish);
		language.add(English);
		
		menubar.add(menu);
		menubar.add(language);
		menubar.add(windowpane);
		this.setJMenuBar(menubar);
		//Panel od przyciskow, lewy 
		PRight = new JPanel();
			
		JLabel selectmaterial = new JLabel("Wybierz dielektryk:"); 
		Ebonit = new JButton("Ebonit");
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
         
		
		Porcelana = new JButton("Porcelana");
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
		
		Kalafonia = new JButton("Kalafonia");
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
		
		Szklo = new JButton("Szk³o");
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

		changeColor = new JButton("Zmieñ Kolor T³a");
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
		
		frequency  = new JButton("Wpisz czêstotliwoœæ");
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
		PRight.add(selectmaterial, GridLayout(4,1));
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
		if (e.getActionCommand() == "creators")
		{
			//call the object of NewWindow and set visible true
			Window2 frame = new Window2();
			frame.setVisible(true);
			//set default close operation
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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