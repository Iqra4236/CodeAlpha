import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<Stock, Integer> stocks = new HashMap<>();

    // Add stock to the portfolio
    public void addStock(Stock stock, int quantity) {
        stocks.put(stock, stocks.getOrDefault(stock, 0) + quantity);
    }

    // Remove stock from the portfolio
    public void removeStock(Stock stock, int quantity) {
        if (stocks.containsKey(stock)) {
            int currentQuantity = stocks.get(stock);
            if (currentQuantity > quantity) {
                stocks.put(stock, currentQuantity - quantity);
            } else {
                stocks.remove(stock);
            }
        }
    }

    // Get the stocks in the portfolio
    public Map<Stock, Integer> getStocks() {
        return stocks;
    }
}