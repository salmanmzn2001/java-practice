import java.util.Scanner;

public class example {

	public static void armstrong(int num) {
		int temp=num,sum=0;
		while(num!=0) {
			int rem=num%10;
			 sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		if(sum==temp) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          int num=sc.nextInt();
          
          armstrong(num);
         //System.out.println(armstrong(num));
         
	}

}
