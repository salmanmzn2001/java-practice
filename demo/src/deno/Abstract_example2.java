package deno;
 abstract  class Animal{
	 abstract void fly();
	 void nonfly() {
		 System.out.println("animal dont fly.... ");
	 }
 }
 class Bird extends Animal{
	   void fly() {
		   System.out.println("the birds fly in the sky... ");
	   }
	   void show() {
		   System.out.println("the  show birds fly in the sky... ");
	   }
 }

public abstract class Abstract_example2 {
   public static void main(String args[]) { 
	  Bird b=new Bird();
	  b.nonfly();
	  b.fly();
	  b.show();
	  
   }
}
