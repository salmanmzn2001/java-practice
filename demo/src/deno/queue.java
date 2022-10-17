package deno;

public class queue {
int size=5;
int arr[]=new int[size];
int front,rear;
queue(){
	front=-1;
	rear=-1;
	
}
boolean isfull() {
	if (front==0 && rear==size-1) {
		return true;
		
	}
	return false;
}
boolean isempty() {
	if(front==-1) {
		return true;
	}
	return false;
}
void enqueue(int element) {
	if(isfull()) {
		System.out.println(" queue is full");
	}
	else {
		if(front==-1) 
			front=0;
		rear++;
		arr[rear]=element;
		System.out.println("insert element"+element);
		
		
	}
}
int dequeue() {
	int element;
	if(isempty()) {
		System.out.println("queue is empty");
		return(-1);
	
	}
	else {
		element=arr[front];
		if(front>=rear){
			front=-1;
			rear=-1;
		}	

		else {
			front++;
		}
		System.out.println("deleted element"+element);
		return(element);
		}}
		
        void display() {
        	int i;
        	if(isempty()) {
        		System.out.println("queue is empty");
        		
        	}
        	else {
        		System.out.println(front);
        		for( i=front;i<=rear;i++) {
        			System.out.println(arr[i]);
        			System.out.println("rear index"+rear);
        		
        		}
        	}}
        	
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       queue q=new queue();
       q.dequeue();
       q.enqueue(1);
       q.enqueue(4);
       q.enqueue(5);
       q.enqueue(3);
       q.enqueue(6);
       q.enqueue(7);
       q.enqueue(6);
       q.display();
       q.dequeue();
       q.display();
	}

}
