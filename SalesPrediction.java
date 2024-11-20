import org.apache.commons.math3.stat.regression.SimpleRegression;

public class SalesPrediction {
    public double predictSales(List<SalesData> salesData) {
        SimpleRegression regression = new SimpleRegression(true);

        // Preparing data for regression (Date -> Sales)
        for (int i = 0; i < salesData.size(); i++) {
            regression.addData(i, salesData.get(i).getAmount()); // 'i' is used as the X value (representing time)
        }

        // Predict the sales for the next month (or any future value)
        return regression.predict(salesData.size() + 1); // Predict for the next point
    }
}
