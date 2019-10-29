package com.BridgeLabz.functional;

import java.io.PrintWriter;

public class Array2D
{
	static void arrayint()
	{
	System.out.println("Enter the row");
	StdIn s=new StdIn();
	PrintWriter pw=new PrintWriter(System.out);
	int r=s.readInt();
	System.out.println("Enter the col");
	int c=s.readInt();
	pw.print("Enter the elements");
	pw.println();
	pw.flush();
	pw.println();
	
	int[][] a=new int[r][c];
	
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=s.readInt();
		}
		
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			pw.print(a[i][j]+" ");
			pw.flush();
		}
		pw.println();
	}}
	
 static	void arraydouble()
 {
		System.out.println("Enter the row");
		StdIn s=new StdIn();
		PrintWriter pw=new PrintWriter(System.out);
		int r=s.readInt();
		System.out.println("Enter the col");
		int c=s.readInt();
		pw.print("Enter the elements");
		pw.println();
		pw.flush();
		pw.println();
		
		
		double[][] d=new double[r][c];
		
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=s.readDouble();
			}
			
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				pw.print(d[i][j]+" ");
				pw.flush();
			}
			pw.println();
		}}
		
	
	static void arrayboolean(){
		System.out.println("Enter the row");
		StdIn s=new StdIn();
		PrintWriter pw=new PrintWriter(System.out);
		int r=s.readInt();
		System.out.println("Enter the col");
		int c=s.readInt();
		pw.print("Enter the elements");
		pw.println();
		pw.flush();
		pw.println();
		
		
		boolean[][] b=new boolean[r][c];
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=s.readBoolean();
			}
			
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				pw.print(b[i][j]+" ");
				pw.flush();
			}
			pw.println();
		}}
		
	
    
public static void main(String[] args)
    {
	
	arrayint();
	arraydouble();
	arrayboolean();
	
    }
}
