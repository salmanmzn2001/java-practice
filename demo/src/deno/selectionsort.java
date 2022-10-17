package deno;
import java.util.Scanner;
public class selectionsort {

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
      for(i=0;i<num;i++) {
      for(j=i+1;j<num;j++) {
    	  if(arr[i]>arr[j]) {
    		  int temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;
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

