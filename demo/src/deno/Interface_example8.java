package deno;
      
// functional interface
  //using lambda expression 
interface myy{
	   void show();
}
   
  public class Interface_example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=20;
		 // with lambda expression
		 myy m1=()->
		 {
			 System.out.println("myy" + x);
		 };
		m1.show();
		
      	}

}
