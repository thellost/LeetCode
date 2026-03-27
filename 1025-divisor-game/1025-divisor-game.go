func divisorGame(n int) bool {
 if(n == 1){
    return false;
 }  
 if (n % 2 == 0 ){
    return true;
 } else {
    return false;
 }
}