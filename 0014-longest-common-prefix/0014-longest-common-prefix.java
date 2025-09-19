class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest_prefix;
        if (strs.length <= 0){
            return "";
        } else {
            longest_prefix = strs[0];
        }

        for (int idx = 1; idx < strs.length; idx++){
            if (strs[idx].startsWith(longest_prefix)){
                continue;
            }
            
            int i = 0;
            while (i < strs[idx].length()){
                 if (longest_prefix.charAt(i) == strs[idx].charAt(i)){
                    i++;
                    continue;
                } else {
                    break;
                }

            }
            longest_prefix = longest_prefix.substring(0,i);

            if (longest_prefix.equals("")){
                break;
            }
        }
        return longest_prefix;
        
    }
}