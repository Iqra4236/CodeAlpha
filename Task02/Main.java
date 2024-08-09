import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TradingPlatform platform = new TradingPlatform();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Trading Platform Menu:");
            System.out.println("1. Add Stock to Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Display Portfolio");
            System.out.println("5. Update Stock Price");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter stock symbol: ");
                    String symbol = scanner.nextLine();
                    System.out.print("Enter stock name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter stock price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    platform.addStockToMarket(new Stock(symbol, name, price));
                    System.out.println("\n\n");
                    break;
                  
                case 2:
                    System.out.print("Enter stock symbol to buy: ");
                    symbol = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int buyQuantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    platform.buyStock(symbol, buyQuantity);
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.print("Enter stock symbol to sell: ");
                    symbol = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int sellQuantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    platform.sellStock(symbol, sellQuantity);
                    System.out.println("\n\n");
                    break;
                case 4:
                    platform.displayPortfolio();
                    System.out.println("\n\n");
                    break;
                case 5:
                    System.out.print("Enter stock symbol to update price: ");
                    symbol = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    platform.updateStockPrice(symbol, newPrice);
                    System.out.println("\n\n");
                    break;
                case 6:
                    exit = true;
                    System.out.println("\n\n");
                    break;
                default:
                    System.out.println("Invalid option. Please try again....");
                    System.out.println("\n");
            }
        }

        scanner.close();
        System.out.println("Exiting Trading Platform......");
    }
}