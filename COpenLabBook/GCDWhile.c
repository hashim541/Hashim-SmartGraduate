#include<stdio.h>
int main()
{
	int n1,n2;
	printf("enter two numbers : ");
	scanf("%d%d",&n1,&n2);
	while(n1!=n2){ //10 !=15
		if(n1>n2)  // 10 > 15
		n1 -=n2;    //10=10-15
		else    // 10<15
		n2 -=n1;  //15=15-10
	}
	printf("gcd is = %d",n1);
	return 0;
	
}
