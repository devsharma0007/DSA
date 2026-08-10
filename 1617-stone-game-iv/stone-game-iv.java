class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];

        // dp[i] = true means current player can win
        for (int i = 1; i <= n; i++) {

            // Try every perfect square <= i
            for (int j = 1; j * j <= i; j++) {

                // If opponent reaches a losing state,
                // current player can win
                if (!dp[i - j * j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}