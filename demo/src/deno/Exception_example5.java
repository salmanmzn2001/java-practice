package deno;

//   multiple try block use 

public class Exception_example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {        // only one time one catch use  nearest catch use always first
        	
			 try {
				 int x=100/5;
			 }
			  catch(ArithmeticException e) {
		        	 System.out.println(e);
		        	 System.out.println(" ******");
		         }
		       
			 
        	 int  arr[]=new int[5];
        	 arr[10]=100;
        	 
             }
          catch(ArrayIndexOutOfBoundsException e) {
        	  System.out.println(e);
        	  System.out.println(" #########");
         }
	}
	}


