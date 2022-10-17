package deno;

// lambda expression multiple parameter
interface myyy{
	int show(int a,int b);
}
public class Interface_example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myyy m =(a,b)->(a+b);
    	   System.out.println(m.show(12, 100));
       
	}

}
