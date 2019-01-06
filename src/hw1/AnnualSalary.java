/**
 * program for calculating user input
 */
package hw1;
import java.util.Scanner;	//Enables user input
public class AnnualSalary {
	public static void main(String args[]) {
		int hourlyWage=0;
		int annualSalary=0;
		
		Scanner scanner;
	    scanner=new Scanner(System.in);	//set up new scan characters from System.in
		System.out.println("Enter hourly wage:");
		hourlyWage= scanner.nextInt();	//read next integer from Scanner
		scanner.nextLine();
		scanner.close();
		
		annualSalary=hourlyWage*8*5*5*12;
		System.out.println("The annual salary is: "+"$"+annualSalary+".");
		
		return;
	}
}
