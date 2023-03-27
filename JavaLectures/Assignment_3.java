import java.util.*;
class Assignment_3
{
	
	public static float SalaryDeduction(float salary, float rate){
		return ((salary * rate)/100);
	}
		
	public static void main(String args[]){

 		System.out.println("Please enter your annual income:");
		Scanner obj = new Scanner(System.in);
		float salary = obj.nextFloat();
		float value = 0.0f;
		//Assignment_3 as3 = new Assignment_3();
		
		if(salary  < 2499){
			value = Assignment_3.SalaryDeduction(salary,0.0f);
		}
		else if(salary  >= 2500  && salary  <= 5000){
			value = Assignment_3.SalaryDeduction(salary,5.0f);
		}
		else if(salary  >= 5000  && salary  <= 2500){
			value = Assignment_3.SalaryDeduction(salary,7.5f);
		}
		else if(salary  >= 5001  && salary  <= 10000){
			value = Assignment_3.SalaryDeduction(salary,10.0f);
		}
		else if(salary  >= 10001  && salary  <= 15000){
			value = Assignment_3.SalaryDeduction(salary,15.0f);
		}
		else if(salary  >= 20001){
			value = Assignment_3.SalaryDeduction(salary,20.0f);
			
		}
		System.out.println("The tax amount cut is $" + value);
		

	}


}