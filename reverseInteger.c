#include <stdio.h>

int reverse(int x){
    int digit;
    int temp=0;

    while (x!=0)
    {
        digit=x%10;
        x/=10;
        temp=(temp*10)+digit;
    }
    return temp;    
}

int main(void){

int number;
printf("Enter a number:");
scanf("%d",&number);
printf("Number's reverse:%d",reverse(number));

}