let prices = [7, 1, 5, 3, 6, 4];

function bestTimeToBuySell(prices) {
  let maxPrice = Number.MAX_VALUE;
  let maxProfit = 0;

  for (let i = 0; i < prices.length; i++) {
    if (maxPrice < prices[i]) {
      let profit = prices[i] - maxPrice;
      maxProfit = Math.max(maxProfit, profit);
    } else {
      maxPrice = prices[i];
    }
  }
  console.log("maxProfit", maxProfit);
}

bestTimeToBuySell(prices);
