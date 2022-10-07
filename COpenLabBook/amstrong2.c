#include<stdio.h>
#include<math.h>
int main()
{
	int n=0,on,rem,num;
	float res=0;
	printf("enter a three digit number = ");
	scanf("%d",&num);
	on=num;
	for(on=num;on!=0;++n){
		on/=10;
	}
	for(on=num;on!=0;on/=10){
		rem=on%10;
		res +=pow(rem,n);
	}
	if((int)res==num){
		printf("it is an amstrong number");
	}else{
		printf("it is not an amstrong number ");
	}
	return 0;
	
}
