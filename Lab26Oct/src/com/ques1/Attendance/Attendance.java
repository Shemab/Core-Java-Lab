//W.A.P to calculate attendance and avail that is student is l=eligible to sit in exam or not
//Shemab Alam
//26 Oct 2022

// Creating Packages
package com.ques1.Attendance;



//importing scanner
import java.util.Scanner;

//creating class
public class Attendance 
{
	//object of scanner
	static Scanner sc = new Scanner(System.in);
	
	//declaring instance variables
	static float total, attended, percentage;
	
	//input method
	public static void input()
	{
		
		//taking input
		System.out.println("Enter the total number of classes: ");
		total = sc.nextFloat();
		System.out.println("Enter the attended number of classes: ");
		attended = sc.nextFloat();
		
		//calling calculate method
		calculate(attended,total);
	}
	
	//calculating attendence method
	public static void calculate(float attended, float total)
	{
		float percentage = (attended/total)*100;
		
		//calling print method
		print(percentage);
	}
	
	//print method
	public static void print(float percentage)
	{
		//if else logic for 75% attendence
		if(percentage>=75)
		{
			System.out.println("Student is eligible to sit in the Examinations");
		}
		else
			System.out.println("Student is not eligible to sit in Examination");
	}
	
}