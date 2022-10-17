package deno;

import java.util.Scanner;

public class Evenoddposition_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the element");
	     int num=sc.nextInt();
	     int arr[]=new int[num];
	     System.out.println("enter the all element");
	     for(int i=0;i<num;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	   
	     System.out.println(" all element");
	     for(int i=0;i<num;i++) {
	    	 System.out.println(arr[i]);
	     }
	   System.out.println("odd position");
	   for(int i=0;i<num;i=i+2) {
		   System.out.println(arr[i]);
	   }
	   System.out.println("even position");
	   for(int i=1;i<num;i=i+2) {
		   System.out.println(arr[i]);
	   }

	}

}
