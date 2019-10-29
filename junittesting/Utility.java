package com.BridgeLabz.junittesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Utility
{
	BufferedReader br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";
	
	//constructor to initialize bufferedReader
	public Utility(){
	br = new BufferedReader(new InputStreamReader(System.in));
	}

	//Regex pattern matcher match the string and replace the regex pattern with user details.
	

	//Take Integer Input
	public int inputInteger(){
	try{
	try{	
	return Integer.parseInt(br.readLine());
	}
	catch(NumberFormatException nfe){
	System.out.println(nfe.getMessage());	
	}
	}catch(IOException ioe){
	System.out.println(ioe.getMessage());
	}
	return 0;
	}

	//Take Double Input
	public double inputDouble(){
	try{
	try{	
	return Double.parseDouble(br.readLine());
	}
	catch(NumberFormatException nfe){
	System.out.println(nfe.getMessage());	
	}
	}catch(IOException ioe){
	System.out.println(ioe.getMessage());
	}
	return 0.0;
	}

	//Take number of random number to generate as input and return array of random number
	public int[] getRandomArray(int number){
	Random randomGenerator = new Random();
	int array[]=new int[number];
	for(int i=0;i<number;i++){
	array[i]=randomGenerator.nextInt();
	}
	return array;
	}

	//Read the file and take stock details as input and return array-list of stock details
	

	//Function take String in dd/mm/yyyy format and return Date Object
	public Date printDate(String date){
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	try{
	return sdf.parse(date);
	}
	catch(ParseException pe){
	return null;
	}
	}

	//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date){
	SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	return sdf.format(date);
	}

	//Take file name as input and return string of file text
	public String getFileText(String fileName){
	try{
	br=new BufferedReader(new FileReader(fileName));
	StringBuilder sb=new StringBuilder();
	String line=br.readLine();
	while(line!=null){
	sb.append(line);
	sb.append(System.lineSeparator());
	line=br.readLine();
	}
	return sb.toString();
	}
	catch(Exception e){
	return null;
	}
	finally{
	try{
	br.close();
	}
	catch(IOException ioe){
	}	
	}
	}
	
	//this function take two parameter 
	// 1 what data to write.
	// 2 file name
	public void writeToFile(String data,String fileName)throws Exception{
	File file = new File(fileName);
	if (!file.exists()) {
	file.createNewFile();
	}
	FileWriter writer = new FileWriter(file); 
	// Writes the content to the file
	writer.write(data); 
	writer.flush();
	writer.close();
	}
	
	
	
	public static String dayofweek(int m,int d,int y)
	{
		if(d<=31&&m<=12)
		{
		        double y0 = y-((14-m) / 12);
				double x = y0 + (y0/4) - (y0/100) + (y0/400);
				double m0 = m + 12*((14 - m) / 12) - 2;
				double d0 =(d + x + 31*m0 / 12)%7;
			int s=(int) Math.round(d0)-1;
			
			switch(s)
			{
			case 0:
				return "Sun";
			case 1:
				return "Mon";
			case 2:
				return "Tue";
			case 3:
				return "wed";
			case 4:
				return "Thurs";
			case 5:
				return "fri";
			case 6:
				return "sat";
			}
		}
			return "";
			}
	public static void  temperaturConversion(int n)
	{
		System.out.println("if you want to convert Celsius to Fahrenheit then press 1 and fahrenheit to celsius press 2");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x==1)
		{
			int f=(n*9/5)+32;
			System.out.println(f);
		}
		if(x==2)
		{
			int c=n-32*(5/9);
			System.out.println(c);
		}
	}
	public static float monthlyPayment(int p,int y,double r)
	{   int n=12*y;
	    double a=1+(r/(12*100));
	    double b=Math.pow(a,(-n));
	    float payment=(float) ((p*a)/1-b);
		return payment;
		
	}
	

	}
