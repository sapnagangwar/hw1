/** Program to calculate and print the Body Mass Index(BMI) for the User
 * 
 */
package hw1;

import java.util.Scanner;

public class BMIInputDoubles {
	public static void main(String[] args) {
		double w; //weight in kilograms
		double h; //height in centimeters
		double bodyMassIndex; //BMI is Body Mass Index
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		w=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter your height in centimeters: ");
		h=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		
		bodyMassIndex = w/(h/100*h/100);
		System.out.println("BMI is " + bodyMassIndex +" kg/sqcm");
	}
}
