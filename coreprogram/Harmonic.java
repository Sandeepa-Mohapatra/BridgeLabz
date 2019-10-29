package com.BridgeLabz.coreprogram;

import java.util.Scanner;

public class Harmonic {
public static void main(String[] args) {
	System.out.println("Enter the position");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	double h=1.0;
	for(int i=2;i<=n;i++)
	{
		h=h+(1.0/i);
	}
	System.out.println(h);
}
}

