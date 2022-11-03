//Piggy Bank
//Shemab Alam
//3 November 2022
// Lab test

package com.ques3;

import java.util.Scanner;
public class PiggyVal {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("WELCOME TO YOUR PIGGIE BANK");
			
			PiggyBank c1 = new PiggyBank();
			
			 c1.setAmount(50);
			
			int addamt;
			
			int choice;
			System.out.println("Do you want to add more: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:System.out.println("Enter the amount: ");
				addamt = sc.nextInt();
				c1.setAddamt(addamt);
				System.out.println("AMOUNT ADDED SUCCESSFULLY");
				System.out.print("Your Amount is: "+c1.getAddamt());
				break;
			case 2:System.out.print("Your Amount is: "+c1.getAmount());
				break;
			default:
				System.out.println("Invalid Input....");
			}

		}

	}


