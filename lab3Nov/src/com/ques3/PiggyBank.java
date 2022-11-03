//Piggy Bank
//Shemab Alam
//3 November 2022
// Lab test

package com.ques3;


	public class PiggyBank {
		
		private  int addamt;
		private int amount;
		
		
		public PiggyBank() 
		{
			super();
			// TODO Auto-generated constructor stub
			System.out.println("DEFAULT CONSTRUCTOR");
			this.amount=50;
		}



		public PiggyBank(int addamt, int amount) 
		{
			super();
			System.out.println("PARAMERISED CONSTRUCTOR");
			this.addamt = addamt;
			this.amount = amount;
		}



		public int getAddamt() {
			return addamt;
		}



		public int setAddamt(int addamt) {
			return this.addamt += addamt;
		}



		public int getAmount1() {
			return amount;
		}



		public void setAmount(int amount) {
			this.amount = amount;
		}



		public  String getAmount() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		
		
		

	}


