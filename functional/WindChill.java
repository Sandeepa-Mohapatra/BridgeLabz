package com.BridgeLabz.functional;

import java.util.Scanner;

public class WindChill
{
	public static void main(String[] args)
	{
       int v,t;
       v=Integer.parseInt(args[0]);
       t=Integer.parseInt(args[1]);
       
       if(v>3 && v<120 && t<50)
       {
    	   double v1=Math.pow(v,0.16);
    	   double w=35.74+(0.6215*t)+((0.4275*t)-35.75)*v1;
    	   System.out.println("Wind Chill is: "+w);
       }
       else
       {
    	  System.out.println("invalid entry");
       }
 
	}
}
	
