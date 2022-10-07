#include<stdio.h>
int main()
{
	int n,i;
	int t1=0,t2=1;
	int next=t1+t2;
	printf("enter the range of fibonacci series : ");
	scanf("%d",&n);
	printf("fibonacci series = %d  %d ",t1,t2);
	for(i=3;i<=n;++i){
		printf(" %d ",next);
	
		t1=t2;
		t2=next;
		next=t1+t2;
	}
	return 0;
}
