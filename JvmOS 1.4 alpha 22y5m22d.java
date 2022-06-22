package ar;
//changelog for 22y6m22d: added customization(in form of a bkg color changer, added a changelog
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.io.IOException;
import java.net.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Main extends JFrame implements ActionListener {
	static JMenuBar mb;
	static JMenu x, y;
	static JMenuItem m1, m2, m3, m4, m5, m6, m7;
	static JFrame f, about;
	static JLabel l, aboutText, abtt2;
	public static void main(String[] args)
	{

		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now(); 

		Main m = new Main();
 
		f = new JFrame("JvmOS ex_1.4 b.22y6m22d");
		about = new JFrame("about");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      aboutText = new JLabel("hi");l = new JLabel("JvmOS");
		mb = new JMenuBar();

		x = new JMenu("Main");
		y = new JMenu("Costumization");

		m1 = new JMenuItem("Time");
		m2 = new JMenuItem("notepad");
		m3 = new JMenuItem("calculator");
		m5 = new JMenuItem("about");
		m4 = new JMenuItem("web");
		m6 = new JMenuItem("open notepad");
		m7 = new JMenuItem("color");
		
		m1.addActionListener(m);
		m2.addActionListener(m);
		m3.addActionListener(m);
		m4.addActionListener(m);
		m5.addActionListener(m);
		m6.addActionListener(m);
		m7.addActionListener(m);
		


		
		
		x.add(m1);
		x.add(m2);
		x.add(m3);
		x.add(m4);
		x.add(m5);
		x.add(m6);
		y.add(m7);
		mb.add(x);
		mb.add(y);
		f.setJMenuBar(mb);
		f.add(l);
		f.setSize(750, 500);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		about.setSize(400, 200);
		about.setAlwaysOnTop(true);
		about.setLocationRelativeTo(null);
		about.add(aboutText);
	}
	public void actionPerformed(ActionEvent e){
		Scanner input = new Scanner(System.in);
		String bkg;
		   String savedN = "";
		   String tempN = "";
		   boolean txtflg = false;

		String s = e.getActionCommand();
		String cmd = s;
		l.setText(s + " selected");
		cmd = s;
		if(cmd.equals("Time")) {
			l.setText("Today is: "+LocalDateTime.now());
		}
		if(cmd.equals("notepad")) {
			l.setText("please enter your text at the consle");
			System.out.println("type! press [enter] when you are done!");
			tempN = input.next();
			System.out.println("save?('Yes'/'No')");
			String Nchoice;
			Nchoice = input.next();
			if(Nchoice.equals("Yes")) {
				System.out.println("previous notepad overwritten. please return to the application. ");
				txtflg=true;
			}
			if(Nchoice.equals("No")){
				System.out.println("saved notepad is not overwritten. wiping temporary notepad. ");
				l.setText("choose a choice");

			}
		}
		if(cmd.equals("calculator")) {

		}
		if(cmd.equals("about")) {
			about.setVisible(true);
			aboutText.setText("version: JvmOS b.22y6m22d, changelog on top of code");
		}
		if(cmd.equals("web")) {
			l.setText("Please Wait while we set up the browser...");			
			
			try {
				URI uri= new URI("https://www.google.com");

			try {
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (IOException e1) {
				e1.printStackTrace();
			}			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			}
				System.out.println("log5");
		}
		if(cmd.equals("open notepad")) {
			l.setText(savedN);
			System.out.println("this should work...debug: "+savedN);
		}
		if(cmd.equals("color")) {
			System.out.println("what color do you want it to be? input is all caps");
			bkg = input.next();
			if(bkg.equals("RED")) {
				f.getContentPane().setBackground(Color.red);
		}
			if(bkg.equals("GREEN")) {
				f.getContentPane().setBackground(Color.green);
			}
			if(bkg.equals("BLUE")) {
				f.getContentPane().setBackground(Color.blue);
			}
			if(bkg.equals("WHITE")) {
				f.getContentPane().setBackground(Color.white);
			}
		}
		   if(txtflg=true) {
	savedN = tempN;
	System.out.println(savedN);
	tempN = "";
	txtflg=false;
}
	}
}
