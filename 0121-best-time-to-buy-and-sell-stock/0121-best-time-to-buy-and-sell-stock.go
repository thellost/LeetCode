func maxProfit(prices []int) int {
    left := 0;
    right := left + 1;
    length := len(prices);
    max := 0;

    for (left < length - 1) {
        right = left + 1;
        for ( right < length && prices[right] > prices[left]) {
            profit := prices[right] - prices[left]
            if (profit > 0 && profit > max) {
                max = profit
                continue;
                
            } 
        
            right++
        }
        left = right
    }
    return max;
}