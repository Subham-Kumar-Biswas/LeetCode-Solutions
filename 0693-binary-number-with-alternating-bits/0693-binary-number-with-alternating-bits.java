class Solution {
    public boolean hasAlternatingBits(int n) {
        int previous = n >>> 1;

        while(previous > 0) {
            if((previous & 1) == (n & 1)) {
                return false;
            }
            previous >>>= 1;
            n >>>= 1;
        }
        return true;
        
    }
}