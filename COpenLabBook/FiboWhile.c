#include<stdio.h>
int main()
{
	int n,i;
	int t1=0,t2=1;
	int next=0;
	printf("enter the range of series = ");
	scanf("%d",&n);
	printf("fibonacci series = %d  %d ",t1,t2);
	next=t1+t2;
	while(next<=n){
		printf(" %d ",next);
		t1=t2;
		t2=next;
		next=t1+t2;
		
	}
	return 0;
	
}
