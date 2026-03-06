package com.NumberProgram_2;

import java.util.Scanner;

public class Power_Of_The_Given_Number {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the Base");
		int base = ch.nextInt();
		System.out.println("Enter the Exponant or power");
		int expo = ch.nextInt();
		int power = 1;
		for (int i = 1; i <= expo; i++) {
			power = power * base;

		}
		System.out.println("The "+ expo+"  rd power of the "+base+" is : "+power);
	}
}
