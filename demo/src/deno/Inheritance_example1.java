package deno;

// single level inheritance 

	class employee{

	    
	int eid;
	String ename;
	String post;
	static String cname="tcs";
	
	void inputemp(int eid,String ename,String post) {
		this.eid=eid;
		this.ename=ename;
		this.post=post;
	}
	
	void show() {
		System.out.println("employee id : " + eid);
		System.out.println("employee name : " + ename);
		System.out.println("employee post : " + post);
		System.out.println("compony name : " + cname);
	}
	
}
	class pay extends employee{
		int pid;
		String pname;
		float sal;
		 void inputemppay(int pid,String pname,float sal) {
			 this.pid=pid;
			 this.pname=pname;
			 this.sal=sal;
	}
		 
		 void showpay() {
			 System.out.println("employee id : " + pid);
				System.out.println("employee name : " + pname);
				System.out.println("employee sal : " + sal);
				
			 
		 }}
		 public  class Inheritance_example1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   pay obj=new pay();
		 obj.inputemp(01,"rahul","java developer");
		 
		 obj.inputemppay(01,"ram",5000);
		 obj.show();
		 obj.showpay();
		
    }
	}
		 


