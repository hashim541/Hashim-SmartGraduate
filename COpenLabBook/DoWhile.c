#include<stdio.h>
int main(){
	int n,s=0;
	do{
		printf("enter a number: ");
		scanf("%d",&n);
		s+=n;
	}while(n!=0);
	printf("the sum is = %d",s);
	return 0;
	
}
