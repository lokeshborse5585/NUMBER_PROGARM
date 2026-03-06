package com.NumberProgram_2;

import java.util.Scanner;

public class BinaryToDacimal {
  public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	System.out.println("Enter the number");
	int binary=ch.nextInt();
	
	int dacimal=0;
	int position=1;
	
	while(binary!=0)
	{
		int last=binary%10;
		dacimal=dacimal+position*last;
		position=position*2;
		binary=binary/10;
	}
	System.out.println("The Dacimal value of the given binary value is : "+dacimal);
}
}
