package com.sagar.sumukha;
import java.util.Scanner;

public class Patterns {
	/*write a java program to print below pattern
	* * * * *
	* * * * *
	* * * * *
	* * * * *
	* * * * *
	*/

	//Box_Pattern 
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int n=sc.nextInt();
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	

	/*
	write a java program to print below pattern

	* * * * *
	*       *
	*       *
	*       *
	* * * * * 
	*/

	
	public class Box_Gap_Pattern 
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");// give 5 input
			int n=sc.nextInt();
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i==0||i==n-1||j==0||j==n-1)
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}


	/*
	write a java program to print below pattern

	* * * * *
	* *   * *
	*   *   *
	* *   * *
	* * * * *
	*/

	public class Box_X_Pattern {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int n=sc.nextInt();
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i==0||i==n-1||j==0||j==n-1||j==i||j+i==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
/*
	write a java program to print below pattern
	* 
	* *
	* * *
	* * * *
	* * * * *

*/


	public class RightAngleTriangle 
	{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int n=sc.nextInt();
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j <=i; j++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

	/*
	write a java program to print below pattern

	        *
	      * *
	    * * *
	  * * * *
	* * * * *
	*/
	

	public class LeftAngleTriangle {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            // print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }

	            // move to next line
	            System.out.println();
	        }

	        sc.close();
	    }
	}

	



}
