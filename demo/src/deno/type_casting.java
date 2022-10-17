package deno;

public class type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=166.66;   // explicit type casting
		long l=(long)d;
		int i=(int)l;
         
          System.out.println("before conversion "+d);
         System.out.println("after conversion "+l);
          System.out.println(i);
          
          int e=97;
          char c=(char)e;
          System.out.println("before conversion " +e);
          System.out.println("after conversion " +c);
            int b=105;
            char s=(char)b;
            System.out.println("before conversion "+b); 
            System.out.println("after conversion "+s);
            
	}

}
