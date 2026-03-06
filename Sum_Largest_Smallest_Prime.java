package com.NumberProgram_2;

import java.util.Scanner;

public class Sum_Largest_Smallest_Prime {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("enter the first Number");

		int start = ch.nextInt();
		System.out.println("enter the last Number");
		int last = ch.nextInt();
		int largest = 0;
		int smallest = 0;
		for (int i = start; i <= last; i++) {
			if (isPrime(i)) {
				largest = i;
				System.out.println("smallest Prime number is : " + i);

				break;
			}
		}
		for (int i = last; i >= start; i--) {
			if (isPrime(i)) {
				smallest = i;
				System.out.println("Largest Prime number is : " + i);
				break;
			}
		}

		System.out.println(
				"The sum of the largest and smallest Prime  number in a given range is : " + (largest + smallest));
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int j = 1; j <= num; j++) {
			if (num % j == 0) {
				count++;
			}
		}
		return count == 2;
	}
}
