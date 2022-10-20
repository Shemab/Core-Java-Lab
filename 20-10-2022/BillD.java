/* W.A.P to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty. cost of one unit is 540)
@auhtor:Shemab Alam
@date: 20-10-22
//LAB EXAM  */

//Import Package
import java.util.Scanner;

//Declare Class

class BillD
{
	//Start main method
	public static void main(String args[])
	{   
	    //Creating Object
		Scanner sc= new Scanner(System.in);
		
		//Enter the Quantity 
		System.out.println("Enter the Quantity:");
		    int qty=sc.nextInt();
			//Calculation of bill
		    int bill = (540 * qty);
			 
			//Starting of if else statement 
		   if( bill>=2000)
			{
				//Calculation of Discount
				int total = bill -(bill*10)/100;
				System.out.println("Bill Generated with Discount: " +total);
			}
			else
			{
				System.out.println(" Your Bill:" +bill);
			}// end of ifelse statement
			
	}// end of main
	
}//end of class BillD