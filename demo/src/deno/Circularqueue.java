package deno;
import java.util.Scanner;
 class Queue1{
	 int f=-1,r=-1;
	 int maxsize=10;
	 int arr[]=new int[maxsize];
	   
	  void enqueue(int iteam) {
		  if(f==(r+1)%maxsize) {
			  System.out.println("overflow");
			  
		  }
		  else {
			  System.out.println("enter the iteam");
			
			  if(f==-1 && r==-1) {
				  f=0;
				  r=0;
				  arr[r]=iteam;
			  }
			  else {
				  r=(r+1)%maxsize;
				  arr[r]=iteam;
					
			  }
		  }
	  }
	
 
       void dequeue() {
    	   if(f==-1 && r==-1) {
    		   System.out.println("underflow");
    	   }
    	   else if(f==r) {
    		   f=f+1;
    	   }
    	   else {
    		   f=(f+1)%maxsize;
    	   }
       }
          void display() {
        	  int i;
        	  System.out.println("iteam are ....");
        	  for( i=f;i!=r;i=(i+1%maxsize)) {
        		  System.out.println(arr[i]);
        	  }
        		  System.out.println(arr[i]);
        	  }
        	  
          }

public class Circularqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice=0;
         Scanner sc=new Scanner (System.in);
         queue q=new queue();
      
         System.out.println("queue opration using array");
         while(choice!=4) {
        	 System.out.println("choose from below option");
        	 System.out.println("\n1.enqueue\n2.dequeue\n3.display\n4.exit");
        	 System.out.println("enter choice");
        	
        	 choice=sc.nextInt();
        	 switch(choice) {
        	 case 1:{
        		 System.out.println("enter the iteam");
        		 int iteam=sc.nextInt();
        		  q.enqueue(iteam);
        		      break;
        		      }
        	 case 2:{
        		   
        		 q.dequeue();
        	
        		 break;
        		
        	 }
        	 case 3:{ 
        		 q.display();
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

		    
         }}}
