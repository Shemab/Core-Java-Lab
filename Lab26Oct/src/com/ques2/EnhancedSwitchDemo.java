//w.a.p to enter brand name and display its tagline
//Shemab Alam
//26 Oct 2022




//creating package
package com.ques2;

//importing packages
	import java.util.Scanner;

//Declareing Class
public class EnhancedSwitchDemo {

	

		//Method for Tagline
		static void PrintTagline(String BrandName)
		{
			//Switch case
			switch(BrandName)
			{
				case "DELL": System.out.println("Innovation that stops at nothing.");
				break;
				case "HCL": System.out.println("Supercharging Progress");
				break;
				case "MOTOROLA": System.out.println("Hello!! Moto");
				break;
				case "MICROSOFT": System.out.println("We believe in what people make possible.");
				break;
				case "XEROX": System.out.println("Powering Today's Workforce.");
				break;
				
			}//end of switch case
		}//end of printagline
		
		//main
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Brand Name: ");
			String BrandName= sc.next().toUpperCase();
			PrintTagline(BrandName);
			
		}//end of main
		
		
	}//end of class
