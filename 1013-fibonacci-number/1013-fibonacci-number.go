func fib(n int) int {
    temp, fn_1, fn_2 :=0, 1, 1
    if n == 0 {
        return temp
    }
    
    for i:= 0; i < n-2 ; i++ {
        temp = fn_2
        fn_2 = fn_1 + fn_2
        fn_1 = temp
        
    }

    return fn_2
}