/**
 * program to calculate the age of dog in equivalent human years 
 */
package hw1;
import java.util.Scanner;

public class DogYears {
	private static Scanner scnr;

	public static void main(String[] args) {
		int dogYears=0;
		int humanYears=0;
		scnr = new Scanner(System.in);
		System.out.println("Enter dogYears:");
		dogYears=scnr.nextInt();
		
		humanYears=7*dogYears;
		System.out.println("A "+dogYears+ " years old dog is about a "+humanYears+ " years old human.");
		
		return;
	}
}
