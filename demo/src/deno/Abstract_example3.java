package deno;

abstract class Shape{
abstract void draw();
  void fly() {
	  System.out.println("calling fly method");
  }
}
      //In real scenario, implementation is provided by others i.e. unknown by end user

class Rectangle extends Shape{
      void draw(){
	System.out.println("drawing rectangle");
	}
}

class Circle1 extends Rectangle{
       void draw(){ 
	System.out.println("drawing circle");
	}
}



public abstract class Abstract_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape c=new Circle1();
      c.draw();
      c.fly();
      Shape d=new Rectangle();
      d.draw();
      d.fly();
     
	}

}
