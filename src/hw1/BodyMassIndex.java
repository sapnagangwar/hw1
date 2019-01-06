/** 
 * Program to calculate and print the Body Mass Index(BMI) for the User.
 */
package hw1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BodyMassIndex {
	public static void main(String args[]) {
		int w = 0; // weight in kilograms
		int h = 0; // height in centimeters
		double bodyMassIndex; // BMI is Body Mass Index

		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		w = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your height in centimeters: ");
		h = scanner.nextInt();
		scanner.nextLine();
		scanner.close();

		bodyMassIndex = w / ((double) h / 100 * (double) h / 100);
		
		DecimalFormat dfBodyMassIndex;
		dfBodyMassIndex = new DecimalFormat("0.0");
		System.out.println("BMI is " + dfBodyMassIndex.format(bodyMassIndex) + " kg/sqcm.");
	}
}

/*RUN
Enter your weight in kilograms: 
50
Enter your height in centimeters: 
156
BMI is 20.5 kg/sqcm.
 */