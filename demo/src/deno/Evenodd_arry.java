package deno;

import java.util.Scanner;

public class Evenodd_arry {

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
	   System.out.println("even element");
	   for(int i=0;i<num;i++) {
		   if(arr[i]%2==0) {
			   
		   
		   System.out.println(arr[i]);
	   }}
	   System.out.println("odd element");
	   for(int i=1;i<num;i++) {
		   if(arr[i]%2!=0) {
			   
		   
		   
		   System.out.println(arr[i]);
	   }}

	}

}
