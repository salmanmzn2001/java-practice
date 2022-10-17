package deno;
import java.util.Scanner;

public class stack {
	int top;
	int maxsize=10;
	int arr[]=new int[maxsize];
	boolean isempty() {
		return(top<0);
	
	}
	boolean push(Scanner sc) {
		if(top==maxsize-1)
		{
			System.out.println("overflow");
			return false;
		}
		
	
		else {
			System.out.println("enter the value");
			int value=sc.nextInt();
			top++;
			arr[top]=value;
			System.out.println("iteam pushed");
			System.out.println("position insert ="+top);
			System.out.println("pushed value is="+value);
		
			return true;
		}
			
		}


	boolean pop() {
		if(top==-1) {
			System.out.println("underflow");
			return false;
			
		}
		else {
			top--;
			System.out.println("iteam popped");
			System.out.println(top);
			return true;
		}
	}
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
			
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int choice=0;
         Scanner sc=new Scanner (System.in);
         stack s=new stack();
         System.out.println("stack opration using array");
         while(choice!=4) {
        	 System.out.println("choose from below option");
        	 System.out.println("n1.push\n2.pop\n3.show\n4.exit");
        	 System.out.println("enter choice");
        	 choice=sc.nextInt();
        	 switch(choice) {
        	 case 1:{
        		s.push(sc);
        		break;
        	 }
        	 case 2:{
        		 s.pop();
        		 break;
        		
        	 }
        	 case 3:{ 
        		 s.display();
        	 }
        	 case 4:{ 
        		 System.out.println("exit");
        		 System.exit(0);
        		 break;
        		 }
         default:{
        	 System.out.println("please enter valid choice");
         }
        	 }
         }
	}


}