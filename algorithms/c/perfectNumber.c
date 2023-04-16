#include <stdbool.h>
bool checkPerfectNumber(int num){

int value = 0;
for(int i = 1; i <= num / 2; i++){
    if(num % i == 0)
        value += i;
}

if(num != value)
    return 0;

    return 1;
}