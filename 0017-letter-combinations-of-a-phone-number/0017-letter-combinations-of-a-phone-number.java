class Solution {

    private String[][] string_letter  = {{"a","b","c"}, {"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
    private int[] string_base;
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  

        if (digits.length() == 0){
            return list;
        }
        if (digits.length() == 1) {
            for (String letter : string_from_digits(digits) ) {
            list.add(letter);
        }
        } else {
            int total_length = 1;
             this.string_base = new int[digits.length()];
            for (int i = 0 ; i < digits.length(); i++){
                int length = string_from_digits(digits.charAt(i)).length;
                total_length *= length;
                 this.string_base[i] = length;

            }
            
            int idx = 0;
            String combination = "";
             for (int z = 0; z < total_length; z++){
                combination = "";
                
                for (int i = 0 ; i < digits.length(); i++){
                    combination += string_from_digits(digits.charAt(i))[get_counter(idx)[i]];
                    
                }
                idx += 1;
                list.add(combination);
            }
            
        }
        return list;
    }
    private String[] string_from_digits(String digits){
        return this.string_letter[Integer.parseInt(digits) - 2];
    }
    private String[] string_from_digits(char digits){
        return this.string_letter[Character.getNumericValue(digits) - 2];
    }

    private int[] get_counter(int count){
        
        int i = 0;
        int[] result = new int[this.string_base.length];
        while (count > 0) {

            int remainder = count % this.string_base[i]; // Get the remainder when divided by 3
            result[i] = remainder; // Prepend the remainder to the string
            count /= this.string_base[i]; // Divide the number by 3 for the next iteration
            i++;
        }
    
    return result;
    }

}