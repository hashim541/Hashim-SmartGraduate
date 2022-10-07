#include<stdio.h>
int main(){
	const int max=100;
	int i;
	int n,a,s=0;
	for (i=1;i<=max;i++){
		printf("%d.enter a number = ",i);
		scanf("%d",&n);
		if(n<0){
			goto jump;
		}
		s+=n;
	}
	jump:
		a=s/(i-1);
		printf("sum is = %d\n",s);
		printf("average is = %d",a);
		return 0;
}
