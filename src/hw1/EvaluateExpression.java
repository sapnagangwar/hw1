/**
 *Print the value of the expression 
 */
package hw1;
public class EvaluateExpression {
	public static void main(String[] args) {
		int f = 9;
		int h = 7;
		int x = 4;
		double result;

		result = (1 + h) * (1 - f) / ((double) (3 * f) / (h * h - x));
		System.out.println("The value of the expression: " + result);
	}
}

/* RUN
The value of the expression: -106.66666666666667
*/
