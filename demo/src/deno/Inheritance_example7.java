package deno;
          // method over ridding using static
  class p1{
	  static void show() {
		  System.out.println("first class ");
	  }
  }
   class p2 extends p1{
	   static void show() {
		   System.out.println("2 class ");
		   p1.show();
	   }
   }

public class Inheritance_example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          p2 c=new p2();
          c.show();
	}

}
