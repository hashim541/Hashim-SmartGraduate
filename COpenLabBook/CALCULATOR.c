#include<stdio.h>
int main()
{
	char c;
	int a,b;
	printf("enter the operators (+,-,*,/,%): ");
	scanf("%c",&c);
	printf("enter the two operands = ");
	scanf("%d%d",&a,&b);
	switch(c){
		case'+':
			printf("%d + %d = %d",a,b,a+b);
			break;
		case'-':
			printf("%d - %d = %d",a,b,a-b);
			break;
		case'*':
			printf("%d * %d = %d",a,b,a*b);
			break;
		case'/':
			printf("%d / %d = %d",a,b,a/b);
			break;	
		case'%':
			printf("%d % %d = %d",a,b,a%b);
			break;	
		default:
			printf("you have entered wrong operator");
	}
}
