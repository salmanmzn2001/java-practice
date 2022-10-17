package deno;

import java.util.Scanner;

public class Largestsmallestelement_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the element");
	     int num=sc.nextInt();
	     int arr[]=new int[num];
	     int max=arr[0];
	    
	     System.out.println("enter the all element");
	     for(int i=0;i<num;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	   
	     System.out.println(" all element");
	     for(int i=0;i<num;i++) {
	    	 System.out.println(arr[i]);
	     }
	   System.out.println("largest element");
	   for(int i=0;i<num;i++) {
		   if(arr[i]>max)
			   max=arr[i];}
	   
		   System.out.println(max);
		   
		   int min=arr[0];
		   System.out.println("smallest element");
		   for(int i=0;i<num;i++) {
			   if(arr[i]<min)
				   min=arr[i];
			   }
		   
			   System.out.println(min);
		   }
	   }
	


