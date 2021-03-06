package com.R177219045.q3;

import java.util.Scanner;

public class Monthname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a[]=new int [12];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
	      
	      for(int i=1;i<13;i++) {
	    	  
	    	  a[i]=sc.nextInt();
	    	  
	    	  if(a[i]==1) {
	    		  System.out.println("January");
	    	  }
	    	  if(a[i]==2) {
	    		  System.out.println("Febuary");
	    	  }
	    	  if(a[i]==3) {
	    		  System.out.println("March");
	    	  }
	    	  if(a[i]==4) {
	    		  System.out.println("April");
	    	  }
	    	  if(a[i]==5) {
	    		  System.out.println("May");
	    	  }
	    	  if(a[i]==6) {
	    		  System.out.println("June");
	    	  }
	    	  if(a[i]==7) {
	    		  System.out.println("July");
	    	  }
	    	  if(a[i]==8) {
	    		  System.out.println("August");
	    	  }
	    	  if(a[i]==9) {
	    		  System.out.println("September");
	    	  }
	    	  if(a[i]==10) {
	    		  System.out.println("October");
	    	  }
	    	  if(a[i]==11) {
	    		  System.out.println("November");
	    	  }
	    	  if(a[i]==12) {
	    		  System.out.println("December");
	    	  }
	    	  
	      }

	}
      
      
      
}
