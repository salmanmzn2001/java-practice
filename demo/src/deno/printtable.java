package deno;
import java.util.Scanner;
public class printtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the  number");
	      int num=sc.nextInt();
	     for (int i=1;i<=10;i++) {
	    	 System.out.println(i*num);
	     }
	}

}
