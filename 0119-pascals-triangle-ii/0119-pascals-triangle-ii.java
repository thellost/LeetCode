class Solution {

    List<Integer> memo = new ArrayList<Integer>(); 
    public List<Integer> getRow(int rowIndex) {
        
        memo.add(1);
        memo.add(rowIndex);
        List<Integer> result = new ArrayList<Integer>();
        int isBoolean;
        if(rowIndex%2 == 0 ){
            isBoolean = 1;
        } else{
            isBoolean = 0;
        }
        for (int i = 0; i < (rowIndex +1)/2  ; i++){
            result.add(calculateBinomial(rowIndex, i));
        }
        
        for (int i = ((rowIndex +1)/2)+isBoolean; i > 0  ; i--){
            result.add(calculateBinomial(rowIndex, i-1));
        }


        return result;
    }

    int calculateBinomial(int index, int k){
        if(k == 0){
            return 1;
        }
        if (k==1){
            return index;
        }
        if(k < memo.size()){
            return memo.get(k);
        }
            //k start as 2
        long temp_res =(long) calculateBinomial(index, k-1) * (index - k + 1) ;
        temp_res = temp_res / (long)k;
        memo.add((int)temp_res);
        return (int)temp_res; 

    }
}