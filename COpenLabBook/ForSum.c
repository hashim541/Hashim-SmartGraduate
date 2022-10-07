#include<stdio.h>
int main()
{
	int n,c,s=0;
	printf("enter a positive integer : ");
	scanf("%d",&n);
	for(c=1;c<=n;c++){
		s=s+c;
	}
	printf("the sum is = %d",s);
	return 0;
}
