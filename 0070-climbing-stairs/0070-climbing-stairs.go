func climbStairs(n int) int {
    temp, fn_1, fn_2 :=0, 1, 1

    
    for i:= 2; i <= n ; i++ {
        temp = fn_2
        fn_2 = fn_1 + fn_2
        fn_1 = temp
        
    }

    return fn_2
}