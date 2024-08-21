public class loop9 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 9; i++) {
            double term = (double) i / (i * 10); // Calculate each term in the series
            sum += term; // Add the term to the sum
        }

        System.out.println("The sum of the series is: " + sum);
    }
}