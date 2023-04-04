package edu.northeastern.csye6200;

import java.util.Scanner;
import java.util.ArrayList;

public class LAB8P1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* Create matrix n × m */
		System.out.print("Enter the number of rows: ");
		/* Input number of rows to be present in matrix */
		int n = input.nextInt();
		System.out.print("Enter the number of columns: ");
		/* Input number of columns to be present in matrix */
		int m = input.nextInt();
		System.out.println();
		/* Output array content */
		System.out.println("The array content is:");
		/*
		 * Initializing two dimensional array consisting n rows and m columns with
		 * variable name matrix
		 */
		int[][] matrix = new int[n][m];
		/* Randomly filling numbers 0-9 into matrix */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// Randomly filling numbers 0-9 into matrix by using method Math.random()*(maximum-minimum +1)+ minimum
				matrix[i][j] = (int) (Math.random() * 10);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		/* Checking for index of largest sum values of a row in matrix */
		int rowSum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for (int i = 0; i < n; i++) {
			if (rowSum < sumRow(matrix[i])) {
				rowSum = sumRow(matrix[i]);
				list.clear();
				list.add(i);
			} else if (rowSum == sumRow(matrix[i])) {
				list.add(i);
			}
		}
		/* Output index of largest sum values of a row in matrix */
		System.out.print("The index of the largest row: ");
		for (int i = 0; i < list.size() - 1; i++)
			System.out.print(list.get(i) + ", ");
		System.out.print(list.get(list.size() - 1));
		/* Checking for index of largest sum values of a column in matrix */
		int columnSum = 0;
		list.clear();
		list.add(0);
		for (int i = 0; i < m; i++) {
			if (columnSum < sumColumn(matrix, i)) {
				columnSum = sumColumn(matrix, i);
				list.clear();
				list.add(i);
			} else if (columnSum == sumColumn(matrix, i)) {
				list.add(i);
			}
		}
		/* Output index of largest sum values of a column in matrix */
		System.out.print("\nThe index of the largest column: ");
		for (int i = 0; i < list.size() - 1; i++)
			System.out.print(list.get(i) + ", ");
		System.out.print(list.get(list.size() - 1));
		input.close();
	}

	public static int sumRow(int row[]) {
		int sum = 0;
		for (int i = 0; i < row.length; i++)
			sum += row[i];
		return sum;
	}

	public static int sumColumn(int matrix[][], int column) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++)
			sum += matrix[i][column];
		return sum;
	}
}
