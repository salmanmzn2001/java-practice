package deno;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the   number");
	      int num=sc.nextInt();
	    
	      int temp=num;
	      while(num!=0) {
	    	  int rem =num%10;
	    	  sum=sum+(rem*rem*rem);
	    	  num=num/10;
	    	  
	    	  
	      }
	      if(sum==temp) {
	    	  System.out.println("armstrong number:" + temp);
	      }
	      else {
	    	  System.out.println("not armstrong number: " + temp);
	      }
	}

}
