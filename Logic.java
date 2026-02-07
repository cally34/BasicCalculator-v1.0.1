/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatorv2;

/**
 *
 * @author gmlol
 */
import java.util.Scanner;
public class Logic {
    private Scanner sc = new Scanner(System.in);
    
    public void readNumber(){
        System.out.println(" _______  _______  _        _______           _        _______ _________ _______  _______                   __           _______         __   \n" +
"(  ____ \\(  ___  )( \\      (  ____ \\|\\     /|( \\      (  ___  )\\__   __/(  ___  )(  ____ )        |\\     /|/  \\         (  __   )       /  \\  \n" +
"| (    \\/| (   ) || (      | (    \\/| )   ( || (      | (   ) |   ) (   | (   ) || (    )|        | )   ( |\\/) )        | (  )  |       \\/) ) \n" +
"| |      | (___) || |      | |      | |   | || |      | (___) |   | |   | |   | || (____)|        | |   | |  | |        | | /   |         | | \n" +
"| |      |  ___  || |      | |      | |   | || |      |  ___  |   | |   | |   | ||     __)        ( (   ) )  | |        | (/ /) |         | | \n" +
"| |      | (   ) || |      | |      | |   | || |      | (   ) |   | |   | |   | || (\\ (            \\ \\_/ /   | |        |   / | |         | | \n" +
"| (____/\\| )   ( || (____/\\| (____/\\| (___) || (____/\\| )   ( |   | |   | (___) || ) \\ \\__          \\   /  __) (_   _   |  (__) |   _   __) (_\n" +
"(_______/|/     \\|(_______/(_______/(_______)(_______/|/     \\|   )_(   (_______)|/   \\__/           \\_/   \\____/  (_)  (_______)  (_)  \\____/\n" +
"                                                                                                                                              ");
        int choice;
        do {
            System.out.println("[0] To exit program");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division\n");
            
        
            System.out.println("Choose Arithmetic Logic (0-4): ");
            choice = sc.nextInt();
        
            if (choice == 0){
                System.out.println("Session Terminated");
                break;
                
            }
            System.out.println("Enter a number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter another number: ");
            double num2 = sc.nextDouble();
            
           switch (choice){
               case 1:
                   System.out.printf("Result: %,.2f\n", (num1 + num2));
                   System.out.println("==============================");
                   break;
               case 2:
                   System.out.printf("Result: %,.2f\n", (num1 - num2));
                   System.out.println("==============================");
                   break;
               case 3:
                   System.out.printf("Result: %,.2f\n", (num1 * num2));
                   System.out.println("==============================");
                   break;
               case 4:
                   if (num2 == 0){
                       System.out.println("Cannot Divide by Zero!");
                       System.out.println("==============================");
                   } else {
                       System.out.printf("Result: %,.2f\n", (num1 / num2));
                       System.out.println("==============================");
                   }
                   break;
               default:
                   System.out.println("Enter a valid number");
                   System.out.println("==============================");
                   
                   
           
           }    
        }while(true);

    }
}
    