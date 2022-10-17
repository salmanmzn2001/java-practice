package deno;

public class Exception_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {              // only one time one catch use  nearest catch use always first
        	 int x=100/0;     // this program 1 catch use 
        	 int  arr[]=new int[5];
        	 arr[10]=100;
        	 
         }
         catch(ArithmeticException e) {
        	 System.out.println(e);
        	 System.out.println(" ******");
         }
         catch(ArrayIndexOutOfBoundsException e) {
        	  System.out.println(e);
        	  System.out.println(" #########");
         }
	}

}
