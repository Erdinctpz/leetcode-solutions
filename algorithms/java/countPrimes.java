import java.util.Arrays;
class Solution {
    public int countPrimes(int n) {
    int count=0;
    
    boolean isPrime[] = new boolean[n];
    Arrays.fill(isPrime,true);
    
    if(n==1){
        isPrime[0]=false;
    }
    
    if(n>1){
        isPrime[0]=isPrime[1]=false;
    }

        for(int i=2; i<=Math.sqrt(n); i++){
            for(int j=2; i*j<n; j++){
                isPrime[i*j]=false;
            }
        }
        
        for(boolean b : isPrime){
            if(b==true){
                ++count;
            }
        }
        return count;
    }
    
}