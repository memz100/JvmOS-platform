package ar;
import java.util.Scanner;
import java.io.IOException;
import java.net.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
public class Ar1 {
public static void main(String[]args) throws InterruptedException, IOException {
	Scanner input = new Scanner(System.in);
	String jj = "";
	String notepad1 = "haha you lookin at de code here, get out";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now(); 
	System.out.println("JvmOS v1.2");
	TimeUnit.SECONDS.sleep(1);
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
	   System.out.println(dtf.format(now));
	 }
	 if(command.equals("help")) {
		 System.out.println("'time' = show time");
		 System.out.println("'notepad' = write and save in a string format");
		 System.out.println("'calc' = calculator");
		 System.out.println("'c/notepad1' = open notepad");
		 System.out.println("'about' = displays the system");
		 System.out.println("'web' = goes to the web on your default browser(faulty!)");
		 System.out.println("'close' = terminates the entire system!");
	 }
	
	 if(command.equals("notepad")) {
		 
		 System.out.println("well, type! (previous note will be deleted! no space or else!)");
		 tempnote=input.next();
	 }
		if(command.equals("c/notepad1")) {
			System.out.println(notepad1);
		}
		if(command.equals("c/whyDidYouKillHim")) {
			while(true) {
				System.out.println("aSBkaWRudCBtZWFuIHRvLCBpdCB3YXMgTk9UIE1ZIEZBVUxUIQ==");
				System.out.println("15 Jan 1984");
			}
		}
			if(command.equals("about")) {
				System.out.println("System: Java virtual machine Operating System");
				System.out.println("processor: Java Virtual Augmentation core 4004 740 kHZ");
				System.out.println("memory: 52k DRAM");
				System.out.println("disk: 2 GB HD");
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
			    URL myURL = new URL("http://google.com");
			    URLConnection myURLConnection = myURL.openConnection();
			    myURLConnection.connect();
			    System.out.println("Netscape isnt available right now. ");
			}
			String close = "";
			if(command.equals("close")) {
				close = "gottem";
				System.out.println("ok...please wait");
			}
		TimeUnit.SECONDS.sleep(3);
	 command = jj;
	 while(close.equals("gottem")) {
		 System.out.println("closed");
		 System.exit(0);
	 }
	 }
	 
	 }
	
}
