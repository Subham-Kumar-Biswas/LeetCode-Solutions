class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i += 2) {
            char previousLetter = arr[i - 1];
            int shiftAmount = arr[i] - '0';

            arr[i] = (char) (previousLetter + shiftAmount);
        }

        return new String(arr);
    }
}