package com.BridgeLabz.coreprogram;

public class FlipCoin
{
	
	public static void main(String[] args)
	{
		int count=1,a=0,b=0;
		double flip;
		while(count<=10)
		{
			flip=Math.random();
			if(flip<=0.5)
			{
				System.out.println("head");
				a=a+1;
				
			}
			else
			{
				System.out.println("tail");
				b++;
				
			}
			count=count+1;
		}
		System.out.println("The percentage of head is "+a*10+"%");
		System.out.println("The percentage of tail is "+b*10+"%");
	}

}
