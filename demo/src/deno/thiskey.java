package deno;
       // use this keyword 
public class thiskey {
	String id ,pass;
	 static String ename="tcs";
	
	void input(String id,String pass) {
		this.id=id;
		this.pass=pass;;
		
	}
	
	void show() {
		 System.out.println("user id " + id);
		 System.out.println("user password " + pass);
		 System.out.println("company name " + ename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        thiskey t1=new thiskey();
        t1.input("abcd","abcd1224")	;
        t1.show();    
	}

}
