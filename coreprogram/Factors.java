package com.BridgeLabz.coreprogram;

import java.util.Scanner;

public class Factors 
{
	public static void main (String[] args) 
	{
		System.out.println("Enter a no");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
			 
			while (n%2==0) 
			{ 
				System.out.print(2 + " "); 
				n /= 2; 
			} 

			
			for (int i = 3; i <= Math.sqrt(n); i+= 2) 
			{ 
				
				while (n%i == 0) 
				{ 
					System.out.print(i + " "); 
					n /= i; 
				} 
			} 

			
			if (n > 2) 
				System.out.print(n); 
		} 

		
		
			
			
	} 


