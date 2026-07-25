class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            int current = queries[i];
            int sum = 0;
            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(sum + nums[j] <= current) {
                    sum += nums[j];
                    count++;
                } else {
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}