package com.programsonnumbers;
import java.util.Scanner;

import ch.qos.logback.core.net.SyslogOutputStream;

public class RangeOfFibonacci {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int range=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=range;i++)
		{
			c=a+b;
			if(c<=range)
			{
				System.out.println(c);
				a=b;
				b=c;
			}
				
		}
	

	}

}
