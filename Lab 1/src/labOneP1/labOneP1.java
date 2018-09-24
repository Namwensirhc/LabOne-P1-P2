
package labOneP1;

import java.util.Scanner;

public class labOneP1 {
	/*
	 * Input: Your program should read two integer numbers from the user with the
	 * same number of digits (example: number1= 234, number2 = 564). * USE nextInt()
	 * etc.* Task: Check if each corresponding place in the two numbers (ones, tens,
	 * hundreds, …) sums to the same total. Output: Your program should print out:
	 * True or False based on the result. * If, Else, Switch? * Examples: Number1 =
	 * 153 , Number2 = 345 => 1+3 ≠ 5+4 ≠ 3+5Program prints False. Number1 = 543 ,
	 * Number2 = 456 => 5+4 = 4+5 = 3+6 Program prints True. Things to look for: -
	 * Do proper validation on the user’s input. - Write the task in a separate
	 * method. - Provide adequate comments. - Provide adequate user prompts.
	 */
	static Scanner scan = new Scanner(System.in);
	static int num1;
	static int num2;
	static String errorMessage2 = "Your number does not contain the same amount of digits as your first, Please try again: ";
	static String errorMessage1 = "That's not a positive number you feeble ingrate. Try again.";
	// static int length1 = String.valueOf(num1).length();
	// static int length2 = String.valueOf(num2).length(); This was the originally
	// way I was using to match individual digits
	static int length1 = (int) (Math.log10(num1) + 1);
	static int length2 = (int) (Math.log10(num2) + 1);
	static int place10;
	static int tenDigit;
	static int place9;
	static int ninDigit;
	static int place8;
	static int eigDigit;
	static int place7;
	static int sevDigit;
	static int place6;
	static int sixDigit;
	static int place5; // I ended up putting the majority of my variables up here so that
	static int fivDigit; // would stop getting errors when the method couldn't reach them
	static int place4; // these variables were originally in two columns on the same line which was a
						// bad idea
	static int fouDigit;
	static int place3;
	static int thiDigit;
	static int place2;
	static int secDigit;
	static int place1;
	static int firDigit;
	static int firDigitb;
	static int secDigitb;
	static int thiDigitb;
	static int fouDigitb;
	static int fivDigitb;
	static int sixDigitb;
	static int sevDigitb;
	static int eigDigitb;
	static int ninDigitb;
	static int tenDigitb;
	static int place10b;
	static int place9b;
	static int place8b;
	static int place7b;
	static int place6b;
	static int place5b;
	static int place4b;
	static int place3b;
	static int place2b;
	static int place1b;
	static String trueLife = "Your numbers are true human, I shall spare you this day";
	static String falseDeath = "Your numbers are lies pitiful human, I cannot abide by your existence";

	public static void main(String[] args) {
		p1(); // while i originally made the program almost entirely in main, when I looked up
				// methods I figured
	} // that it would be much easier to work on each step individually in its own
		// method.

	public static void p1() {
		{ // p1 became my new main, meaning I staged the majority of the framework of the
			// application here
			System.out.print("Please enter a positve number human: ");
		}
		num1 = scan.nextInt();
		if (num1 > 0) { // originally i was trying to use while statements with both || and other
						// operators
			System.out.println("Thank You primitive life form for entering " + num1
					+ "! It appears I will not have to eliminate your biological life form from the gene pool. ");
			System.out.println("One more request though, ");
			System.out.println("please enter another positive number with the same amount of digits as " + num1 + ":");
			num2 = scan.nextInt();
			// final int length1 = String.valueOf(num1).length(); // these are from my
			// original way to validate the amount of digits
			// final int length2 = String.valueOf(num2).length(); // I switched to log 10
			// because i kept running into problems with the numbers being Strings
			length1 = (int) (Math.log10(num1) + 1);
			length2 = (int) (Math.log10(num2) + 1);
			if (length1 == length2) {
				System.out.println("Thank you lowly life form, you chose numbers: " + num1 + "," + num2);
				System.out.println("Please give me a moment to calculate a few things...");
				digitsep();
				compare();
			} else {
				System.out.println("Too many invalid inputs.  .  . Program resetting   ");
				p1(); // I tried to make a trycatch to fix this so the program wouldn't terminate with
						// wrong inputs
			} // but ended up causing a good amount of issues so I did the cheap thing and
				// just reset everything
		} else if (num1 < 0) {
			System.out.println(errorMessage1 + "\n");
			p1();
		} else {
			System.out.println(errorMessage1);
			p1();
		}

	}

	public static void digitsep() { // I found this formula on stackoverflow, I copied the majority of it and then
									// added variables later
									// Originally i never planned on putting in any numbers bigger than 4 digits so
									// this covering my ass
		switch (length1) { // and allowed me to reliable use int rather than long
		case 10: // my first attempt tried to do this using an if else statement but switches
					// seemed easier after doing some research
			place10 = num1 % 1000000000;
			place10 = num1 - place10;
			tenDigit = place10 / 1000000000;
		case 9:
			place9 = num1 - place10;
			place9b = place9 % 100000000;
			place9 = place9 - place9b;
			ninDigit = (place9 / 100000000);
		case 8:
			place8 = (num1 - place10) - place9;
			place8b = place8 % 10000000;
			place8 = place8 - place8b;
			eigDigit = (place8 / 10000000);
		case 7:
			place7 = ((num1 - place10) - place9) - place8;
			place7b = place7 % 1000000;
			place7 = place7 - place7b;
			sevDigit = (place7 / 1000000);
		case 6:
			place6 = (((num1 - place10) - place9) - place8) - place7;
			place6b = place6 % 100000;
			place6 = place6 - place6b;
			sixDigit = (place6 / 100000);
		case 5:
			place5 = ((((num1 - place10) - place9) - place8) - place7) - place6;
			place5b = place5 % 10000;
			place5 = place5 - place5b;
			fivDigit = (place5 / 10000);
		case 4:
			place4 = (((((num1 - place10) - place9) - place8) - place7) - place6) - place5;
			place4b = place4 % 1000;
			place4 = place4 - place4b;
			fouDigit = (place4 / 1000);
		case 3:
			place3 = ((((((num1 - place10) - place9) - place8) - place7) - place6) - place5) - place4;
			place3b = place3 % 100;
			place3 = place3 - place3b;
			thiDigit = (place3 / 100);
		case 2:
			place2 = (((((((num1 - place10) - place9) - place8) - place7) - place6) - place5) - place4) - place3;
			place2b = place2 % 10;
			place2 = place2 - place2b;
			secDigit = (place2 / 10);
		case 1:
			place1 = ((((((((num1 - place10) - place9) - place8) - place7) - place6) - place5) - place4) - place3)
					- place2;
			place1b = place1 % 1;
			place1 = place1 - place1b;
			firDigit = (place1 / 1);
			break;
		default:
			break;
		} // these are too validate the two inputs lengths and allow me to give them
			// individual variable names
		switch (length2) {
		case 10:
			place10 = num2 % 1000000000;
			place10 = num2 - place10;
			tenDigitb = place10 / 1000000000;
		case 9:
			place9 = num2 - place10;
			place9b = place9 % 100000000;
			place9 = place9 - place9b;
			ninDigitb = (place9 / 100000000);
		case 8:
			place8 = (num2 - place10) - place9;
			place8b = place8 % 10000000;
			place8 = place8 - place8b;
			eigDigitb = (place8 / 10000000);
		case 7:
			place7 = ((num2 - place10) - place9) - place8;
			place7b = place7 % 1000000;
			place7 = place7 - place7b;
			sevDigitb = (place7 / 1000000);
		case 6:
			place6 = (((num2 - place10) - place9) - place8) - place7;
			place6b = place6 % 100000;
			place6 = place6 - place6b;
			sixDigitb = (place6 / 100000);
		case 5:
			place5 = ((((num2 - place10) - place9) - place8) - place7) - place6;
			place5b = place5 % 10000;
			place5 = place5 - place5b;
			fivDigitb = (place5 / 10000);
		case 4:
			place4 = (((((num2 - place10) - place9) - place8) - place7) - place6) - place5;
			place4b = place4 % 1000;
			place4 = place4 - place4b;
			fouDigitb = (place4 / 1000);
		case 3:
			place3 = ((((((num2 - place10) - place9) - place8) - place7) - place6) - place5) - place4;
			place3b = place3 % 100;
			place3 = place3 - place3b;
			thiDigitb = (place3 / 100);
		case 2:
			place2 = (((((((num2 - place10) - place9) - place8) - place7) - place6) - place5) - place4) - place3;
			place2b = place2 % 10;
			place2 = place2 - place2b;
			secDigitb = (place2 / 10);
		case 1:
			place1 = ((((((((num2 - place10) - place9) - place8) - place7) - place6) - place5) - place4) - place3)
					- place2;
			place1b = place1 % 1;
			place1 = place1 - place1b;
			firDigitb = (place1 / 1);
			break;
		default:
			break;
		}
		compare();
	}

	public static void compare() {
		switch (length1) { // having tested if length1 and 2 above i only had to write one of these case
							// sets
		case 10: // My first time around i didn't use breaks which caused me to get repeating
					// true and falses
			if (ninDigitb + ninDigit == tenDigitb + tenDigit) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 9:
			if (eigDigitb + eigDigit == ninDigit + ninDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 8:
			if (sevDigitb + sevDigit == eigDigit + eigDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 7:
			if (sixDigitb + sixDigit == sevDigit + sevDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 6:
			if (fivDigitb + fivDigit == sixDigit + sixDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 5:
			if (fouDigitb + fouDigit == fivDigit + fivDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 4:
			if (thiDigitb + thiDigit == fouDigit + fouDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 3:
			if (secDigitb + secDigit == thiDigit + thiDigitb) {

			} else {
				System.out.println(falseDeath);
				break;
			}
		case 2:
			if (firDigitb + firDigit == secDigit + secDigitb) {
				System.out.println(trueLife);
				break;
			} else {
				System.out.println(falseDeath);
			}
		case 1:
			if (place1b + place1 == firDigit + firDigitb) { // realized after writing the majority that i couldn't do
															// single digit integers
				// so i wrote this for to send them to the top rather than terminate
				System.out.println("invalid, you deserve death for being lazy ");
				p1();
			} else {
				System.out.println(falseDeath);
				break;
			}

		}
	}
}