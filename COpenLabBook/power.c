#include<stdio.h>
int main()
{
	int b,e;
	long double r=1.0;
	printf("enter the base number = ");
	scanf("%d",&b);
	printf("enter the exponential = ");
	scanf("%d",&e);
	while(e!=0){
		r*=b;
		--e;
		
	}
	printf("the powe value is %0.Lf",&r);
	return 0;
}
