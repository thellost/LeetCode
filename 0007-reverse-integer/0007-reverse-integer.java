class Solution {
    public int reverse(int x) {
        int result = 0;
        int is_negative;

        if (x < 0){
           is_negative = -1;
        } else {
            is_negative = 1;
        }

        x*=is_negative;
        
        String original_string = String.valueOf(x);

        for ( int idx = original_string.length()-1; idx >= 0; idx--){
            int z = Integer.parseInt(String.valueOf(original_string.charAt(idx)));
            if (z*(Math.pow(10,idx)) + result >= 2147483647){
            return 0;
            }

            result += z*(Math.pow(10,idx));
        }
        result *= is_negative ;
        return result;
    }
}