import java.io.FileWriter;
import java.io.IOException;

public class ReportExporter {
    public void exportToCSV(List<SalesData> salesData, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        
        // Write header
        writer.write("Date,Amount,CustomerId\n");
        
        // Write data
        for (SalesData sale : salesData) {
            writer.write(sale.getDate() + "," + sale.getAmount() + "," + sale.getCustomerId() + "\n");
        }
        
        writer.close();
    }
}
