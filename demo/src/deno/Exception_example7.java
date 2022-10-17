package deno;

public class Exception_example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	    int x=234444;
    	    System.out.println("value of:" +  x);
       }
       catch(NullPointerException e) {
    	   System.out.println(e);
    	   
    	   
       }
       finally {
    	   System.out.println("finally block is always executed");
       }
	}

}
