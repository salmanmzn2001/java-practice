package deno;
import java.util.Scanner;
public class bubblesort {

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
	      System.out.println("sorting process start");
	      for(i=0;i<num-1;i++) {
	    	  
	      for(j=0;j<(num-i-1);j++) {
	    	  if(arr[j]>arr[j+1]) {
	    		  
	    		  int temp=arr[j];
	    		  arr[j]=arr[j+1];
	    		  arr[j+1]=temp;
	    	  } 
	    	  }
	      
	      }
	      System.out.println("after sorting ");
	      for(i=0;i<num;i++)
	      {
	    	  System.out.println(arr[i]);
	      }
	}

}
