package strategypattern.pay;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
