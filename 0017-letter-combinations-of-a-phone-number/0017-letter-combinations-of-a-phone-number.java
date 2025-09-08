import java.util.ArrayList;
import java.util.List;

class Solution {

    private final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        backtrack(combinations, digits, 0, new StringBuilder());
        return combinations;
    }

   
    private void backtrack(List<String> combinations, String digits, int index, StringBuilder currentPath) {
       
        if (currentPath.length() == digits.length()) {
            combinations.add(currentPath.toString());
            return;
        }

       
        String letters = KEYPAD[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {
            currentPath.append(letter);

            backtrack(combinations, digits, index + 1, currentPath);

    
            currentPath.deleteCharAt(currentPath.length() - 1);
        }
    }
}