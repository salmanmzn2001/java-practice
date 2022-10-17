package deno;
import java.util.Scanner;
public class exampledatamember {
	 static String cname="tcs";
	 void sum(int a,int b) {
		  int result=a+b;
		  System.out.println("total is = "+ result);
		  System.out.println("company name "+ cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the 1 number");
     int a=sc.nextInt();
     System.out.println("enter the 2 number");
     int b=sc.nextInt();
   //  sum(a,b);
     exampledatamember obj=new exampledatamember();
     obj.sum(a,b);
	}

}
