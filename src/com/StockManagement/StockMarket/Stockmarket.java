package com.StockManagement.StockMarket;
import com.StockManagement.implement.Stock;

import java.util.Arrays;

public class Stockmarket {
    private Stock[] stocks;
    private int stockCount;

    public Stockmarket(int capacity) {
        stocks = new Stock[capacity];
        stockCount = 0;
    }

    // Create (Add) a Stock
    public void addStock(Stock stock) {
        if (stockCount < stocks.length) {
            stocks[stockCount++] = stock;
        } else {
            System.out.println("Stock market is full. Cannot add more stocks.");
        }
    }

    // Read (Get) a Stock
    public Stock getStock(String symbol) {
        for (int i = 0; i < stockCount; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                return stocks[i];
            }
        }
        return null;
    }

    // Update a Stock
    public void updateStock(String symbol, Stock updatedStock) {
        for (int i = 0; i < stockCount; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                stocks[i] = updatedStock;
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    // Delete a Stock
    public void deleteStock(String symbol) {
        for (int i = 0; i < stockCount; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                // Shift remaining stocks to the left
                for (int j = i; j < stockCount - 1; j++) {
                    stocks[j] = stocks[j + 1];
                }
                stocks[--stockCount] = null; // Clear last element
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    // List All Stocks
    public void listStocks() {
        for (int i = 0; i < stockCount; i++) {
            System.out.println(stocks[i]);
        }
    }
}
