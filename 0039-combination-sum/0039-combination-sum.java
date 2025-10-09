class Solution {
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        AllPossibleCombination(candidates,target, new ArrayList<Integer>(), 0);
        return result;
    }
    

    private void AllPossibleCombination(int[] candidates, int target, ArrayList<Integer> combination, int sum){
        
        if(sum < target){
            for(int i = 0 ; i < candidates.length ;i++){
                int newSum = sum + candidates[i];
                if(newSum <= target){
                    ArrayList<Integer> newCombination = (ArrayList<Integer>) combination.clone();
                    newCombination.add(candidates[i]);
                    AllPossibleCombination(Arrays.copyOfRange(candidates, i, candidates.length), target, newCombination, newSum);
                }
            }
        }
        if(sum > target){
            return;
        }
        if(sum == target){
            result.add(combination);
            return;
        }


    }
}