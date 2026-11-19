class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        int currentIndex = 0;

        while (friends.size() > 1) {
            currentIndex = (currentIndex + k - 1) % friends.size();
            friends.remove(currentIndex);
        }

        return friends.get(0);
    }
}