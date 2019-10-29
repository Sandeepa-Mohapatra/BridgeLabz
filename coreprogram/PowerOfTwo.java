package com.BridgeLabz.coreprogram;

import java.util.Scanner;

public class PowerOfTwo
{
public static void main(String[] args) 
{
	
	int N=Integer.parseInt(args[0]);
	if(N>=0 && N<31) {
	for(int i=0;i<N;i++)
	{
		System.out.println(Math.pow(2,i));
	}
	}
	else
	{
		System.out.println("Invalid entry");
	}
}
}
