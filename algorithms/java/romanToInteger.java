class Solution {
    
    public static int roman(char c){
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
    
    public int romanToInt(String s) {
        int result=0;
        int i;
        for(i=0; i<s.length()-1; i++){
            if(roman(s.charAt(i))<roman(s.charAt(i+1))){
                result-=roman(s.charAt(i));
            }else{
                result+=roman(s.charAt(i));
            }
        }

        return result+roman(s.charAt(i));
    }
}