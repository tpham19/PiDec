import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This program finds PI to the Nth digit. The user enters a number and have the
 * program generate PI up to that number of decimal places.
 *
 */
public class PiDec {

	public static void main(String[] args) {
		BigDecimal seven = new BigDecimal(7.0);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the decimal places to which you like PI printed: ");
		int num = input.nextInt();
		BigDecimal pi = new BigDecimal(22.0).divide(seven, num, BigDecimal.ROUND_UP);
		if (num > 100 || num < 0) {
			System.out.println("Decimal place out of bounds!");
		} else {
			System.out.println(pi);
		}
	}
}
