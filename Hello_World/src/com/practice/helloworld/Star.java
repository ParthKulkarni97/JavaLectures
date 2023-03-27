package com.practice.helloworld;

public class Star
{
    
    
    static void printSpace(int space){
        // base case
        if (space == 0) {        	
        	return;
        }
            
        System.out.print(" ");
 
        // recursively calling printSpace()
        printSpace(space - 1);
    }
    

    static void printStar(int stars)
    {
        // base case
        if (stars == 0){
            return;
        }
            
        
        System.out.print("* ");
 
        // recursively calling printStar()
        printStar(stars - 1);
    }
    
    
    static void pattern(int n, int num){
        if (n == 0)
            return;
        printSpace(n - 1);
        printStar(num - n + 1);
        System.out.println("");
 
        // recursively calling pattern()
        pattern(n - 1, num);
    }
    
    
}
