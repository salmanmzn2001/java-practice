package deno;
import java.util.Scanner;
public class Duplicate_elementarray {

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
     System.out.println("duplicate element");
     for(int i=0;i<num;i++) {
    	 for(int j=i+1;j<num;j++) {
    		 if (arr[i]==arr[j] ){
    			 System.out.println(arr[i]);
    			 
    		 }

    		 
    	 }
     }
	}

}
