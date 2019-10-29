package com.BridgeLabz.functional;

import java.util.Scanner;

public class Distance {
public static void main(String[] args)
	
	{
		double x, y, d,z,a;
		
		x=Integer.parseInt(args[0]);
		
		y=Integer.parseInt(args[1]);
		a=(x*x+y*y);
		z=Math.sqrt(a);
		System.out.println("Distance=" +z);
		
	}
	

}
