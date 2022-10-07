#include<stdio.h>
int main()
{
	int n,i,s=0;
	printf("enter how many numbers : ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
	s+=i;
	}
	printf("the sum is= %d",s);
	return 0;
}
