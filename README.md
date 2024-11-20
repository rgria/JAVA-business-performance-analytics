# Business Performance Analytics Dashboard

This Java project predicts and analyzes business performance based on sales data. It provides a dashboard for visualizing sales trends, calculating total revenue and profits, and making sales predictions using linear regression.

## Features
- **Data Import**: Load sales data from CSV files.
- **Data Analysis**: Calculate total revenue, average sales per customer, and perform sales trend analysis.
- **Sales Prediction**: Predict future sales using a basic linear regression model.
- **Visualization**: Display sales trends using charts.
- **Report Export**: Export data and analysis results to CSV.

## Technologies
- Java (Core)
- Apache Commons Math (for linear regression)
- JFreeChart (for data visualization)

## How to Use
1. **Clone the repository**:

2. **Setup the Project**:
- Make sure to add `jfreechart` and `commons-math3` libraries in your project (via Maven or Gradle).

3. **Run the Application**:
- Import the `DataAnalytics`, `SalesData`, `SalesPrediction`, `SalesChart`, and `ReportExporter` classes into your Java IDE.
- Run the main method (you can implement your own entry point to trigger the analysis).

4. **Data Input**:
- Prepare a CSV file with the following columns: `Date`, `Amount`, `CustomerId`.
- Example:
  ```
  Date,Amount,CustomerId
  2023-01-01,250.00,C001
  2023-01-02,180.00,C002
  ```

5. **View Sales Trends**: The application will generate line charts to visualize sales trends over time.

6. **Export Data**: You can export the results to a CSV file for further use.

## Example Usage

- **Analyzing Total Revenue**:
```java
double totalRevenue = dataAnalytics.calculateTotalRevenue();
System.out.println("Total Revenue: " + totalRevenue);

double predictedSales = salesPrediction.predictSales(salesData);
System.out.println("Predicted Sales: " + predictedSales);
