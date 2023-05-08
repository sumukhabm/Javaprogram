package com.sagar.sumukha;
import java.util.Scanner;



public class ScannerDemo {

    public static void main(String[] args) {
        // Create a new Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their username
        System.out.println("Enter the username:");
        
        // Read the user's input as a String
        String user = sc.nextLine();
        
        // Prompt the user to enter their contact number
        System.out.println("Enter the contact number:");
        
        // Read the user's input as a long integer
        long cn = sc.nextLong();
        
        // Display the user's input for the username and contact number
        System.out.println("Username: " + user);
        System.out.println("Contact number: " + cn);
        
        // Close the Scanner object to release system resources
        sc.close();
    }

}


/*output:
 * Enter the username:
Anonymous
Enter the contact number:
45862346853
Username: Anonymous
Contact number: 45862346853
 */


/*The Scanner class is used to get user input, and it is found in the java.util package.
To use the Scanner class, create an object of the class and use any of the available methods
 found in the Scanner class documentation. 
 In our example, we will use the nextLine() method, which is used to read Strings:*/

