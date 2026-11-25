class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> mountains = new ArrayList<>(height.length);

        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > threshold) {
                mountains.add(i+1);
            }
        }

        return mountains;
    }
}