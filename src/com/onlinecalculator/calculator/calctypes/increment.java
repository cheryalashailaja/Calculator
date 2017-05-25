package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class increment
{
	public static void main(String args[])
	{
	int a,b;
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter first number");
	a=s.nextInt();
	
	System.out.println("a++ = "+(a++));
	System.out.println("++a = "+(++a));
	System.out.println("a-- ="+(a--));
	System.out.println("--a = "+(--a));
	
	}
}
