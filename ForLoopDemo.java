package com.sagar.sumukha;

public class ForLoopDemo 
{
	public static void main(String[] args)
	{
		// Set the value of n to 5
		int n = 5;
       
		// Loop n times to print the character 'A' n times in each row
		for (int i = 0; i < n; i++) {
		    // Loop n times to print the character 'A' in the current row
		    for (int j = 0; j < n; j++) {
		        System.out.print("A");
		    }
		    // Move to the next line after printing the row
		    System.out.println();
		}
		
		// Loop n times to print characters 'A' through 'E' n times in each row
		for (int i = 0; i < n; i++) {
		    // Loop n times to print characters 'A' through 'E' in the current row
		    for (int j = 0; j < n; j++) {
		        // Print the character corresponding to the current value of j + 65 (i.e., 'A' through 'E')
		        System.out.print((char)(j+65));
		    }
		    // Move to the next line after printing the row
		    System.out.println();
		}

		
		// Set the initial value of k to 65
		int k = 65;

		// Loop n times to print characters 'A' through 'E' shifted by k positions n times in each row
		for (int i = 0; i < n; i++) {
		    // Loop n times to print the shifted characters in the current row
		    for (int j = 0; j < n; j++) {
		        // Print the character corresponding to the current value of j + k (i.e., 'A' through 'E' shifted by k positions)
		        System.out.print((char)(j+k));
		    }
		    // Increment the value of k by 6 for the next row
		    k = k + 6;
		    // Move to the next line after printing the row
		    System.out.println();
		}
	}

/* output :
 * AAAAA
AAAAA
AAAAA
AAAAA
AAAAA
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
GHIJK
MNOPQ
STUVW
YZ[\] */

