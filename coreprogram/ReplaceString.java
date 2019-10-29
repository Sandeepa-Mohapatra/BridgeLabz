package com.BridgeLabz.coreprogram;

import java.util.Scanner;

public class ReplaceString
{
public static void main(String[] args)
    {
	
	String str="Hello UserName, How are you?";
	System.out.println("Enter the user name");
	Scanner s=new Scanner(System.in);
	String str1=s.nextLine();
	System.out.println(str.replace("UserName", str1));
	
    }

}
