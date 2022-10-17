package deno;
import java.util.Scanner;
public class binearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the number");
		    int num=sc.nextInt();
		    int arr[]=new int[num]; 
		    System.out.println("enter"+ num+ "number");
		     for(i=0;i<num;i++) {
		    	 arr[i]=sc.nextInt();
		    	 
		     }
		     System.out.println("enter the search value");
		     int iteam=sc.nextInt();
		     int first=0;
		     int last=num-1;
		     int middle=(first+last)/2;
		     while(first<=last);
		     {
		    	 if(arr[middle]<iteam) {  
		    		 first=middle+1;
		    		 
		    	 }
		    	 
		    	 else if(arr[middle]==iteam) { 
		    		 System.out.println(iteam+"found is location"+(middle+1));
		    		    
		                break;
		    	 }
		   
		    else {
		    		 last=middle-1;
		    		 
		    	 }
		  middle=(first+last)/2;
		     }
		  if(first>last) {
			  System.out.println(iteam+"is not found in the list");
		  }
		    	 
		     }
}


