package deno;

public class construct {
	 static int x=10;
	 static
	 {
		 System.out.println("static block " + x);
	 }
	 void show() {
	 System.out.println(x);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     construct obj=new construct();
     obj.show();
   //  new construct() .show();(anonymous object)
	}

}
