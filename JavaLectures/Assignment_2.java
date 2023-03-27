import java.util.*;
class Assignment_2
{
	public static void main(String args[]){

 		System.out.println("Please enter the Marks:");
		Scanner obj = new Scanner(System.in);
		int marks = obj.nextInt();
		if(marks> 100){
			marks = 100;
		}
		if(marks >= 91 && marks <= 100 ){
			if(marks>=99){
				System.out.println("Congratulations you have recieved full Scholarship");
			}
			System.out.println("Congratulations you have secured A+");
		}
		else if(marks >= 76 && marks <=90){
			System.out.println("Congratulations you have secured A");
		}
		else if(marks >= 60 && marks <= 75 ){
			System.out.println("Congratulations you have secured B+");
		}
		else if(marks >= 50 && marks <= 59){
			System.out.println("Congratulations you have secured B");
		}
		else if(marks >= 35 && marks <= 49){
			System.out.println("Congratulations you have secured C");
		}
		else{
			System.out.println("Good Try!! Better luck next time");
		}
		

	}


}