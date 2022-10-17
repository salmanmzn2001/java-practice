package deno;

import java.util.Scanner;

public class Nevennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter the  number");
	      int num=sc.nextInt();
	      for(int i=1;i<=num;i++) {
	     if(i%2==0) {
	    	 System.out.println("even number is : " + i);
	    	 
	     }
	     else {
	    	 System.out.println("odd  number is : " + i);
	     }
	}

}
}
