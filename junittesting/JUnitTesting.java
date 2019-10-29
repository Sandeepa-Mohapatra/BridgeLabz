package com.BridgeLabz.junittesting;

public class JUnitTesting 
{
public static void main(String[] args)
    {
	Utility u=new Utility();
	
	//Find day of week
	int m=Integer.parseInt(args[0]);
	int d=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]);
	System.out.println(u.dayofweek(m,d,y));
	
	//Temperature conversion
	System.out.println("Enter the tempreture");
	int f=u.inputInteger();
	u.temperaturConversion(f);
	
	//Monthly payment
	System.out.println("Enter the Principal loan amount, year and rate of interest respectively");
	int p=Integer.parseInt(args[3]);
	int yr=Integer.parseInt(args[4]);
	Float r=Float.parseFloat(args[5]);
	System.out.println("Total payment is: "+u.monthlyPayment(p,yr,r)+"Rs");
	
	
	
	
	
	}
}
