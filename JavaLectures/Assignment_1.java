import java.util.*;
class Assignment_1
{
	public static void main(String args[]){

 		System.out.println("Please enter the numbers a and b respectively");
		Scanner sC = new Scanner(System.in);
		int a = sC.nextInt();
		int b = sC.nextInt();
		int c = a*b;
		System.out.println("The product of the numbers is: " + c);

		c = a/b;
		System.out.println("The divison of the numbers is: " + c);

		c = a+b;
		System.out.println("The addition of the numbers is: " + c);

		c = a-b;
		System.out.println("The subtraction of the numbers is: " + c);

		c = a%b;
		System.out.println("The remainder of the numbers is: " + c);

	}


}