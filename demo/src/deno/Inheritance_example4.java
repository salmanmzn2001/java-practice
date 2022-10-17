package deno;
             // method overloading and method overriding 
class bike{
	void show() {
		System.out.println("please wear the helmet");
	}
}
class car extends bike{
	void show() {
		System.out.println("driving is safely please");
		super.show();
	}
}



public class Inheritance_example4 {
      int id;
       int pass;
       String name;
      float sal;

	Inheritance_example4(int id){
		System.out.println("employee id : " + id);
	}
	
	Inheritance_example4(int id,int pass){
		System.out.println("employee id: " + id);
		System.out.println("employee pass: " + pass);
	}
	Inheritance_example4(int id,int pass,String name){
		System.out.println("employee id: " + id);
		System.out.println("employee pass: " + pass);
		System.out.println("employee id: " + name);
		
	}
	
	Inheritance_example4(int id ,String name){
		this.id=id;
		this.name=name;
	
	}
	void show() {
		System.out.println("employee id : "+ id);
		System.out.println("employee name : " + name );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    car obj=new car();
    obj.show();
    Inheritance_example4 t1=new Inheritance_example4(01);
    Inheritance_example4 t2=new Inheritance_example4(01,234);
    Inheritance_example4 t3=new Inheritance_example4(01,234,"rohan");
    Inheritance_example4 t5=new Inheritance_example4(002,"ram");
    t5.show();
	}

}
