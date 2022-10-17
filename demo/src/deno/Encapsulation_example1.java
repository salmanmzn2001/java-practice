package deno;


 class student5{
	 private int id;
	 private String name,email;
	 private int rollnum;
	 
	 
      
      public int  getid() {
    	  if (id>=15) {
    		  
    		  System.out.println("student id:" + "selected");
    	  }
    	  else {
    		  System.out.println(" student id: not selected");
    	  }
    	  
      
           return id;
      }
      public void setid(int id) {
    	
    	this.id=id;
      }
    	  
      
      
      public int getrollnum() {
    	  
    	  if(rollnum>=50) {
    		  System.out.println("you are apply");
    	  }
    	  
    	  else {
    		  System.out.println("not are apply sorry");
    	  }
    	  return rollnum;
    	  
    	  
      }
      public void setrollnum( int rollnum){
    	  this.rollnum=rollnum;
    	  
      }
      
      public String getname( ) {
    	  return name;
      }
      
      public void setname( String name) {
    	  this.name=name;
      }
      
      public String getemail() {
    	 return email;
    	 
      }
      
      public void setemil(String email) {
    	  this.email=email;
      }
      
      }  
      
public class Encapsulation_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 student5 s=new student5();
		 s.setid(16);
		 s.setrollnum(123);
		 s.setname("salman");
		 s.setemil("salman@123");
		 s.getid();
		 s.getrollnum();
		// System.out.println("student id: " + s.getid());
		// System.out.println("student rollnum: " + s.getrollnum());
		 System.out.println("student name: " + s.getname());
		 System.out.println("student email: " + s.getemail());
		 
		 
		

	}

}
