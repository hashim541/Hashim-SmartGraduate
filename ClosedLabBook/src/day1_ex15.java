import java.util.Scanner;
public class day1_ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		int count;
		Scanner r=new Scanner(System.in);
		System.out.println("the list of prime numbers from 1 ~ 100 are : ");
		for(int i=0;i<=num;i++) {
			count=0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
		int num1=r.nextInt();
		int number,temp,total=0;
		number=num1;
		while(number!=0) {
			temp=number%10;
			total =total+temp*temp*temp;
			number /=10;
		}
		if(total==num1) 
			System.out.println(num1+" is an amstrong number.");
		else
			System.out.println(num1+" it is a perfect number.");
			
	
	}

}
