package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class condition {
	public static void main(String args[])
	{
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		System.out.println("condition operator "+(a>b?a:b));
	}

}
