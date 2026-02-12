class Solution {
    public int minSwaps(String s) {
        int size = s.length();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<size; i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || stack.peek() == ']'){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        int brackets = stack.size()/2;
        return (brackets+1)/2;
    }
}