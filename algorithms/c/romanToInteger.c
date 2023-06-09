int roman(char c){
    switch(c){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
    }
    return -1;
}

int romanToInt(char * s){
int sum=0;
int i;
    for(i=0; i<strlen(s)-1; i++){
        if(roman(s[i])<roman(s[i+1])){
            sum-=roman(s[i]);
        }else{
            sum+=roman(s[i]);
        }
    }
    sum+=roman(s[i]);
    return sum;
}