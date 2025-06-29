public class TestClass {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter(new PayPal());
        paypal.processPayment(100000.0);

        PaymentProcessor gpay = new GPayAdapter(new GPay());
        gpay.processPayment(1000.0);
    }
}
