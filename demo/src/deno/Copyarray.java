package deno;
import java.util.Scanner;
public class Copyarray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the element");
       int num=sc.nextInt();
       int arr[]=new int[num];
       int arr2[]=new int[arr.length];
       System.out.println("enter the all element");
       for( i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       for( i=0;i<arr.length;i++) {
    	   arr2[i]=arr[i];
    	   
       }
       System.out.println("original array element");
       for(i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
    	   
       }
       System.out.println("copy element");
       for(i=0;i<arr2.length;i++){
    	   System.out.println(arr2[i]);
       }
       
	}

}
