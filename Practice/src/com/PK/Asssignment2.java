package com.PK;

import java.util.Scanner;

public class Asssignment2 {

	public static void Char_by_Char(String str) {	
			for(int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i) + " ");
			}		
			System.out.println("");
	}
	
	public static String Reverse(String str) {
		char ch;
		String str1 = "";
		for(int i = str.length() -1; i >=0 ; i--) {
			ch = str.charAt(i);
			str1 += ch;
		}		
		System.out.println(str1);
		
		return str1;
}
	
	public static boolean isPalindrome(String str1, String str2) {	
		return str1.equals(str2);	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a string value ");
		String val = sc.next();
		Char_by_Char(val);
//		System.out.println("Please Enter a string value for reversing the order ");
//		val = sc.next();
		String rv_val = Reverse(val);	
		boolean p = isPalindrome(val, rv_val);		
		if(p == false) {
			System.out.println("The value is not a Palindrome");
		}
		else {
			System.out.println("The value is a Palindrome");
		}		
		sc.close();
	}

}
