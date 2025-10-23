func countAndSay(n int) string {
    if (n == 1){
        return "1"
    }
    return RLE(countAndSay(n-1))
}

func RLE (str string) string {
    var result strings.Builder
    var num = int(str[0])-48
    var numCount int
    for i:=0; i<len(str); i++{
            var current_num = int(str[i])-48
            if (current_num == num){
                numCount++
            } else{
                result.WriteString(fmt.Sprintf("%v%v", numCount, num))
                numCount = 1
                num = current_num
            }

            //print each character in new line
        }
    result.WriteString(fmt.Sprintf("%v%v", numCount, num))
    return result.String()
}
