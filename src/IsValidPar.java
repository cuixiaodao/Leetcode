class Solution {
    private static Map<Character, Character> charMap = new HashMap<>();
    static {
        charMap.put('[', ']');
        charMap.put('{', '}');
        charMap.put('(', ')');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            Character rightPair = charMap.get(c);
        
            if (null == rightPair) {
                if (stack.empty() || charMap.get(stack.pop()) != c) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.empty();
    }
}
