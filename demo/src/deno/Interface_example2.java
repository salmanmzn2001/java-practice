package deno;
      // interface to class implements
 interface my{
	 void show();
	 void display();
 }
 class A5 implements my{
	 public void show() {
			System.out.println(" child show call");
		}
	public	void display() {
			
			System.out.println(" child display call");
		}
		
	 }
 


public class Interface_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A5 a=new A5();
       a.show();
       a.display();
	}

}
