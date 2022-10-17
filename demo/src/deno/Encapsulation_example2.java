package deno;

   class area{
	private int  length,breadth;
	
	public void setarea(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public int getarea() {
		return length*breadth;
		
	}
}

public class Encapsulation_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      area a=new area();
      a.setarea(012, 12);
      System.out.println("area :" + a.getarea());
	}

}
