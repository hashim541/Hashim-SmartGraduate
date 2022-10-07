#include<stdio.h>
int main()
{
	int n,on,rem,res=0;
	printf("enter a three digit number = ");
	scanf("%d",&n);
	on=n;
	while(on!=0){
		rem=on%10;
		res+=rem*rem*rem;
		on /=10;
		
	}
	if(res==n){
		printf(" it is an armstrong number");
		
	}else{
		printf("it is not an amstrong number");
		
	}
	return 0;
}
