package deno;
    
    abstract class base3{
     base3(){
    	 System.out.println("base class ");
     }
     abstract void show();
    }
    
     class base4  extends base3{
    	 base4(){
    		 System.out.println("child call");
    	 }
    	 void show() {
    		 System.out.println("show call");
    	 }
    	 
     }
public class Abstract_example5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        base4 c=new base4();
        c.show();
	}

}
