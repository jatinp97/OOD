package edu.northeastern.csye6200;

import java.util.*;
public class LAB3_P1 {
	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a credit card Number as a long integer: ");
			
			long cardNumber = input.nextLong();
			
			//get size of the Card Number
			
			int numberSize = getSize(cardNumber);
			
			System.out.println("Credit card number has :" + numberSize + " Digits");
			
			long startNum = getPrefix(cardNumber, 1);
			
			
			if(startNum == 3) {
				startNum = getPrefix(cardNumber,2);
					if(prefixMatched(cardNumber, 37)) {
						System.out.println("Card belongs to American Express");
					}
			}else {
				if(prefixMatched(cardNumber, 4)) {
					System.out.println("Credit card is a : VISA");
					
				}
				else if(prefixMatched(cardNumber, 5)) {
					System.out.println("Credit card is a : Mastercard");
				}
				else if(prefixMatched(cardNumber, 6)) {
					System.out.println("Credit card is a : Discover");
				}
				else {
					System.out.println("Credit Card is invalid");
				}
			}
			
			if((isValid(cardNumber) && (numberSize == 13 || numberSize == 16))) {
				System.out.println(cardNumber + " Is valid");
				
			}
			else {
				System.out.println(cardNumber + " is Invalid");
			}
			input.close();
			
		}catch(Exception e) {
			System.out.println("exception message: "+ e);
		}
		
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		boolean isTrue= false;
		int sum  = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		System.out.println("Sum is: " + sum);
		if(((sum) % 10) == 0) {
			isTrue = true;
		}
		
		System.out.println("Istrue print: " + isTrue);
		return isTrue;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {

		
		    int evenPlaceSum = 0;
		    long temp = number;
		    while (temp > 0) {
		        evenPlaceSum += getDigit((int)(temp % 100) / 10 * 2);
		        temp /= 100;
		    }
		    return evenPlaceSum;
		}
	
	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		
		if(getSize(number) > 1) {
			int sum = (number / 10) + (number % 10);
			return sum;
		}
		
		return number;
	}

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {

		int oddPlaceSum = 0;
	    long temp = number;
		while (temp > 0) {
	        oddPlaceSum += temp % 10;
	        temp /= 100;
	    }
	    return oddPlaceSum;
	}
	
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		
		boolean isMatched = false;
		
		String cardNum = String.valueOf(number);
		String prefixNum = String.valueOf(d);
		if(cardNum.startsWith(prefixNum)) {
			isMatched = true;
		}
		
		return isMatched;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		
		int len = String.valueOf(d).length();
		return len;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// TODO: write your code here
		
		
		if(getSize(number)>k) {
			String completeNumber = String.valueOf(number);
			return Long.parseLong(completeNumber.substring(0, k));
		}
		return number;
	}
}
