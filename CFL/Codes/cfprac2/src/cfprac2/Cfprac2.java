package cfprac2;
import java.io.*;
import java.util.logging.*;

public class Cfprac2 {

    public static void main(String[] args) {
       Logger l=Logger.getLogger(Cfprac2.class.getName());
       		 FileHandler fh;
        		try
      	       {
      		 fh=new FileHandler("D:/mylogfile.log",true);
       		 l.addHandler(fh);
       		 l.setLevel(Level.ALL);
      		  SimpleFormatter sf=new SimpleFormatter();
        		fh.setFormatter(sf);
       		 l.info("My first log");
   	     }
   	 catch(SecurityException e)
 	   {
      		  e.printStackTrace();
 	   }
    	catch(IOException e)
 	   {
       		 e.printStackTrace();
   	 }
  	  l.info("This is CFL Prac 2");

    }
    
}
