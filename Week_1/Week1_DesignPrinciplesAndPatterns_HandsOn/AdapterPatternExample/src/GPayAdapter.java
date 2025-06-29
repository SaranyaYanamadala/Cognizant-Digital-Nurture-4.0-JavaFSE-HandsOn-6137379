public class GPayAdapter implements PaymentProcessor {
    private GPay gpay;

    public GPayAdapter(GPay gpay) {
        this.gpay = gpay;
    }

    @Override
    public void processPayment(double payment) {
        gpay.makePayment(payment);
    }
}
