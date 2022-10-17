package deno;

public class Construct1 {
	int sid;
	String sname,address;
	
	//default constructor
	Construct1(){
		sid=03;
		sname="rahul";
		address="mumbai";
		
	}
	
	//parameterized constructor
	
	 Construct1( int sid,String sname,String address){
		  
		     this.sid=sid;
		     this.sname=sname;
		     this.address=address;
		  
	 }
	 Construct1(int sid,String sname){
		 this.sid=sid;
		 this.sname=sname;
		   
	 }
	 void show(){
		 System.out.println("student id : " + sid);
		 System.out.println("student name: " + sname);
		 System.out.println("student address: " + address);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Construct1 c=new Construct1(01,"salman","pune"); 
      c.show();
      Construct1 C2=new  Construct1(02,"sahil","delhi");
      
      C2.show();
      Construct1 c3=new Construct1();
      c3.show();
      Construct1 c4=new Construct1(01,"abd");
      c4.show();
      
	}

}
