import java.util.*;
public class IncomeTaxCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble(); // input salary
		double tax;
		// for salary <5L tax is 0%
		if(salary < 500000){
			tax = salary * 0;
		}
		// for salary 5-10L tax is 20%
		else if(salary >= 500000 && salary <= 1000000){
			tax = salary * .2 ;
		}
		// for salary >10L tax is 30%
		else{
			tax = salary  * .3 ;
		}
		System.out.println("You income tax is " + tax);
	}
}