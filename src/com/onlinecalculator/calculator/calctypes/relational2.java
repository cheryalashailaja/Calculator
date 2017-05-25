package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class relational2 
{
	public static void main(String args[])
	{
		
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter first number");
	a=s.nextInt();
	System.out.println("enter second number");
	b=s.nextInt();
	System.out.println("equal"+(a==b));
	System.out.println("notequal"+(a!=b));
	System.out.println("greater"+(a>b));
	System.out.println("lessthen"+(a<b));
	System.out.println("greaterthan equal"+(a>=b));
	System.out.println("greaterthan equal"+(a<=b));
	
}
	
}


