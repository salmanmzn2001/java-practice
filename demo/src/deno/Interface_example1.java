package deno;
    // wrong program

 interface Interface_example1 {
     	void show();
	void display();
 }
 
	class example4 implements Interface_example1{
	public	void show() {
			System.out.println(" child show call");
		}
	public	void display() {
			
			System.out.println(" child display call");
		}
		public static void main(String args[]) {
			example a1=new example();
			a1.show();
		//	a1.display();
		}
	}

			


