class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while(start < end) {
            int width = end - start;
            int h = Math.min(height[start], height[end]);
            int currentArea = width * h;

            if(currentArea > maxArea) {
                maxArea = currentArea;
            }

            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;

    }
}