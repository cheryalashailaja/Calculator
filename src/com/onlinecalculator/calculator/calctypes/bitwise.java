package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class bitwise {
	public static void main(String args[])
	{
		boolean a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextBoolean();
		System.out.println("enter second number");
		b=s.nextBoolean();
	    System.out.println("bitwise AND opertor"+(a&b));
		System.out.println("bitwise OR operato"+(a|b));
		System.out.println("bitwise XOR opertor"+(a^b));
		
		
	}
		

}
