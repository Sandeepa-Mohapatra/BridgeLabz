package com.BridgeLabz.junittesting;

import java.util.Scanner;

public class VendingMachine
{

	public static void main(String[] args)
	{
		int[] arr= {1000,500,100,50,10,5,2,1};
		System.out.println("Enter the amount");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=7;i++)
		{
			if(arr[i]<=n)
			{
				int a=n/arr[i];
				System.out.println("The no of "+arr[i]+" Rs note is "+a);
				n=n-arr[i]*a;
				
			}
		}
	}
	
}
