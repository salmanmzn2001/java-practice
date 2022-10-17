package deno;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the   number");
	      int num=sc.nextInt();
	    int sum=0;
	      int temp=num;
	      while(num!=0) {
	    	  int rem =num%10;
	    	  sum=(sum*10)+rem;
	    	  num=num/10;
	    	  
	    	  
	      }
	      if(sum==temp) {
	    	  System.out.println("palindrome number:" + temp);
	      }
	      else {
	    	  System.out.println("not palindrome number: " + temp);
	      }
	}
	}


