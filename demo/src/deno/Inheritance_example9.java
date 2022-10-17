package deno;
       // has a relationship or aggregation
       
class address{   // 1 class 
	    String city,state;
	    address(String city,String state){
	    	this.city=city;
	    	this.state=state;
	    }
}
     class emp{     // 2 class 
	int eid;
	String ename;
	address adr;
	emp(int eid,String ename,address adr){
	     this.eid=eid;
	     this.ename=ename;
	     this.adr=adr;
	     
}    
	
	
	void show() {
		System.out.println("employee id:  " + eid);
		System.out.println("employee name: " + ename);
		System.out.println("employee adress: " + adr.city + " " + adr.state);
	}
}
public class Inheritance_example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         address a=new address("Muzaffernager","Uttar Pradesh");
         emp b=new emp(12,"ram",a);
      
         b.show();
        
	}

}
