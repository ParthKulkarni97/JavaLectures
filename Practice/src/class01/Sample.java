package class01;
import java.util.Scanner;

import com.Age.*;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your age.");
		Age age = new Age();
		Scanner sc  = new Scanner(System.in);
		int input_age = sc.nextInt();
		age.displayEligibility(input_age);
		
	}

}
