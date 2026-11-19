class Solution {
    /*public int findTheWinner(int n, int k) {
        int winner = 0;

        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1;
    }*/

    public int findTheWinner(int n, int k) {
        return findWinner(n, k) + 1;
    }

    private int findWinner(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (findWinner(n - 1, k) + k) % n;
    }

    /*public int findTheWinner(int n, int k) {
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
        
    }*/
}