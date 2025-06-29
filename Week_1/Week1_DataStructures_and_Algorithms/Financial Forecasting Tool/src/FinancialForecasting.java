import java.util.Scanner;

public class FinancialForecasting {
    public static double predictFutureValue(double present_value, double rate, double years) {
        if(years == 0) {
            return present_value;
        } else {
            return predictFutureValue(present_value * (1 + rate), rate, years - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your present value : ");
        double present_value = sc.nextDouble();

        System.out.println("Enter your previous value : ");
        double rate = sc.nextDouble();

        System.out.println("Enter your time period : ");
        double years = sc.nextDouble();

        double future_value = predictFutureValue(present_value, rate, years);
        System.out.format("Predicted Future Value : %.2f\n", future_value);

        sc.close();
    }
}
