#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

int countPrimes(int n){
    
int count=0;
if(n<=0){
    return 0;
}
bool isPrime[n];
memset(isPrime,true,sizeof(isPrime));

if(n==1){
    isPrime[0]=false;
}
if(n>1){
    isPrime[0]=false;
    isPrime[1]=false;
}

for(int i=2; i<sqrt(n); i++){
    for(int j=2; i*j<n; j++){
        isPrime[i*j]=false;
    }
}

for(int i=0; i<n; i++){
    if(isPrime[i]==true){
        ++count;
    }
}
    return count;
}


int main(void){
    int number;
    printf("Enter a Number:");
    scanf("%d",&number);
    printf("number of primes:%d\n",countPrimes(number));

}
    