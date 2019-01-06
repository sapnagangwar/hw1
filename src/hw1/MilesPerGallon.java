/**
 *  Calculates and prints the miles per gallon for a car that can
 *drive 350 miles on a 15-gallon tank of gas.
 */
package hw1;

public class MilesPerGallon {
	public static void main(String args[]) {
		int gallonsPerTank;
		int milesPerTank;
		double milesPerGallon;

		gallonsPerTank = 15; // We want to read this value in from the user
		milesPerTank = 350; // We want to read this value in from the user
		milesPerGallon = (double) milesPerTank / gallonsPerTank;
		System.out.println("Miles per gallon = " + milesPerGallon);
	}
}

/* RUN
Miles per gallon = 23.333333333333332
*/