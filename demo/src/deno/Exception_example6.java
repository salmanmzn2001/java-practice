package deno;

public class Exception_example6 {

	// finally block use in exception handling...
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {             
	        	 int x=100/0;  
	        	 
	        	 int  arr[]=new int[5];
	        	 arr[10]=100;
	        	 
	         }
	         catch(ArithmeticException e) {
	        	 System.out.println(e);
	        	 System.out.println("  first catch block executed  becouse of 1 try block find  1 block error ");
	         }
	         catch(ArrayIndexOutOfBoundsException e) {
	        	  System.out.println(e);
	        	  System.out.println("2 catch block executed becouse of 2 try block  error");
	        	  
	         }
		  finally {
			  System.out.println("lastely block executeded ");
		  }
		}
	}


