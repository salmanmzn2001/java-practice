package deno;
import java.util.Scanner;
public class array_insertspecificposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
      Scanner sc=new Scanner(System.in);
	System.out.println("enter the element");
	  int num=sc.nextInt();
	  int arr[]=new int[num +1];
	  System.out.println("enter the all element");
	  
	   for( i=0;i<num;i++){
		   arr[i]=sc.nextInt();
	   }
         System.out.println("enter the position where you want to insert");
         int position=sc.nextInt();
         System.out.println("enter the element ");
         int element=sc.nextInt();
         for(i=num-1;i>=position-1;i--) {
        	 arr[i+1]=arr[i];
         }
         arr[position-1]=element;
         
         System.out.println("after insert element");
         for(i=0;i<=num;i++) {
        	 System.out.println(arr[i]);
         }
        
}}
