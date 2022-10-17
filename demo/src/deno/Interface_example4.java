package deno;

interface drowble{
	void drow();
}
class rectangle implements drowble{
	public void drow() {
		System.out.println("drowing rectangle ");
	}
}
class circle implements drowble{
	public void drow() {
		System.out.println("drowing circle");
	}
}

public class Interface_example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     drowble d=new circle ();
     
     d.drow();
     
	}

}
