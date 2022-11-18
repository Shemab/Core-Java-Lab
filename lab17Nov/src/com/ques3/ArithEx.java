//@author: Shemab Alam
//@date=17-11-22

package com.ques3;

import java.util.Scanner;


public class ArithEx {
	
	
	
	public class Test {
			//method to create menu
					static void menu()
					{
						System.out.println("1. Play");
						System.out.println("2. Exit");
						System.out.println("3. Score");
						System.out.println("Enter your choice: ");
					}
					
					//start main method
					public static void main(String args[])
					{
						menu();
						try {
						Scanner sc = new Scanner(System.in);
						int ch = sc.nextInt();
						System.out.println(ch);
						sc.close();
						
					}
					
					catch(ArithmeticException e)
					{
						System.out.println(e.getMessage());
					}
	} //end of main
	}//end of class test
}//end of ArithEx


