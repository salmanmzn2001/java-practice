package deno;

interface myy2{
	   void show();
}


public class Interface_example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=23;
     myy2 m=new myy2() {
    public void show()
    	 {
    		 System.out.println(x);
    	 }
     };
     m.show();
	}

}
