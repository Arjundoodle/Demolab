package com.R177219045.q2;

import java.util.Scanner;

public class Sumofsquares {
	public static void main( String args[])
	{
             int a[]=new int[10];
             Scanner sc= new Scanner(System.in);
             int sum=0;

        	 System.out.println("enter the numbers");
             
             for(int i=0;i<9;i++)
             {
            	 a[i]=sc.nextInt();
            	 a[i]=a[i]*a[i];
            	 sum=sum+a[i];
            	 
             }
             System.out.println("The sum of square of numbers is equal to"+ sum);
	}
}
