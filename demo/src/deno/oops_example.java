package deno;

public class oops_example {
	
	    int id;
	    int num;
	    String name;
	    String city;
	    
	    void input(int eid,String ename,String ecity) {
	    	id=eid;
	    	name=ename;
	    	city=ecity;
	  
	    }
	    
	    void input1(int eid,String ename,String ecity,int enumber) {
	    	id=eid;
	    	name=ename;
	    	city=ecity;
	    	num=enumber;
	    }
	  
	    void show() {
	    	System.out.println("id:" +id);
	    	System.out.println("name:"  +name);
	    	System.out.println("city:"  +city);
	    	System.out.println("number:" +num);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
        oops_example e1=new oops_example();
        oops_example e2=new oops_example();
        System.out.println("1 data");
         e1.input(12,"salman","delhi");
         e1.show();
         System.out.println("2 data");
         e1.input1(13,"abc","delhi",76534546);
         e1.show();
         System.out.println("3 data");
         e2.input(23, "abcd"," meerut");
         e2.show();
	}}


