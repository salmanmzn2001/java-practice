package deno;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter the  number");
	      int num=sc.nextInt();
	      boolean isprime=true;
	      
	      for(int i=2;i<=num/2;i++) {
	    	  if(num%i==0) {
	    		  isprime=false;
	    		  break;
	    	  }
	      }
	      if(isprime) {
	    	  if(num==1) {
	    		  System.out.println("this is neither prime nor composite");
	    		  
	    		 }
	    	  else {
	    		  System.out.println("this is a  prime number " );

	    	  }
	    	  }
	      else {
	    	  System.out.println("this is not a prime number");
	      }
}
}