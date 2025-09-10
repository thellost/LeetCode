class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> character_check = new HashMap<>();
        int len = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++){
            for (int z = i; z < s.length(); z++){
                
                char c = s.charAt(z);
                if(character_check.containsKey(c)){
                    character_check.clear();
                    break;
                }
                character_check.put(c,true);
                len++;
                if(len > maxLen){
                    maxLen = len;
                }
                

            }        

             character_check.clear();
             len = 0;

            
        }
        return maxLen;
    }
}