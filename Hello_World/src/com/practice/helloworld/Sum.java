package com.practice.helloworld;

public class Sum {
	int sum;
	public int DisplaySum(int a, int b) {
		
		for ( int i = a; i<= b; i++ ) {
			sum = sum + i ;
		}
		 return sum;
	}
	
}
