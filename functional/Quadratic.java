package com.BridgeLabz.functional;

import java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args)

    {
	int a,b,c;
	double r1,r2,delta;
	double s;
	System.out.println("Enter the values");
	Scanner n=new Scanner(System.in);
	a=n.nextInt();
	b=n.nextInt();
	c=n.nextInt();
	
	delta=b*b-4*a*c;
	s=Math.sqrt(delta);
	r1=(-b+s)/2*a;
	r2=(-b-s)/2*a;
	System.out.println("Equation is :"+a+"x*x + "+b+"x + "+c);
	System.out.println("root of x is "+r1+"and "+r2);
	
	}
}
