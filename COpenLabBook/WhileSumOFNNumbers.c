#include<stdio.h>
int main(){
	int i=1,n,s=0;
	printf("enter how many numbers = ");
	scanf("%d",&n);
	while(i<=n){
		s+=i;
		i++;
	}
	printf("the sum is = %d",s);
	return 0 ;
	
}
