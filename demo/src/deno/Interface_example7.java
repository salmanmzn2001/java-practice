package deno;

interface my3{
	
	static  int x=10;
	
}
class child5 implements my3{
	 void display() {
		 System.out.println("child display call........");
	 }
}



public class Interface_example7 {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 child5 c=new child5();
		 System.out.println(c.x);
		 c.display();
	}

}
