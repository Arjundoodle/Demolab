package com.R177219045;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[10];
		System.out.println("enter the 3 numbers between 0-9");
		for(int i=0;i<3;i++) {
			
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			
			for( int j=0;j<3;j++) {
				
				for(int k =0;k<3;k++) {
					if(i!=j && j!=k && k!=i) {
						System.out.println(arr1[i] + " " +  arr1[j] + " " + arr1[k]);
					}
				}
			}
		}

	}

}
