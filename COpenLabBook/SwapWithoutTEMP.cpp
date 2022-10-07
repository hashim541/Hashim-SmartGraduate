#include<stdio.h>
int main()
{
	int a,b;
	printf("enter a :");
	scanf("%d",&a);
	printf("enter b :");
	scanf("%d",&b);
	a=a-b; //5=5-10 a=-5
	b=a+b; // -5+10 b=5
	a=b-a; // 5-(-5) a=10
	printf("after swapping a = %2.d \n",a);
	printf("after swapping b = %2.d \n",b);
	return 0;
	
}
