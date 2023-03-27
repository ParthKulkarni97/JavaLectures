import java.util.*;
class Sample
{
	public static void main(String args[]){

 		System.out.println("Please enter the numbers a and b rspectively");
		Scanner sC = new Scanner(System.in);
		int a = sC.nextInt();
		int b = sC.nextInt();
		int c = a*b;
		System.out.println("The product of the numbers is: " + c);

	}


}