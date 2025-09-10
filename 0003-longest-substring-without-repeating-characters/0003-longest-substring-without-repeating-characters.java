class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> character_check = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++){
            char a = s.charAt(right);
            while (character_check.containsKey(a)){
                character_check.remove(s.charAt(left));
                left++;
            }
            
            character_check.put(a, true);
            
            
            if (right-left+1 > maxLen){
                maxLen = right-left+1;
            }

            
        }
        return maxLen;
    }
}