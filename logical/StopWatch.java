package com.BridgeLabz.logical;

import java.util.Scanner;

public class StopWatch {
   
    long start = 0;

    
    long stop = 0;

    
    public  void start() {
        start = System.currentTimeMillis();
    }

    
    public  void stop() {
        stop = System.currentTimeMillis();
    }

    
    public  String elapsedTime()  {
        long difference;

        if (stop == 0) {
            long now = System.currentTimeMillis();

            difference = (now - start); 
        } else {
            difference = (stop - start); 
        }

   

        long mils = difference % 1000;

        difference = (difference - mils) / 1000; // in seconds

        long secs = difference % 60;

        difference = (difference - secs) / 60; // in minutes

        long minutes = difference % 60;

        difference = (difference - minutes) / 60; // in hours

        long hours = difference % 24;

        difference = (difference - hours) / 24; // in days

        long days = difference;
        String message = "";

        if (days > 0) {
            message = days + " days and  " + hours + " hours";
        } else if (hours > 0) {
            message = hours + " hours and " + minutes + " minutes";
        } else if (minutes > 0) {
            message = minutes + " minutes and " + secs + " seconds";
        } else if (secs > 0) {
            message = secs + " seconds and " + mils + " milliseconds";
        } else {
            message = mils + " milliseconds";
        }

        return message;
    }
    public static void main(String[] args) 
    {
    	StopWatch sw=new StopWatch();
		System.out.println("Enter a key to start");
		Scanner s=new Scanner(System.in);
		String n=s.next();
		sw.start();
		System.out.println("Enter a key to stop");
		String n1=s.next();
		sw.stop();
		
		
		System.out.println(sw.elapsedTime());
	}
}

