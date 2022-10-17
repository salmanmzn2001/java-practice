package deno;

public class quicksort{
	 int partion(int arr[],int start,int end) {
		int pivot=arr[end];
		int i=(start-1);
		for(int j=start;j<=end-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return(i+1);
		
	}
 void quick(int arr[],int start,int end) {
	 if(start<end) {
		 int p=partion(arr,start,end);
		 quick(arr,start,p-1);
		 quick(arr,p+1,end);		 
	 }
 }
 void printaarray(int arr[],int num) {
	 for(int i=0;i<num;i++) {
		 System.out.println(arr[i]);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {13,14,27,2,1,};
		int num=arr.length;
		System.out.println("before sorting");
		quicksort q1=new quicksort();
		q1.printaarray(arr,num);
		q1.quick(arr,0,num-1);
		System.out.println("after sorting");
		q1.printaarray(arr,num);
		

	}

}
