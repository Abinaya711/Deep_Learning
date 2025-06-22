public class FinancialForecast {
    public static double calculateFutureValue(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;  
        }
        return calculateFutureValue(initialValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialValue = 10000;  
        double annualGrowthRate = 0.10;  
        int years = 5;

        double result = calculateFutureValue(initialValue, annualGrowthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f%n", years, result);
    }
}
