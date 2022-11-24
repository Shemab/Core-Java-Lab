package com.ques2;

	
	public class Inheritance {

		public void display()
		{
			System.out.println("This is a Parent Class");
		}

	}

	class B extends Inheritance{

		public void display()
		{
			super.display();
			System.out.println("This is a Child Class");
		}
	}



