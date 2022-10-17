package deno;
  class first{
	  void show() {
		  System.out.println(" **** java programming is the most popular language");
	  }
  }
  class secand extends first{
	  void display() {
		  System.out.println("****  c language is the first programming language");
	  }
  }
public class Dynamicbinding_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        first d1=new secand();// upcasting
        d1.show();
        secand e1=(secand)d1;// downcasting
        e1.display();
        }

}
