class Solution {

    List<Integer> memo = new ArrayList<Integer>(); 
    public List<Integer> getRow(int rowIndex) {
        
        memo.add(1);
        memo.add(rowIndex);
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex +1  ; i++){
            result.add(calculateBinomial(rowIndex, i));
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
        long temp_res = calculateBinomial(index, k-1) * (long) (index - k + 1) ;
        temp_res = temp_res / k;
        memo.add((int)temp_res);
        return (int)temp_res; 

    }
}