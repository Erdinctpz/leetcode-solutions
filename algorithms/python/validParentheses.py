class Solution:
    def isValid(self, s: str) -> bool:
        myStack = list()

        for char in s:
            if char == '(' or char == '[' or char == '{':
                myStack.append(char)
            else:
                if len(myStack) == 0:
                    return False
                if char == ')' and myStack[len(myStack) - 1] == '(':
                    myStack.pop()
                elif char == ']' and myStack[len(myStack) - 1] == '[':
                    myStack.pop()
                elif char == '}' and myStack[len(myStack) - 1] == '{':
                    myStack.pop()
                else:
                    return False
        if len(myStack) == 0:
            return True
        return False
                