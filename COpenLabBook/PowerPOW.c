#include<stdio.h>
int main()
{
	double b,e,r;
	printf("enter a base num : ");
	scanf("%lf",&b);
	printf("enter the exponential : ");
	scanf("%lf",&e);
	r=pow (b,e);
	printf("the answer is = %.2lf",r);
	return 0;
}
