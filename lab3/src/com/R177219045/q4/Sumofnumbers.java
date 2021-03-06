package com.R177219045.q4;

import java.util.Scanner;

public class Sumofnumbers {
	public static  void  main(String args[]) {
		int a[]= new int[300];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<300;i++) {
			a[i]=i;
			if(a[i]>40 && a[i]<250 ) {
				if(a[i]%5==0) {
					sum=sum+a[i];
				}
				
			}
			
		}
		System.out.println("the sum is equal to"+sum);
	}

}
