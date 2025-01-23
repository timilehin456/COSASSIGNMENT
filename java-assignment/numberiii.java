
import java.util.Arrays;

public class BasicStatistics {

    public static void main(String[] args) {
        int[] data = {12, 15, 10, 10, 20, 25, 30, 5, 18, 22, 14};

        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double mean = (double) sum / data.length;

        Arrays.sort(data);
        double median;
        if (data.length % 2 == 1) {
            median = data[data.length / 2];  							
        } else {
            // Average of two middle elements if even
            median = (data[data.length / 2 - 1] + data[data.length / 2]) / 2.0;
        }

        // Calculate standard deviation
        double sumOfSquares = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfSquares += Math.pow(data[i] - mean, 2);
        }
        double stdDev = Math.sqrt(sumOfSquares / data.length);

        // Print the results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + stdDev);
    }
}