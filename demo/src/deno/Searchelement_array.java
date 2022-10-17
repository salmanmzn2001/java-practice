package deno;
import java.util.Scanner;
public class Searchelement_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
      System.out.println("enter the element");
      int num=sc.nextInt();
      int arr[]=new int[num];
      System.out.println("enter the all element");
      for(i=0;i<num;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("enter the element you want to find");
      int element=sc.nextInt();
      for(i=0;i<num;i++) {
    	  if(arr[i]==element) {
    		  
    		 System.out.println("element is found at position\n"+(i+1));
    		 break;
    	  }
      }
           if(i==num) {
        	   System.out.println(element+"\nelement is not found");
	                }     
       
    	  
	   
	}
}
