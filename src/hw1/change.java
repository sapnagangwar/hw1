/**
 * how to give out 98 cents in a change
 * calculate the number of quarters, dimes, nickels and cents
 */
package hw1;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		int changeToGive;
		System.out.println("How much to give out in change?");
		Scanner scanner;
		scanner = new Scanner(System.in);//call constructor
		changeToGive = scanner.nextInt();
		scanner.close();
		int quarters, dimes, nickels, pennies = 0;

		quarters = changeToGive / 25;
		changeToGive = changeToGive % 25;

		dimes = changeToGive / 10;
		changeToGive = changeToGive % 10;

		nickels = changeToGive / 5;
		changeToGive = changeToGive % 5;

		pennies = changeToGive;

		System.out.println("quarters=" + quarters + ",dimes=" + dimes);
		System.out.println("nickels=" + nickels + ",pennies=" + pennies);
	}
}
