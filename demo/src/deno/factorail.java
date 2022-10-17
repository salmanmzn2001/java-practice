package deno;
import java .util.Scanner;
// calculater


public class factorail {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		double total=0;
		double a,b;
		 Scanner sc=new Scanner(System.in);
		
		 
		 System.out.println("enter the choice");
		 System.out.println("1.add\n2.sub\n3.multiply\n4.divide");
		 int choice =sc.nextInt();
		 
		 
			 switch(choice) {
			 
			 case 1 :{
				     System.out.println("enter 1 the number");
				       a=sc.nextInt();
				      System.out.println("enter 2 the number");
				       b=sc.nextInt();
				      total=a+b;
				      System.out.println(total);
				      break;
			 }
			 case 2:{
				      System.out.println("enter 1 the number");
			            a=sc.nextInt();
			           System.out.println("enter 2 the number");
			             b=sc.nextInt();
			             total=a-b;
			            
			             System.out.println(total);
			             
			              break;
		 }
			 case 3:{
				 System.out.println("enter 1 the number");
		            a=sc.nextInt();
		           System.out.println("enter 2 the number");
		             b=sc.nextInt();
		             total=a*b;
		             System.out.println(total);
		              break;
	           }
			 case 4:{
				 System.out.println("enter 1 the number");
		            a=sc.nextInt();
		           System.out.println("enter 2 the number");
		             b=sc.nextInt();
		             total=a/b;
		             System.out.println(total);
		              break;
	           }
			 default:{
				 System.out.println("enter the valid choice");
			 }
				        
			
      }
	}
	}

