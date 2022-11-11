//@author= Shemab Alam
//@date:10Nov 2022

package com.ques5;

//creating class
public class Car {
	
	//enum
	enum car{Bmw(2015), Audi(2018), Mercedes(2020);
		int i;
		car(int i)
		{
			this.i= i;
		}};
	
	//main method
		public static void main(String[] args)
	{
		for(car c:car.values())
		{
			System.out.println(c+"-"+c.i);
		}
	}
}

