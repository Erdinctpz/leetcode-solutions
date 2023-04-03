class Solution {
    public boolean isPalindrome(int x) {
        long pal=0,temp=x;

        while(temp>0){
            pal=(pal*10)+(temp%10);
            temp/=10;
        }
        if(x==pal){
            return true;
        }

    return false;
    }
}
