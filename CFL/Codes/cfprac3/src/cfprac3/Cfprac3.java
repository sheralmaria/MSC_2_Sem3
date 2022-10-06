/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfprac3;
import java.io.*;
import java.util.*;  
/**
 *
 * @author micha
 */
public class Cfprac3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Directory: ");
        String str1= sc.nextLine();//System.in is a standard input stream
        File dir = new File(str1);
        System.out.print("Enter first letter of file: ");  
        String str2= sc.nextLine();  
        FilenameFilter filter = new FilenameFilter() {
         public boolean accept (File dir, String name) { 
            return name.startsWith(str2);
         } 
      }; 
      String[] children = dir.list(filter);
      if (children == null) {
         System.out.println("Either dir does not exist or is not a directory"); 
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            System.out.println(filename);
         } 
      } 
    }
    
}
