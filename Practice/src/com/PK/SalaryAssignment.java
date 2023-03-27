package com.PK;

import java.util.Scanner;

public class SalaryAssignment {
	
	int salArr_ [] = new int[5];
	int sum_;
	int avg_;

	public SalaryAssignment() {
		System.out.println("Please Enter the salary");
		Scanner sc  = new Scanner(System.in);
		
		for (int i = 0; i < salArr_.length; i ++) {
			salArr_[i] = sc.nextInt();
		}
		
	}
	 public void Display() {
		  for(int data: salArr_) {
			  sum_ += data;
		  }
		  avg_ = sum_/5;
		  System.out.println("The sum of the salary is " + sum_);
		  System.out.println("and the average is " + avg_);
	 }
	

}
