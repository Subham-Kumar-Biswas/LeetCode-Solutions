class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> countElements = new HashMap<>();

        for (String s : arr) {
            countElements.put(s, countElements.getOrDefault(s, 0) + 1);
        }

        for (String s : arr) {
            if (countElements.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        
        return "";
    }
}