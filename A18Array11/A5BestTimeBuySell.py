prices = [7, 1, 5, 3, 6, 4]

def bestTimeToBuySell(prices):
    max_price = float('inf')
    max_profit = 0
    
    for price in prices:
        print(price)
        if max_price < price:
            profit = price - max_price
            max_profit = max(max_profit,profit)
        else:
            max_price = price
    print("maxProfit",max_profit)

bestTimeToBuySell(prices);