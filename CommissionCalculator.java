/*Question
 * Using Eclipse IDE to write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%. 
 */
package Aditya;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales figure: $");
        double salesFigure = scanner.nextDouble();
        double commission = calculateCommission(salesFigure);

        if (commission == -1) {
            System.out.println("No commission for sales below $1000");
        } else {
            System.out.println(salesFigure);
        }
        
        scanner.close();
    }

    public static double calculateCommission(double sales) {
        double commission = 0;

        if (sales > 10000) {
            commission = sales * 0.3;
        } else if (sales >= 5001 && sales <= 9999) {
            commission = sales * 0.2;
        } else if (sales >= 1001 && sales <= 4999) {
            commission = sales * 0.1;
        } else {
            return -1; // No commission for sales below 1000
        }

        return commission;
    }
}

