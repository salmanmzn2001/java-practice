package deno;
// inheritance with  use default constructor
  class b{
	  b(){
		  System.out.println("default constructor call");
	  }
  }
  class c extends b{
	  c(){
		  super();
		  System.out.println("c default call ");
		  
	  }
  }
public class Inheritance_example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     c obj=new c();
     
	}

}
