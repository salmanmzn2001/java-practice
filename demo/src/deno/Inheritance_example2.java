package deno; 

// multi_ level inheritance 

class dadaji{
	 void show() {
		 System.out.println("dadaji class call");
	 }
}
class papaji extends dadaji{
	void display() {
		System.out.println("papaji class call");
	}
}
class child extends papaji{
	void print() {
		System.out.println("child class call");
	}
}

public class Inheritance_example2 { 
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
    child obj=new child();
    obj.show();
    obj.display();
    obj.print();
		
	}
}
