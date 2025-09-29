class Solution {
    public String addBinary(String a, String b) {
        int length_longest = Math.max(a.length(), b.length());
        String res  = "";
        int carry_over = 0;
        int i = 0;
        while(i < length_longest || carry_over == 1){
            int char_a = 0;
            int char_b = 0;
            int addition = 0;

            if(a.length() > i && a.charAt(a.length() - i - 1) == '1'){
                char_a = 1;
            } 

            if(b.length() > i && b.charAt(b.length() - i - 1) == '1'){
                char_b = 1;
            }

            addition = char_b + char_a + carry_over;

            if(addition >= 2){
                carry_over = 1;
            } else {
                carry_over = 0;
            }
            res = (addition%2) + res;


            i++;
        }
        return res;

    }
}