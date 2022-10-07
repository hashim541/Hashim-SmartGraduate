#include<stdio.h>
int main(){
 int num;
 printf("enter any number = ");
 scanf("%d",&num);
 if(num<=0){
 	if(num<0){
 		printf("you have entered negative number");
	 }else{
	 	printf("you have entered zero");
	 }
  }else{
 	printf("you have entered positive number");
 	
  }
 return 0;
}
