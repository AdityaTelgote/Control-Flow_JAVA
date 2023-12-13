/*Question
 * after creating movie Discount then the first part of the exercise with time to spare add the following feature.

Have the app prompt normal ticket buyers for the number of tickets they wish to buy.
For every two or more tickets sold, give a 30% discount. 
 */

package Aditya;

import java.util.Scanner;

public class TicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets you wish to buy: ");
        int numTickets = scanner.nextInt();

        double ticketPrice = 10.0; // Assuming the ticket price is $10

        double totalPrice;

        if (numTickets >= 2) {
            int numPairs = numTickets / 2;
            int singleTickets = numTickets % 2;

            double totalPriceWithDiscount = numPairs * (2 * ticketPrice * 0.7); // 30% discount for each pair of tickets
            double totalPriceWithoutDiscount = singleTickets * ticketPrice;

            totalPrice = totalPriceWithDiscount + totalPriceWithoutDiscount;
        } else {
            totalPrice = numTickets * ticketPrice;
        }

        System.out.println("Total price for " + numTickets + " ticket(s): $" + totalPrice);

        scanner.close();
    }
}
