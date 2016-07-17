/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 *
 * @author Siva
 */

    /**
     * @param args the command line arguments
     */
   

class hello
{  
 
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      for(int i=0;i<a.length();i++)
      {
          System.out.println("String is: "+a);
      }
    }
} 
    
    
