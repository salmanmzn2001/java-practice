package deno;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the  1 number");
	      int num1=sc.nextInt();
	      System.out.println("enter the 2  number");
	      int num2=sc.nextInt();
	      int result;
	    
	      System.out.println("plz select one choice");
	      System.out.println("1 ..addition\n  2..subtraction\n   3..multiply\n   4... divide\n   5..mode");
	      int choice=sc.nextInt();
	     
	      switch(choice) {
	        
	      case 1:   result=num1+num2;
	              System.out.println("addition is : " + result);
	              break;
	      
	      case 2:   result=num1-num2;
                     System.out.println("subtraction is : " + result);
                       break;
                 

          case 3:   result=num1*num2;
                   System.out.println("multiplication is : " + result);
                    break;


          case 4:   result=num1/num2;
                      System.out.println("divide is : " + result);
                        break;
             
          case 5:   result=num1%num2;
          System.out.println("mode is : " + result);
            break;

            default:System.out.println("invalid choice plz select valid choice");

	      
	}

}}
