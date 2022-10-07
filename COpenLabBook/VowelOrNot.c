#include<stdio.h>
#include<ctype.h>
int main(){
	char c;
	char UC,LC;
	printf("enter an alphabet :");
	scanf("%c",&c);
	LC=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	UC=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
	if(!isalpha(c)){
		printf("ERROR...!");
	}else if(LC||UC){
		printf("%c is an vowel",c);
	}else{
		printf("%c is a consonants",c);
	}
	return 0;
}
