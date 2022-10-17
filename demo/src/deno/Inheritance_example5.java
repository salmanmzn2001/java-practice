package deno;
   // method overridding.
class main{
    void show() {
		System.out.println("hellow");
	    
	}
}
  class base2 extends main{
	  public void show() {
		  System.out.println("world");
		  super.show();
	  }
  }

public class Inheritance_example5  {

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        base2 c=new base2();
        c.show();
	}

}
