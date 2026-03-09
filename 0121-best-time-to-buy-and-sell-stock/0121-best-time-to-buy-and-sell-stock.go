func maxProfit(prices []int) int {
    left := 0;
    right := left + 1;
    max := 0;

    for (left < len(prices) - 1) {
        right = left + 1;
        for ( right < len(prices) && prices[right] > prices[left]) {
            profit := prices[right] - prices[left]
            if (profit > 0 && profit > max) {
                max = profit
            } 
            right++
        }
        left = right
    }
    return max;
}