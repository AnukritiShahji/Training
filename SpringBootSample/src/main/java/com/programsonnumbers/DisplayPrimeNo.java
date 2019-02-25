package com.programsonnumbers;
import java.util.Scanner;

public class DisplayPrimeNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the No");
		int n=sc.nextInt();
		System.out.println("Prime no between 1 to " +n );
		
		for(int i=0;i<n;i++)
		{
			boolean isPrime=true;
			
			for(int j=2;j<i;j++)
			{
				if(i % j ==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i + " ");
		}
		


	}

}
