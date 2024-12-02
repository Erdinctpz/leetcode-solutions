class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                myStack.add(s.charAt(i));
            }
            else{
                if(myStack.size() == 0){
                    return false;
                }
                switch(s.charAt(i)){
                    case ')': 
                        if(myStack.peek() == '('){
                            myStack.pop();
                        }
                        else
                            return false;        
                        break;
                    case '}':
                        if(myStack.peek() == '{'){
                            myStack.pop();
                        }
                        else
                            return false;
                        break;
                    case ']':
                        if(myStack.peek() == '['){
                            myStack.pop();
                        }
                        else
                            return false;
                        break;
                    default:
                        break;
                }
            }      
        }
        if(myStack.size() == 0){
            return true;
        }
        return false;
    }
}