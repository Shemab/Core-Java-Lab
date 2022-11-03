//W.A.P to print daimond pattern
//Shemab Alam
//3 November 2022
// Lab test

//create package 
package com.ques1;

//import package 
import java.util.Scanner;

//declare class
public class Patterns
{
	//main method
	public static void main(String[] args) 
	
	{
		
		
		//Creating an  object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variable
				int i, j;
				
				//enter the values 
				System.out.println("Enter the number or rows of Diamond: ");
				
				int p = sc.nextInt();
				////////////////////////////////////Upper part//////////////////////////////////////
				//Declaring rows
				for(i=0; i<p; i++)
				{
					//Printing  spaces
					for(j=5; j>i; j--)
					{
						
						System.out.print(" ");
						
					}
					
					//Printing stars
					for(j=0; j<=i; j++)
					{
						System.out.print(" * ");
					}
					
			System.out.println();
				}
				///////////////////////////////////////Lower part//////////////////////////////////////////
				
				//Declaring  rows
				for(i=0;i<p;i++)
				{
					//Printing spaces
					for(j=0; j<=i; j++)
					{
						System.out.print("  ");
					}
					//Printing stars
					for(j=4; j>i; j--)
					{
						System.out.print(" * ");
					}
					
			System.out.println();
				}

	}//end of main

}//end of class

