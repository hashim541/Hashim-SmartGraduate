#include<stdio.h>
int main()
{
	long long n;
	int count;
	printf("enter a long number = ");
	scanf("%d",&n);
	do{
		n/=10;
		count++;
	}while(n!=0);
	printf("the total number of numbers is %d",count);
	return 0;
}
