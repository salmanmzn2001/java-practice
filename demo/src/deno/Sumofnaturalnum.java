package deno;
import java.util.Scanner;
                          //  sum of all odd  number 1 to n 
public class Sumofnaturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the  number");
      int num=sc.nextInt();
      int sum=0;
      for(int i=1;i<num;i++) {
    	   sum=sum+i;
    	
      }
      System.out.println("sum of number:  " + sum);
	}

}
