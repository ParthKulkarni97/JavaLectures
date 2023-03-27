package com.practice.helloworld;

public class Fibbonacci {
	
	public int Fib(int n) 
	{
		//Base condition
		if(n==1 || n==2)
			return 1;
		
		return Fib(n-1) + Fib(n-2);
	}
	
	

}
