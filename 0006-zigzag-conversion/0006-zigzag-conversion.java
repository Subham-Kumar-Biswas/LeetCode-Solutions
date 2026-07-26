class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) return s;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            int step1 = 2 * (numRows - 1 - i);
            int step2 = 2 * i;
            
            int j = i;

            while(j < s.length()) {
                sb.append(s.charAt(j));

                int currentJump = (step1 == 0) ? step2 : step1;
                j += currentJump;

                if(step1 > 0 && step2 > 0 && j < s.length()) {
                    sb.append(s.charAt(j));
                    j += step2;
                }
            }
        }
        return sb.toString();
    }
}