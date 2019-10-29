package com.BridgeLabz.logical;

import java.util.Scanner;

public class CuponNumber
{
 public static void main(String[] args)
 {
	 
		
	 System.out.println("Enter how many numbers you want to generate");
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int r=(int) (Math.random()*1000);
	 
	 int a[]=new int[n];
	 a[0]=r;
	 for(int i=1;i<n;i++)
	 {
		 int r1=(int) (Math.random()*1000);
		 if(a[i]!=r1)
		 {
			 a[i]=r1;
		 }
		 else
		 {
			 i--;
		 }
		 
			 
	 }
	 System.out.println("Cupon numbers are");
	 char[] ch="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	 
		
	 for(int i=0;i<n;i++)
	 {
		 int random=(int) (Math.random()*100000);	
			StringBuffer sb=new StringBuffer();
			
			while (random>0)
			{
				sb.append(ch[random % ch.length]);
				random /= ch.length;
			}

			String couponCode=sb.toString();
	 System.out.println(couponCode+a[i]);
	
	 }
	 
	 System.out.println("the no of distinct no are "+n);
 }
}
