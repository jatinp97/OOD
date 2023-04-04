package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3_P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		//1- Create an Object of Scanner to take input from User
		Scanner input = new Scanner(System.in);
		
		//2- Ask the user for the size
		System.out.print("Enter the number of values: ");
		int size = input.nextInt();
		int[] values = new int[size];
		
		//3- Input the numbers from the user
		System.out.print("Enter the numbers: ");
		for(int i=0; i<values.length; i++) {
			values[i] = input.nextInt();
		}
		
		//4- Check for the Consecutive Fours
		boolean isConsecutive = isConsecutiveFour(values);
		
		//5- Print the desired Output
		if(isConsecutive){
			System.out.println("The List has Consecutive Fours.");
		}
		else {
			System.out.println("The List has no consecutive Fours");
		}
		
		input.close();
		
	}

	public static boolean isConsecutiveFour(int[] values) {
		// TODO: write your code here
		boolean answer = false;
		
		//Check whether the array has 4 consecutive number with same value
		for(int i=0; i< values.length-3; i++) {
			if(values[i] == values[i+1] && values[i+1] == values[i+2] && values[i+2] == values[i+3]) {
				answer = true;
				break;
			}
			
		}
		
		return answer;
	}

}

