package com.NumberProgram_2;

import java.util.Scanner;

public class FibonacciSeris {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ch.nextInt();
		int first = 0;
		int second = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(first+" ");
		
			int third = first + second;
			first=second;

			second=third;

		}
	}

}
