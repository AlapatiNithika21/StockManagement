package com.StockManagement.main;
import com.StockManagement.StockMarket.Stockmarket;
import com.StockManagement.implement.Stock;

public class Main {
    public static void main(String[] args) {
        Stockmarket market = new Stockmarket(5);  // Initialize with capacity for 5 stocks

        // Create stocks
        Stock stock1 = new Stock("AAPL", "Apple Inc.", 150.00, 1000);
        Stock stock2 = new Stock("GOOGL", "Alphabet Inc.", 2800.50, 500);
        Stock stock3 = new Stock("AMZN", "Amazon.com Inc.", 3400.75, 300);

        // Add stocks
        market.addStock(stock1);
        market.addStock(stock2);
        market.addStock(stock3);

        // List all stocks
        System.out.println("Listing all stocks:");
        market.listStocks();

        // Get a stock
        System.out.println("Getting stock with symbol 'AAPL':");
        Stock aapl = market.getStock("AAPL");
        System.out.println(aapl);

        // Update a stock
        System.out.println("Updating stock with symbol 'AAPL':");
        Stock updatedAapl = new Stock("AAPL", "Apple Inc.", 155.00, 1100);
        market.updateStock("AAPL", updatedAapl);
        System.out.println(market.getStock("AAPL"));

        // Delete a stock
        System.out.println("Deleting stock with symbol 'GOOGL':");
        market.deleteStock("GOOGL");
        market.listStocks();

        // Test case for adding a stock beyond capacity
        Stock stock4 = new Stock("MSFT", "Microsoft Corporation", 299.99, 800);
        Stock stock5 = new Stock("TSLA", "Tesla Inc.", 800.00, 200);
        Stock stock6 = new Stock("NFLX", "Netflix Inc.", 500.00, 150);

        market.addStock(stock4);
        market.addStock(stock5);
        market.addStock(stock6);  // This should print an error message

        // List all stocks after adding
        System.out.println("Listing all stocks after adding beyond capacity:");
        market.listStocks();
    }
}
