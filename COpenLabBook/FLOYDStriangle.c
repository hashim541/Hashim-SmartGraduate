#include<stdio.h>
int main(){
	int r,i,j,n=1;
	printf("enter the no fo rows : ");
	scanf("%d",&r);
	for(i=1;i<=r;i++){
		for(j=1;j<=i;++j){
			printf("%d ",n);
			++n;
		}
		printf("\n");
	}
	return 0;
}
