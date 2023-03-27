package com.PK;

public class Stars {
	
	public static void DoStars(int row) {
		int letter = 65;
		for(int i = 0; i < row; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print( (char)(letter + j) + " ");   
			}   
		System.out.println();
		}
	}

}
