#include<stdio.h>
int main()
{
	int n,rem,rev=0,a;
	printf("enter a number = ");
	scanf("%d",&n);
	a=n;
	while(n!=0){
		rem=n%10;
		rev =rev*10+rem;
		n/=10;
	}
	printf("the reverse is %d \n ",rev);
	if(a==rev){
		printf("this is palandrome\n");
	}else{
		printf("it is not a palandrome");
	}
	return 0;
	
}
