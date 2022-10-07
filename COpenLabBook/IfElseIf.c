#include<stdio.h>
int main(){
	int n1,n2;
	printf("enter two numbers :");
	scanf("%d%d",&n1,&n2);
	if(n1==n2){
		printf("result: %d==%d",n1,n2);
	}else if(n1>n2){
	printf("result: %d>%d",n1,n2);
	}else{
		printf("result: %d<%d",n1,n2);
	}
	return 0;
}
