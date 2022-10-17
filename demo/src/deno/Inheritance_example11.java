package deno;

    //inheritance  use  perameterized constructor
class m{
	  m(int x,int y){
		  int c=x*y; 
		  System.out.println("perameterized constructor call multiply : " + c);
	  }
}
class n extends m{
	  n(int z){
		  super(10,20);
		  System.out.println("c perameterized constructor call: " + z);
		  
	  }
}



public class Inheritance_example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   n c1=new n(20);
	}

}
