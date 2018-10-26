/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputlab;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author asaromat
 */
public class InputLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Create a program that asks the user for input and chooses what to do
        based on that input*/
        Scanner scan = new Scanner(System.in);
        
        double bal = 0;
        double balF = bal - 59.99;
        
        System.out.println("Type in your balance here:");
        
        while(scan.hasNext()) {
         bal = scan.nextInt();
         
         if(bal >= 59.99){
             out.println("With a balance of " + bal + ", you have enough to "
                     + "buy the new " + "video game.");
         } else {
             out.println("With a balance  " + bal + ", you do not have enough"
                     + " to buy the new video game.");
         
             
         }
        
        }
    }
    
}