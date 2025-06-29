public class TestClass {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext(new CreditCardPayment());
        payment.makePayment();

        payment.setPayment(new PayPalPayment());
        payment.makePayment();
    }
}
