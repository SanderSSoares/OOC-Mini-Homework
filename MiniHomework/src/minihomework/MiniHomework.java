/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomework;

import java.util.Scanner;

/**
 *
 * @author sande
 */
public class MiniHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Adding Scanner
        Scanner kb = new Scanner (System.in);
  
        //Prompt first number to the user
        System.out.println("Please pick a number.");
        //Getting user input
        int num1 = kb.nextInt();
        //Displaying second prompt
        System.out.println("Now please, insert a second number");
        //Second input
        int num2 = kb.nextInt();
        
        int sum = num1+num2;
        
        System.out.println("The SUM of " + num1+"+ " +num2+" is " +sum +" !");
        
        
    }
    
}
