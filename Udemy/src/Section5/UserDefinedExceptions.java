package Section5;

// continue 

import java.util.Scanner;

// PaymentsApp

public class UserDefinedExceptions {
	
	// Take a payment from a user

	public static void main(String[] args) {
		double payment=0;
		boolean positivePmt = true;

		do {
			// 1. Ask the user for input
			System.out.print("Enter the payment amount: ");
		
			// 2. Get the amount and test the value
			Scanner in = new Scanner(System.in);
			// int amount = in.nextInt();
			// System.out.println(amount); 

			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePmt=true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.print("Please try again. ");
				positivePmt = false;
			}
			
		} while(!positivePmt);
		
		// 4. Print confirmation 
		System.out.println("Thank you for your payment of $" + payment);
		

	}

}
