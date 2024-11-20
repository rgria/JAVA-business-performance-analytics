public class SalesData {
    private String date;  // Sales date in YYYY-MM-DD format
    private double amount;  // Total sale amount
    private String customerId;

    // Constructor
    public SalesData(String date, double amount, String customerId) {
        this.date = date;
        this.amount = amount;
        this.customerId = customerId;
    }

    // Getters
    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerId() {
        return customerId;
    }
}
