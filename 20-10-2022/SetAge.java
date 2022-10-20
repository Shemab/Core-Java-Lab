/* Take input of age of 3 people by user and determine oldest and youngest among them.
@auhtor:Shemab Alam
@date: 20-10-22
//LAB EXAM  */

//import packages
import java.util.*;
//Declare Class

class SetAge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Taking Input
		System.out.println("Enter age 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter  age 2 : ");
		int b = sc.nextInt();
		System.out.println("Enter age 3 : ");
		int c = sc.nextInt();
		
		//If else Ladder
		if(a>b&&a>c)
		{
			System.out.println("Oldest one is "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Oldest one is "+b);
		}
		else if(c>b&&c>a)
		{
			System.out.println("Oldest one is " +c);
		}
		else if(a<b&&a<c)
		{
			System.out.println("Youngest is " +a);
		}
		else if(b<a&&b<c)
		{
			System.out.println("Youngest is "+b);
		}
		else
		{
			System.out.println("Youngest is "+c);
		}
		
		
	}
	
}
