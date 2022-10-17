package deno;
      // 1 class implements multiple interface
  interface my1{
	  void show();
  }
  interface my2{
	  void display();
  }
  class main2 implements my1,my2{
	  public void show() {
		  System.out.println(" interface  to use achieve abstraction.......");
	  }
	  public void display() {
		  System.out.println(" interface represent the is a relationship.......");
		  
	  }
  }

public class Interface_example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        main2 m=new main2();
        m.show();
        m.display();
	}

}
