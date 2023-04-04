package edu.northeastern.csye6200;

public class LAB5P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		
		
		MyInteger myInt = new MyInteger(6);
		
		System.out.println("n1 is even? "+ myInt.isEven());
		System.out.println("n1 is odd? "+ myInt.isOdd());
		System.out.println("n1 is Prime? "+ myInt.isPrime());
		
		System.out.println("15 is even? "+ MyInteger.isEven(15));
		
		System.out.println("15 is Prime? "+ MyInteger.isPrime(15));
		
		MyInteger myInt2 = new MyInteger(77);
		
		System.out.println("n1 is equal to n2? "+ myInt.equals(myInt2));
		
		System.out.println("parseInt(char[]) for {'4', '4', '9', '8'} = "+MyInteger.parseInt(new char[]{'4', '4', '9', '8'}));
		
		System.out.println("parseInt(String) for \"4378\" = "+MyInteger.parseInt("4378"));
		
		System.out.println("n1 is equal to 5? "+myInt.equals(5));
		
		
			
		
	}
}

class MyInteger {
	
	private int value;
	
	// TODO: write your code here
	// Getter method that returns the int value.
	public int getValue() {
		// TODO: write your code here
		return value;
	}
	
	// Constructor that creates a MyInteger object for the specified int value.

	public MyInteger(int value) {
		// TODO: write your code here
		this.value = value;
	}
	
	
	// Methods isEven(), isOdd(), and isPrime() that return true if the value in this object is 
	  // even, odd, or prime, respectively.

	public boolean isPrime() {
		// TODO: write your code here
		if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
	}

	public static boolean isPrime(int num) {
		// TODO: write your code here
		
		if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
		
	}

	public static boolean isPrime(MyInteger o) {
		// TODO: write your code here
		
		if (o.value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(o.value); i++) {
            if (o.value % i == 0) {
                return false;
            }
        }
        return true;
		
	}

	public boolean isEven() {
		// TODO: write your code here
		
		return value % 2 == 0;
		
	}

	public boolean isOdd() {
		// TODO: write your code here
		return (value % 2 != 0);
	}
	
	// The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the 
	  // specified value is even, odd, or prime, respectively.

	public static boolean isEven(int n) {
		// TODO: write your code here
		return n % 2 == 0;
}

	public static boolean isOdd(int n) {
		// TODO: write your code here
		
		return n%2 !=0;
	}
	
	// The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that 
	  // return true if the specified value is even, odd, or prime, respectively.

	public static boolean isEven(MyInteger n) {
		// TODO: write your code here
		
		return n.value % 2 == 0;
		
		
	}

	public boolean equals(int anotherNum) {
		// TODO: write your code here
		
		return anotherNum == value;
		
	}

	public boolean equals(MyInteger o) {
		// TODO: write your code here
		
		return value == o.value;
		
	}

	public static int parseInt(char[] numbers) {
		// numbers consists of digit characters.
		// For example, if numbers is {'1', '2', '5'}, the return value
		// should be 125. Please note that
		// numbers[0] is '1'
		// numbers[1] is '2'
		// numbers[2] is '5'

		int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * 10 + (numbers[i] - '0');
        }
        return result;
		
		
	}

	public static int parseInt(String str) {
		// s consists of digit characters.
		// For example, if s is "125", the return value
		// should be 125.
		
		// TODO: write your code here
		
		int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result;
    
		
		
	}
}