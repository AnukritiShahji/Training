package com.programsonnumbers;
import java.util.Scanner;

public class FibonacciSeries
{
	static int fib(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
	return 1;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the No");
		int m=sc.nextInt();
		int f=fib(m);
		System.out.println(f);
		

	}

}
