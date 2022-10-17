package deno;
// Abstract class having  constructor....
abstract class Bike1{
	   Bike1()
	   {
		   System.out.println("bike is created");
		   }
	   abstract void run();
	   void changeGear(){
		   System.out.println("gear changed");
		   }
	 }

	 class Honda extends Bike1{
	 void run(){
		 System.out.println("running safely..");
		 }
	 }



public class Abstract_example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  Bike1 n=new Honda();
		Honda n=new Honda();
     n.changeGear();
     n.run();
    
	}

}
