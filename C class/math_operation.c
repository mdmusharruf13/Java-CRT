#include<stdio.h>
int main(){
	int a,b,res,ch;
	while(1){
		printf("\n Enter two values:");
		scanf("%d %d",&a,&b);
		printf("1.ADD\t 2.SUB\t 3.MUL\t 4.DIV\t 5.EXIT\n:");
		printf("enter your choice :");
		scanf("%d",&ch);
		switch(ch){
			case 1:printf("the sum is %d\n",(a+b));break;
			case 2:printf("the diff is %d\n",(a-b));break;
			case 3:printf("the product is %d\n",(a*b));break;
			case 4:printf("the div is %d\n",(a/b));break;
			case 5:return 0;
		}
	}
	return 0;
}
