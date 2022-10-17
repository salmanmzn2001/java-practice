package deno;
         // abstract example     

   abstract class Bikee{
	   abstract void run();
	   
	   
	   }
  
   class Honda4 extends Bikee{
	   void run(){
		   System.out.println("running safely..");
	   }
	   }
  
   
public abstract class Abstract_example1 {

	public static void main(String[] args) {
		// TODO Auto-
      Honda4 h1=new Honda4();
      h1.run();
	}

}
