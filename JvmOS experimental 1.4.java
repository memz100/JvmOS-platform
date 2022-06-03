package ar;
import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
//JvmOS ex_1.4
//attempting to make the OS more user-friendly

public class Testing_room01 {
    Scanner input = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    protected static void initUI()throws IOException, URISyntaxException, InterruptedException {
        JPanel pane = newPane("JvmOS 1.4: a step in the right direction");
        JFrame frame = new JFrame("JvmOS 1.4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pane);
        frame.pack();
        frame.setVisible(true);

    }

    public static JPanel newPane(String labelText) {
        JPanel pane = new JPanel(new BorderLayout());
        pane.add(newLabel(labelText));
        pane.add(newButton("Start!"), BorderLayout.SOUTH);
        return pane;
    }

    private static JButton newButton(String label) {
        final JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Window parentWindow = SwingUtilities.windowForComponent(button);
                Scanner input = new Scanner(System.in);
                Calendar calendar = Calendar.getInstance();

                	String jj = "";
                	String notepad1 = "haha you lookin at de code here, get out";
                	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                	   LocalDateTime now = LocalDateTime.now(); 
                	System.out.println("JvmOS v1.4");
                	try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
                	System.out.print("\r\n"
                			+ "                                                                    \r\n"
                			+ "         ,---._                               ,----..               \r\n"
                			+ "       .-- -.' \\                    ____     /   /   \\   .--.--.    \r\n"
                			+ "       |    |   :                 ,'  , `.  /   .     : /  /    '.  \r\n"
                			+ "       :    ;   |              ,-+-,.' _ | .   /   ;.  \\  :  /`. /  \r\n"
                			+ "       :        |    .---.  ,-+-. ;   , ||.   ;   /  ` ;  |  |--`   \r\n"
                			+ "       |    :   :  /.  ./| ,--.'|'   |  ||;   |  ; \\ ; |  :  ;_     \r\n"
                			+ "       :         .-' . ' ||   |  ,', |  |,|   :  | ; | '\\  \\    `.  \r\n"
                			+ "       |    ;   /___/ \\: ||   | /  | |--' .   |  ' ' ' : `----.   \\ \r\n"
                			+ "   ___ l        .   \\  ' .|   : |  | ,    '   ;  \\; /  | __ \\  \\  | \r\n"
                	    	+ " /    /\\    J   :\\   \\   '|   : |  |/      \\   \\  ',  / /  /`--'  / \r\n"
                			+ "/  ../  `..-    , \\   \\   |   | |`-'        ;   :    / '--'.     /  \r\n"
                			+ "\\    \\         ;   \\   \\ ||   ;/             \\   \\ .'    `--'---'   \r\n"
                			+ " \\    \\      ,'     '---\" '---'               `---`                 \r\n"
                			+ "  \"---....--'                                                       \r\n"
                			+ "                                                                    \r\n"
                			+ "");
                	String command = ""; 
                	String tempnote = "";
                	while(command.equals("")) {
                		notepad1 = tempnote;
                	System.out.println("please type in your command, type 'help' for a list of commands");
                	command=input.next();
                	 if(command.equals("time")){
                			System.out.println("the day is: "+LocalDateTime.now());
                	 }
                	 if(command.equals("help")) {
                		 System.out.println("'time' = show time");
                		 System.out.println("'notepad' = write and save in a string format");
                		 System.out.println("'calc' = calculator");
                		 System.out.println("'notepad1' = open notepad");
                		 System.out.println("'about' = displays the system");
                		 System.out.println("'web' = goes to the web on your default browser(faulty!)");
                		 System.out.println("'logoff' = terminates the entire system!");
                	 }
                	
                	 if(command.equals("notepad")) {
                		 
                		 System.out.println("well, type! (previous note will be deleted! no space or else!)");
                		 tempnote=input.next();
                	 }
                		if(command.equals("notepad1")) {
                			System.out.println(notepad1);
                		}

                			if(command.equals("about")) {
                				System.out.println("i don't know what to do here"
                						+ "ok so yeah"
                						+ "bye");
                		}
                			if(command.equals("calc")) {
                				int n1;
                				System.out.println("calc 1.0: please insert 1st number");
                				n1=input.nextInt();
                				System.out.println("please input your second number");
                				int n2;
                				n2=input.nextInt();
                				System.out.println("what operation? +,-,*,/!");
                				String op;
                				op=input.next();
                				if(op.equals("+")) {
                					System.out.println(n1+n2);
                				}
                				if(op.equals("-")) {
                					System.out.println(n1-n2);
                				}
                				if(op.equals("*")) {
                					System.out.println(n1*n2);
                				}
                				if(op.equals("/")) {
                					System.out.println(n1/n2);
                				}
                				}
                			if(command.equals("web")) {
                				System.out.println("Please Wait while we set up the browser...");			
                				URI uri;
                				try {
									uri = new URI("https://www.google.com");
                					java.awt.Desktop.getDesktop().browse(uri);	
								} catch (IOException e1) {
									e1.printStackTrace();
								} catch (URISyntaxException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
                			}
                			String close = "";
                			if(command.equals("logoff")) {
                				close = "whiteFlag";
                				System.out.println("ok...please wait");
                			}
                			 now = LocalDateTime.now(); 
                		try {
							TimeUnit.SECONDS.sleep(3);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                	 command = jj;
                	 while(close.equals("whiteFlag")) {
                		 System.out.println("closed");
                		 System.exit(0);
                	 }
                	 }
                	 
                	 }
                	

        });
        return button;
    }

    private static JLabel newLabel(String label) {
        JLabel l = new JLabel(label);
        l.setFont(l.getFont().deriveFont(24.0f));
        return l;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
					initUI();
				} catch (IOException | URISyntaxException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
}
