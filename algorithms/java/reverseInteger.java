class Solution {
    public int reverse(int x) {
        int digit;
        long reverse=0;

        while(x!=0){
            digit=x%10;
            x/=10;
            reverse=(reverse*10)+digit;
        }
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*reverse);
        }
        return (int)reverse;
    }
}
