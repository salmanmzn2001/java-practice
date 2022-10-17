package deno;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
      Scanner sc=new Scanner (System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int arr[]=new int[num];
      System.out.println("enter "+num+"interger");
      for( i=0;i<num;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("enter the search value");
      int iteam=sc.nextInt();
      for(i=0;i<num;i++) {
    	  if(arr[i]==iteam) {
    		  System.out.println(iteam+"\nis present at location\n"+ ( i+1));
    		  break;	  
    	  }
    	  
      }
      if(i==num) {
    	  System.out.println(iteam+"\ndoes not present in the array");
      }
	}

}
