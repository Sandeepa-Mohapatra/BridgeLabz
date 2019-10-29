package com.BridgeLabz.functional;

import java.util.Scanner;

public class TripleSum {
	public static void main(String[] args) 
	{ 
		
		Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
	    
        }
    boolean found = true; 
    for (int i = 0; i<n-2; i++) 
    { 
        for (int j=i+1; j<n-1; j++) 
        { 
            for (int k=j+1; k<n; k++) 
            { 
                if (arr[i]+arr[j]+arr[k] == 0) 
                { 
                    System.out.print(arr[i]); 
                    System.out.print(" "); 
                    System.out.print(arr[j]); 
                    System.out.print(" "); 
                    System.out.print(arr[k]); 
                    System.out.print("\n"); 
                    found = true; 
                } 
            } 
        } 
    } 
  
    // If no triplet with 0 sum found in array 
    if (found == false) 
        System.out.println(" not exist "); 
  
}

}
