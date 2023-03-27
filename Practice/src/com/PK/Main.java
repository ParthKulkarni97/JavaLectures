package com.PK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Reverse rv = new Reverse();
//		Factorial fc = new Factorial(5);
//		SalaryAssignment sa = new SalaryAssignment();
//		sa.Display();
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please mention the value for the table:");
		System.out.println("Please mention how many rows:");
		int val = sc.nextInt();
//		Table_Assignment ta = new Table_Assignment(val);	
		Stars.DoStars(val);
			
	}

}
