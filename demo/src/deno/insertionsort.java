package deno;
import java.util.Scanner;
public class insertionsort {
	
	   public static void sort(int arr[]) {
		   int num=arr.length;
		   int i,j,temp;
		   for(i=1;i<num;i++) {
			   j=i;
			   temp=arr[i];
			   while(j>0 && temp<arr[j-1]) {
				   arr[j]=arr[j-1];
				   j=j-1;
			   }
			   arr[j]=temp;
		   }
	   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,j;
		
         System.out.println("enter the number");
	      Scanner sc=new Scanner(System.in);
	      int num=sc.nextInt();
	      int arr[]=new int[num];
	      System.out.println("enter"+num+" array element");
	      for(i=0;i<num;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      sort(arr);
	      
	      System.out.println("after sorting ");
	      for(i=0;i<num;i++)
	      {
	    	  System.out.println(arr[i]);
	      }
	}

}
