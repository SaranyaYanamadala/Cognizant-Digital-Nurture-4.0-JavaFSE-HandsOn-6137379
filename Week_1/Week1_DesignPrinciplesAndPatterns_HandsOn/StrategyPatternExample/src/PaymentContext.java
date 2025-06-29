public class PaymentContext {
    private PaymentStrategy payment;

    public PaymentContext(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void setPayment(PaymentStrategy strategy) {
        this.payment = strategy;
    }

    public void makePayment() {
        payment.pay();
    }
}
