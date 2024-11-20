import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class SalesChart {
    public ChartPanel createSalesTrendChart(Map<String, Double> salesTrend) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (Map.Entry<String, Double> entry : salesTrend.entrySet()) {
            dataset.addValue(entry.getValue(), "Sales", entry.getKey());
        }
        
        JFreeChart chart = ChartFactory.createLineChart(
                "Sales Trend Over Time", // Chart title
                "Month", // X-axis label
                "Sales ($)", // Y-axis label
                dataset
        );
        
        return new ChartPanel(chart);
    }
}
