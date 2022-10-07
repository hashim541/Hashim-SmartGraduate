#include<stdio.h>
int main(){
	int i,n,s=0;
	for(i=1;i<=10;i++){
		printf("enter n%d = ",i);
		scanf("%d",&n);
		if(n<0){
			break;
		}
		s+=n;
	}
	printf("the sum is = %2.lf"+s);
	return 0;
}
