package deno;
import java.util.Scanner;
public class Average_arrayexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the  1 number");
      int num1=sc.nextInt();
      System.out.println("enter the  2 number");
      int num2=sc.nextInt();
      System.out.println("enter the  3 number");
      int num3=sc.nextInt();
      int average=(num1+num2+num3)/3;
      System.out.println("average:" + average);
      
	}

}
