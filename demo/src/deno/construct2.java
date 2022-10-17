package deno;

//overloading 

public class construct2 {
	int age;
	int num;
	String name;
	
	construct2(){
		 age=23;
		 num=1232123;
		 name="rahul";
	}
	
	construct2(int age){
		this.age=age;
		
	}
	
	construct2(int age ,int num){
		this.age=age;
		this.num=num;
	}
	construct2(int age,int num,String name){
		 this.age=age;
		 this.num=num;
		 this.name=name;
	}
	
	//copy constructor
	
	construct2(construct2 z){
		this.age=z.age;
		this.num=z.num;
		
		
	}
	
	
	void show() {
		System.out.println("age: " + age);
		System.out.println(num);
		System.out.println("name " + name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        construct2 c1=new construct2();
        c1.show();
        construct2 c2=new construct2(12,011);
        c2.show();
        construct2 c4=new construct2(c2);
        c4.show();
        construct2 c3=new construct2(001,985,"abdd");
        c3.show();
        construct2 cc=new construct2(45);
        cc.show();
	}

}
