package deno;

public class Exception_example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {              // only one time one catch use  nearest catch use always first
       	 int x=100/8;     // 
       	 int  arr[]=new int[5];
       	 arr[10]=100;
       	 
        }
        catch(ArithmeticException  | ArrayIndexOutOfBoundsException e) {
       	 System.out.println(e);
       	 System.out.println(" ******");
        }
        

	}}
