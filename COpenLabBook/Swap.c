#include<stdio.h>
int main()
{
	int a,b,temp;
	printf("enter first number : ");
	scanf("%d",&a);
	printf("enter second number : ");
	scanf("%d",&b);
	temp=a;
	a=b;
	b=temp;
	printf("swaped of first number : %d \n",a);
	printf("swaped of second number : %d",b);
	return 0;
}
