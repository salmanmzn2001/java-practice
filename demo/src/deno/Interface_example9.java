package deno;

     // lambda expression without parameter

   interface myy1{
	   String show();
   }
public class Interface_example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myy1 m=()->{
    	   return"i have nothing to say......";
       };
       System.out.println(m.show());
	}

}
