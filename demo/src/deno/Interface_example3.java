package deno;

interface printable{
void print();
}

class A6 implements printable{
public void print(){
	System.out.println("Hello");
	}

}

public class Interface_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A6 obj=new A6();
    obj.print();
	}

}
