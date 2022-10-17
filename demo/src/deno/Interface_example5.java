package deno;
     // interface to interface implements

  interface myclass{
	  void show();
	  int a=12;
	  int b=12;
	  int c=a*b;
  }
  interface  myclass1 extends myclass{
	   void display();
	   
  }
  class student2 implements myclass1{
	  public void show() {
		  System.out.println(" child show calling......." + c);
	  }
	  public void display() {
		  System.out.println(" child display calling...." );
	  }
  }
public class Interface_example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student2 s=new student2();
      s.show();
      s.display();
	}

}
