package com.SevenMentor.Practice;

import java.util.Scanner;

public class SampleMain {

	
	int Area(int length, int breadth){
		return length * breadth;
	}
	
	int Area(int radius){
		return (int)(Math.PI * radius *radius);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the appropriate option to calculate the area of the geometric shapes:");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Square");
		
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		SampleMain sm  = new SampleMain();
		
		int side1, side2, area;
		switch(choice){  
	    //Case statements  
	    case 1: 
		System.out.println("For Rectangle, please enter length and breadth");
		 side1 = obj.nextInt();
		 side2 = obj.nextInt();
		area = sm.Area(side1, side2);
		System.out.println("The Area of rectangle is: " + area + " sq. units");
	    break;  
	    case 2:  
	    System.out.println("For Circle, please enter the radius");
	     side1 = obj.nextInt();
		area = sm.Area(side1);	    
		System.out.println("The Area circle is: " + area + " sq. units");
	    break;  
	    case 3:  
	    System.out.println("For Square, please enter side length");
	    side1 = obj.nextInt();
		area = sm.Area(side1, side1);
		System.out.println("The Area square is: " + area + " sq. units");
	    break;  
	    default:System.out.println("Wrong choice");  
		
	}
	}

}
