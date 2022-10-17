package deno;
    // method overriding

class base{
	void show() {
		System.out.println("base call  ");
	}
}
class sub extends base{
	void show() {
		System.out.println("child class");
		super.show();
	}
}

public class Inheritance_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sub obj=new sub();
        obj.show();
	}

}
