class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hasEvenNumberOfDigits(nums[i])) {
                evenDigitNumbers++;
            }
        }
        return evenDigitNumbers;
    }
    boolean hasEvenNumberOfDigits(int num) {
        int numberOfDigits = 0;
        
        if (num == 0) return false; 
        
        if (num < 0) num = num * -1;

        while (num > 0) {
            numberOfDigits++;
            num /= 10; 
        }

        return numberOfDigits % 2 == 0;
    }
}