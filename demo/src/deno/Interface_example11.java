package deno;


   // lambda expression single parameter

interface mp3{
	String show(String name);
}
public class Interface_example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      mp3 m=(name)->(name);{ // 1 way to write 
    	 // return"hello" + name;    // 2 way  to write 
      };
      System.out.println(m.show(" abd"));
	}

}
