#include<stdio.h>
int main(){
	char o;
	int a,b;
	printf("enter the operator : ");
	scanf("%c",&o);
	printf("enter two operands : ");
	scanf("%d%d",&a,&b);
	switch(o){
	case '+':
	printf("%d + %d = %d",a,b,a+b);
	break;
	case '-':
	printf("%d - %d = %d",a,b,a-b);
	break;
	case '*':
	printf("%d * %d = %d",a,b,a*b);
	break;
	case '/':
	printf("%d + %d = %d",a,b,a/b);
	break;		
	default:
		printf("you have entered incorrect operator");
	}
	return 0;
	
}
