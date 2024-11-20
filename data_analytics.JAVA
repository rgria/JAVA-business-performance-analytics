import java.util.*;
import java.io.*;

public class DataAnalytics {
    private List<SalesData> salesList;

    // Constructor
    public DataAnalytics(List<SalesData> salesList) {
        this.salesList = salesList;
    }

    // Calculate total revenue
    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (SalesData sale : salesList) {
            totalRevenue += sale.getAmount();
        }
        return totalRevenue;
    }

    // Calculate average sales per customer
    public double calculateAverageSales() {
        double totalSales = 0;
        for (SalesData sale : salesList) {
            totalSales += sale.getAmount();
        }
        return totalSales / salesList.size();
    }

    // Perform trend analysis (e.g., sales over time)
    public Map<String, Double> analyzeSalesTrend() {
        Map<String, Double> salesTrend = new HashMap<>();
        for (SalesData sale : salesList) {
            String month = sale.getDate().substring(0, 7); // Extract month (YYYY-MM)
            salesTrend.put(month, salesTrend.getOrDefault(month, 0.0) + sale.getAmount());
        }
        return salesTrend;
    }
}
