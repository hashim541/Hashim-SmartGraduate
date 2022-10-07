#include<stdio.h>
#include<conio.h>
#include<math.h>
int main()
{
	int n,size,z,i,j,k,a;
	printf("enter the n value: ");
	scanf("%d",&n);
	size=(2*n)-1;
	z=size/(-2);
	for(i=z;i<(-z);i++){
	
	for(j=z;j<(-z);j++){
	
	for(k=0;k<size;k--)
	if(i==z-k || j==z-k || abs(i)==abs(z)+k ||abs(j)==abs(z)+k){
	
	for(a=0;a<abs(size/(-2));a++)
	printf("%d",abs(n-a));
  }}
  printf("\n");
  }
}
