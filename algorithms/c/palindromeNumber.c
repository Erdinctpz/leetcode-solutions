#include <stdbool.h>

bool isPalindrome(int x){

long number,temp,pal=0;
temp=x;

while (temp>0)
{     
    pal=(pal*10)+(temp%10);   
    temp=temp/10;   
}

if (x==pal)
{
    return 1;
}
else
    return 0;
}