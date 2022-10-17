package deno;

   class a1{
	   int x=10;
	   
   }
   class a2 extends a1{
	   int x=20;
	   
   }
   class c3 extends a2{
	   int x=30;
	   void show() {

		   System.out.println(x);
		   System.out.println(super.x);
		   System.out.println(((a1)this).x);
	   }
   }
public class Inheritance_example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      c3 c=new c3();
      c.show();
      
	}

}
