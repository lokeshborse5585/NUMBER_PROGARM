package com.NumberProgram_2;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = ch.nextInt();
		int sum = 0;

		while (num != 1 && num != 4) {

			sum = 0;

			while (num != 0) {
				int rem = num % 10;
				sum = sum + (rem * rem);
				num = num / 10;

			}

			num = sum;

		}
		if (sum == 1) {
			System.out.println("The given  number is a Happy Number");
		} else {
			System.out.println("The given  number is not  a Happy Number");
		}
	}

}
