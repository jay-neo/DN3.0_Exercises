package financialforecasting;

public class FinancialForecast {
    // Method to calculate future value recursively
    public double calculateFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue; // Base case: no more periods left
        } else {
            return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1); // Recursive case
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();
        double currentValue = 1000.0;
        double growthRate = 0.05; // 5% growth rate
        int periods = 10; // 10 periods (e.g., years)

        double futureValue = forecast.calculateFutureValue(currentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: " + futureValue);
    }
}
