package com.NumberProgram_2;

import java.util.Scanner;

public class Largest_Prime_Number {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the last number");
		int end = ch.nextInt();
		System.out.println("Enter the start number");
		int strat = ch.nextInt();

		for (int i = end; i >= strat; i--) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println("The largest prime number is : "+i);
				break;
			}
		}

	}

}
