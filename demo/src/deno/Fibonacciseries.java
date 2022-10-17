package deno;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter the  number");
	      int num=sc.nextInt();
	    int a=0,b=1;
	    System.out.println(a+ "" );
	     if(num>1) {
	    	 for(int i=2;i<=num;i++) {
	    		 System.out.println(b+"");
	    		 int temp=b;
	    		 b=a+b;
	    		 a=temp;
	    		 
	    	 }
	    	System.out.println("");
	     }
	}

}
