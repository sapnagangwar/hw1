/**
  *  Calculates and prints the miles per gallon for a car that can
  *  drive 350 miles on a 15-gallon tank of gas.
  */
package hw1;

import java.util.Scanner;

public class MilesPerGallon_castOperateUsage {
    public static void main(String args[]) {
        int gallonsPerTank;
        int milesPerTank;
        double milesPerGallon;
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("How many gallons fit in your tank?");
        gallonsPerTank = scanner.nextInt();// calling nextInt() method
        scanner.nextLine();    //scan past newline character that user typed
        System.out.println("How many miles can you drive on one tank?");
        milesPerTank = scanner.nextInt();// calling nextInt() method
        scanner.nextLine();    //scan past newline character that user typed
        scanner.close(); 
        
        milesPerGallon = (double)milesPerTank/gallonsPerTank;
        System.out.println("Miles per gallon = " + milesPerGallon);
    }
}

/*Run
How many gallons fit in your tank?
40
How many miles can you drive on one tank?
540
Miles per gallon = 13.5
*/

