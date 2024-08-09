
public class Stock {
    private String symbol;
    private String name;
    private double price;

    // Constructor to initialize a stock object
    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    // Getter for symbol
    public String getSymbol() {
        return symbol;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}