//@author: Shemab Alam
//@date=17-11-22

package com.ques2;

import java.util.Scanner;

public class StringOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String");
		String a = sc.next();
		System.out.println("Input next String");
		String c = sc.next();
		int length= a.length()
				
				
				
				
				
				;
		char b=a.charAt(1);
		String con= a.concat(c);
		int q= a.compareTo(c);
		String strip= a.strip();
		System.out.println("Length of String = "+length);
		System.out.println("Char at index 1= "+b);
		System.out.println("String after Concatenation: "+con);
		System.out.println("Value after comparing both strings = " +q);
		System.out.println("String Strip: "+strip);
		sc.close();
		
	}

}
