package com.PK;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNumber {
	
	int num1_, num2_, num3_;
	
	public CheckNumber(int num1, int num2, int num3) {
		this.num1_ = num1;
		this.num2_ = num2;
		this.num3_ = num3;
	}

	public void DisplayNumber() {
		int [] array = new int [] {num1_,num2_,num3_};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array); 
		
		System.out.println("The largest number is " + array[2]);
	}

	public static void main(String[] args) {
		System.out.println("Please enter three numbers");
		try (// TODO Auto-generated method stub
				
		Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt();
			int b = obj.nextInt();
			int c = obj.nextInt();
			CheckNumber cm = new CheckNumber(a, b, c);
			cm.DisplayNumber();
		}
		
	}

}
