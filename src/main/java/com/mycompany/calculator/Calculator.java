/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
       
package com.mycompany.calculator;
        
import java.util.Scanner;


/**
 *
 * @author Nipu Pc
 */
public class Calculator {

   
        public static void main(String[] args) {

       Scanner scanner =new Scanner(System.in);
       
       System.out.println("\t   Calculator"); 
       System.out.println("\t ================"); 

        
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nEnter your choice: ");
        int choice = (int) scanner.nextFloat();
        System.out.println();


        switch(choice){
        case 1:
            addition(); break;
       
        case 2:
            subtraction(); break;
            
        case 3:
           division(); break;
            
        case 4:
            multiplication(); break;
            
        default:
            System.out.println("Invalid "); break;
           
        
        }
        
    }

    public static void addition(){

        float nOne, nTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        nOne = scanner.nextFloat();

        System.out.print("\nSecond Number: ");
        nTwo = scanner.nextFloat();

        scanner.close();
        System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
    }

    public static void subtraction(){
        float nOne, nTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        nOne = scanner.nextFloat();

        System.out.print("\nSecond Number: ");
        nTwo = scanner.nextFloat();

        scanner.close();
        System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }

    public static void division(){
        float nOne, nTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = scanner.nextFloat();

        System.out.print("\nSecond Number: ");
        nTwo = scanner.nextFloat();

        scanner.close();
        System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }

    public static void multiplication(){
        float nOne, nTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        nOne = scanner.nextFloat();

        System.out.print("\nSecond Number: ");
        nTwo = scanner.nextFloat();

        scanner.close();
        System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
    }
}
        
   

