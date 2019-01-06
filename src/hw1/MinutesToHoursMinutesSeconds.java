/**
 * Progrm to calculate and print minutes into hours and minutes.
 */
package hw1;
import java.util.Scanner;
public class MinutesToHoursMinutesSeconds {
	public static void main(String[] args) {
		double hours=0;
		double minutes=0;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter required minutes: ");
		minutes=scanner.nextDouble();
		scanner.nextLine();
		
		hours=minutes/60;
		minutes=minutes%60;
		System.out.println("Conversion :" + hours + " hours and " + minutes + " minutes");
	}
	
}
