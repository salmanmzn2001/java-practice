package deno;

  abstract class plan {
	  abstract void getrate();
  }
  class comer extends plan{
	  int unit,rate;
	 void getrate() {
		   unit =100;
		   rate=5;
		   System.out.println("comercial plan bill: " + (unit*rate));
	  }
  }
  class demos extends comer {
	  int unit ,rate;
	  void getrate() {
		  unit=1000;
		  rate=5;
		  System.out.println("demos bill: " + (unit*rate));
	  }}
  
public class Abstract_example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      plan p1=new comer();
      p1.getrate();
       plan p2 =new demos();
        p2.getrate();
      
      
	}

}
