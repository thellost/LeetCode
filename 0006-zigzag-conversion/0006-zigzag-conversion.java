class Solution {
    public String convert(String s, int numRows) {
        
        int idx = 0;
        int dir = 1; 
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        if (numRows == 1){
            return s;
        }
         for (int i = 0; i < s.length(); i++){
             rows[idx].append(s.charAt(i));
            idx += dir;
            if (idx == numRows-1 || idx == 0) {
                dir *= -1; // reverse direction
            }
        }  

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}