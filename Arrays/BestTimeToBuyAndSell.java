package Interview.Arrays;

public class BestTimeToBuyAndSell {

	int maxProfit(int prices[]) {
		int profit = 0;              // Intially profit is zero
		int buy = prices[0];         // Intially buy price is index 0

		for (int i = 1; i < prices.length; i++) {  //Here we are starting from index1 because sell will be on next day

			if (prices[i] < buy) {       //price should be less than buy price or return profit 0
				buy = prices[i];
				System.out.println("buy price is " + buy);
			} else if (prices[i] - buy > profit) {   
				profit = prices[i] - buy;
				System.out.println("Sell Price is " + prices);

			}
		}
		return profit;

	}

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };

		BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
		int Profit = bestTimeToBuyAndSell.maxProfit(prices);
		System.out.println("Maximum Profit is " + Profit);
	}

}
