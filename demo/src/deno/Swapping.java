package deno;

import java.util.Scanner;

// swapping of using 3  number
public class Swapping {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the  1 number");
	      int num1=sc.nextInt();
	      System.out.println("enter the 2  number");
	      int num2=sc.nextInt();
	     
	      System.out.println("before swapping........");
	      System.out.println("value of num1: " + num1);
	      System.out.println("value of num2: " + num2);
	    
	      int temp=num1;
	      num1=num2;
	      num2=temp;
	      System.out.println("after swapping......");
	      System.out.println("value of num1: " + num1);
	      System.out.println("value of num2: " + num2);
	    
	}

}
