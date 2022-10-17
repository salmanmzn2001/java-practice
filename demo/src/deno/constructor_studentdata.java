package deno;


    class college{    // class 
    	int cllcode;
    	String cllname;
    	
    
    college(int cllcode,String cllname){  // constructor
    	this.cllcode=cllcode;
    	this.cllname=cllname;
    	
    }
    	
    }
    class marksheet{   //2 class
    	int marks;
    	String sub;
    	college clg;
    	marksheet(int marks,String sub,college clg){   // 2 constructor
    		 this.marks=marks;
    		 this.sub=sub;
    		 this.clg=clg;
    	}
    
    
    void show()
{
       System.out.println( "student marks: " + marks);
       System.out.println( "student subject:" + sub);
       System.out.println( "student college code:" + clg.cllcode);
       System.out.println( "student college name:" + clg.cllname);
    	
}
    }
    
    class student {
    	int rollnum;
    	String name;
    	marksheet mrk;
    	String addr;
    	student(int rollnum,String name,marksheet mrk ,String addr){
    		this.rollnum=rollnum;
    		this.name=name;
    		this.mrk=mrk;
    		this.addr=addr;
    	}
    	void display() {
    		 System.out.println( "student rollnum: " + rollnum);
    	       System.out.println( "student name:" + name);
    	       System.out.println( "student college marks:" + mrk.marks);
    	       System.out.println( "student college subject:" + mrk.sub);
    	       System.out.println( "student college address:" + addr);
    	 
    		 
    	}
    	
    }
    
    	public class constructor_studentdata {
        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //constructor_studentdata c=new constructor_studentdata();
   college d=new college(355,"srgc");
   marksheet m=new marksheet(250,"english",d);
   student s=new student(12,"rahul",m,"muzaffernager");
   m.show();
   s.display();
	}

}
