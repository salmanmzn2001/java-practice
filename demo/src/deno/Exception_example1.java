package deno;

public class Exception_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
             int i=50/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
     System.out.println("rest of thr code");
     
	}

}
