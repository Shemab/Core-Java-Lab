/*  WAP to find the area
1.square
2. cube 
3. check number is even or odd using switch case."
@auhtor:Shemab Alam
@date: 20-10-22
//LAB EXAM  */

//Import packages
import java.util.*;
//Declare Class
class Area
{
	public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);


System.out.println("Enter the Sides: " );
int side =sc.nextInt();
  
System.out.println(" 1. Calculate area of Sqaure :" );
System.out.println(" 2. Calculate area of Cube :" );
System.out.println(" 3. Check Even or Odd :" );
System.out.println(" 4. Exit:" );

int choice = sc.nextInt();
 switch(choice)
 {
	 
			case 1: square(int side);
			break;
			case 2: cube(int side);
			break;
			case 3: EvenOdd(int side);
			break;
			case 4: System.exit(0);
			break;
			
		}
}
	//Main method for area of  square
	static void square(int s)
       {
	
	int area= (side*side);
	System.out.println("Area of square :" +area);
       }
   //Main method for area of Cube
   static void cube(int side)
       {
   int area= (6 * side * side);
   System.out.println("Area of Cube :" +area);
       }
    
	//Method for Even or Odd
	static void EvenOdd(int side)
	{
		if(s%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
	
	


   
   
	
  