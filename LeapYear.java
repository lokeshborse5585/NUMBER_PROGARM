package com.NumberProgram_2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = ch.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("The given year is a leap  year ");

		} else {
			System.out.println("The given year is  not a leap  year ");
		}

	}

}
