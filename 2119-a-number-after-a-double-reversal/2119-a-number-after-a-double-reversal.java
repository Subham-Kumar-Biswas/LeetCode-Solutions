class Solution {
    public boolean isSameAfterReversals(int num) {
        
        if (num == 0) {
            return true;
        }

        if (num % 10 == 0) {
            return false;
        }

        while (num >= 10) {
            num /= 10;
        }

        return true;

        // int reverse1 = 0;
        // int temp = num;
        // while (temp != 0) {
        //     int digit = temp % 10;
        //     reverse1 = reverse1 * 10 + digit;
        //     temp /= 10;
        // }

        // int reverse2 = 0;
        // temp = reverse1;
        // while (temp != 0) {
        //     int digit = temp % 10;
        //     reverse2 = reverse2 * 10 + digit;
        //     temp /= 10;
        // }

        // return reverse2 == num;
    }
}