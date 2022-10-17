package deno;

public class methodoverload {
	  
	int id;
	int pass;
	String name;
	
	 void sdata(int id ,int pass) {
		 System.out.println("student id: "+ id);
		 System.out.println("student pass: "+ pass);

	}
       void sdata(int id) {
    	   System.out.println("student id: "+ id);

	}
	  
	 void sdata(int id , String name) {
		 System.out.println("student id: "+ id);
		 System.out.println("student name: "+ name);

	}
	
	 void sdata(int id,int pass,String name) {
		 System.out.println("student id: "+ id);
		 System.out.println("student pass: "+ pass);
		 System.out.println("student name: "+ name);

	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverload obj=new methodoverload();
		obj.sdata(001);
		obj.sdata(01,0565,"ram");
	
		obj.sdata(1,"sahil");

	}

}
