class Solution {
    public String convert(String s, int numRows) {
        String result = "";
        String rowString[] = new String[numRows];
        int idx = 0;
        int dir = 1; 

        if (numRows == 1){
            return s;
        }
        for (int i = 0; i < numRows; i++) {
                rowString[i]  = ""; // initialize with empty string
        }
         for (int i = 0; i < s.length(); i++){
            rowString[idx] += (s.charAt(i));
            idx += dir;
            if (idx == numRows-1 || idx == 0) {
                dir *= -1; // reverse direction
            }
        }   

        return String.join("", rowString);
    }
}