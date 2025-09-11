class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String longestString = "";
        String palindrome1 = "";
        String palindrome2 = "";
        for (int center = 0; center < s.length(); center++){
            palindrome1 = expand(center,center,s);
            palindrome2 = expand(center,center+1,s);
            if (palindrome1.length() > maxLen){
                longestString = palindrome1;
                maxLen = palindrome1.length();
            } 
            if (palindrome2.length() > maxLen){
                longestString = palindrome2;
                maxLen = palindrome2.length();
            }


            
        }
        
        return longestString;
    }

    private String expand(int left, int right , String s){
        
        char a;
        char b;
        
        while ((left >= 0) && (right < s.length())){
            
                a = s.charAt(right);
                b = s.charAt(left);
                if (a != b){
                    break;
                }
                
                left = left - 1;
                right = right + 1;
            }


            return s.substring(left+1, right);
    }
}