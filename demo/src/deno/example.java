package deno;
// static program
// member data
public class example {
	
     int eid;
	String ename;
	static String cname="tcs";// static
	  
	  void input(int id,String name) {
		eid=id;
		ename=name;
	}
	    void show() {
	    	System.out.println("employee id " +eid);
	    	System.out.println( "employee name " + ename);
	    	System.out.println("company name " + cname);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      example c=new example();
      c.input(12,"rahul");
      c.show();
      c.input(13,"ravi");
      c.show();
      c.input(14,"ram");
      c.show();
      c.input(15,"mohan");
      c.show();
      c.input(16,"shayam");
      c.show();
	}

}
