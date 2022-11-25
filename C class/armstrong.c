#include<stdio.h>
int main(){
	printf("Enter a number :");
	int num,res=0,rem,temp;
	scanf("%d",&num);
	temp=num;
	while(num>0){
		rem=num%10;
		res+=(rem*rem*rem);
		num=num/10;
	}
	(temp==res)?printf("It is an armstrong\n"):printf("It is not armstrong\n");
	return 0;
}
