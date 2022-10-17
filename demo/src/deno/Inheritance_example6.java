package deno;
   //  method overridding
   class c1{
	   int x=10;
	   int y=20;
	   int c=x+y;
	   void show() {
		   System.out.println("sum: " + c);
	   }
   }
   class c2 extends c1{
	   int x=20;
	   int y=5;
	   int z=x*y;
	   void show() {
		   System.out.println("multiply : " +  z);
		  // System.out.println(super.x);
		   super.show();
	   }
   }
public class Inheritance_example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      c2 c=new c2 ();
      c.show();
	}

}
