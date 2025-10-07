class Solution {
    public int climbStairs(int n) {
        int res = 0;
        int n_1 = 0;
        int n_2 = 1;

        for(int i = 0; i <= n; i++){
            res = n_1 + n_2;
            n_2 = n_1;
            n_1 = res;    
        }

        return res;
    }
}