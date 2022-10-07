#include<stdio.h>
int main()
{
	int i, j, r, s;
	printf("enter the row ");
	scanf("%d",&r);
	for(i=r;i>=1;--i){
		for(s=0;s<r-i;++s)
		printf("  ");
		for(j=i;j<=2*i-1;++j)
		printf("* ");
		for(j=0;j<i-1;++j)
		printf("* ");
		printf("\n");
	}
	return 0;
}
