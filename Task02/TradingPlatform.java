
import java.util.HashMap;
import java.util.Map;

public class TradingPlatform {
    private Map<String, Stock> stockMarket = new HashMap<>();
    private Portfolio userPortfolio = new Portfolio();

    // Add stock to the market
    public void addStockToMarket(Stock stock) {
        stockMarket.put(stock.getSymbol(), stock);
        System.out.println("Stock added to the market: " + stock.getName() + " (" + stock.getSymbol() + ")");
    }

    // Buy stock from the market
    public void buyStock(String symbol, int quantity) {
        Stock stock = stockMarket.get(symbol);
        if (stock != null) {
            userPortfolio.addStock(stock, quantity);
            System.out.println("Bought " + quantity + " of " + stock.getName());
        } else {
            System.out.println("Stock not found: " + symbol);
        }
    }

    // Sell stock from the portfolio
    public void sellStock(String symbol, int quantity) {
        Stock stock = stockMarket.get(symbol);
        if (stock != null) {
            userPortfolio.removeStock(stock, quantity);
            System.out.println("Sold " + quantity + " of " + stock.getName());
        } else {
            System.out.println("Stock not found: " + symbol);
        }
    }

    // Display the portfolio
    public void displayPortfolio() {
        System.out.println("Your Portfolio:");
        for (Map.Entry<Stock, Integer> entry : userPortfolio.getStocks().entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }

    // Update stock price in the market
    public void updateStockPrice(String symbol, double newPrice) {
        Stock stock = stockMarket.get(symbol);
        if (stock != null) {
            stock.setPrice(newPrice);
            System.out.println("Updated price for " + stock.getName() + " (" + stock.getSymbol() + ") to " + newPrice);
        } else {
            System.out.println("Stock not found: " + symbol);
        }
    }
}