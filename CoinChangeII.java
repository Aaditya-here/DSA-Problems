package Interview;

public class CoinChangeII {

	public int change(int amount, int[] coins) {

		int dp[] = new int[amount + 1];

		dp[0] = 1;

		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				dp[i] = dp[i] + dp[i - coin];
			}
		}

		return dp[amount];

	}

	public static void main(String[] args) {
		int coins[] = { 1, 2, 5 };
		int amount = 5;

		CoinChangeII coinChangeII = new CoinChangeII();
		int result = coinChangeII.change(amount, coins);

		System.out.println(result);
	}

}
