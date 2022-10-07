#include<stdio.h>
int main()
{
	int a;
	float b;
	double c;
	char d;
	printf("size of int: %zu bytes \n",sizeof(a));
	printf("size of float: %zu bytes \n",sizeof(b));
	printf("size of double: %zu bytes \n",sizeof(c));
	printf("size of char: %zu bytes \n",sizeof(d));
	return 0;
}
