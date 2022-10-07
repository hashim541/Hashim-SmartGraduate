#include<stdio.h>
int main()
{
	int i,n;
	unsigned long long f=1;
	printf("enter a number to factorial: ");
	scanf("%d",&n);
	if(n<0){
		printf("enter a positive number");
	}else{
		for(i=1;i<=n;++i){
			f *=i;
		}
	}
	printf("the factorial of number you entered = %llu",f);
	return 0;
}
