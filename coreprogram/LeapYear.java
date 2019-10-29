package com.BridgeLabz.coreprogram;

import java.util.Scanner;

public class LeapYear
{

public static void main(String[] args)
{
	System.out.println("Enter the Year to cheak");
	Scanner s=new Scanner(System.in);
	int yr=s.nextInt();
	if(yr>=1000 && yr<=9999)
	{
		if(yr%400==0||yr%4==0&&yr%100!=0)
		{
			
			System.out.println("its  a leap yr");
		}
		else {
			System.out.println("its not a leap yr");
		}
			
	}
	else
	{
		System.out.println("invalid entry");
	}
}
	
}
