package deno;

public class chainconstruct {
	
	chainconstruct(){
		this(10);
		System.out.println("default constructor call");
	}
	chainconstruct(int x){
		this(10,20);
		System.out.println(x);
	}
	chainconstruct(int x,int y){
		System.out.println(x+y);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new  chainconstruct();
	}

}
