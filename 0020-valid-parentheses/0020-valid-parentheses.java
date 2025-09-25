class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[', ']');

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (parentheses.containsKey(c)) {
                stack.push(c);
            } else {
                
                if(stack.empty() || parentheses.get(stack.peek()) != c){
                    return false;
                }
                stack.pop();
            }
            
        }

        return stack.empty();
    }
}