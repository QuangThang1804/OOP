package strategypattern.pay;

public class Order {
    private static Order instance;
    private int totalCost = 0;
    private boolean isClosed = false;

    private Order() {
        this.totalCost = 0;
        this.isClosed = false;
    }

    public static Order getInstance() {
        if (instance == null) {
            System.out.println("Create unique instance of Order");
            return instance = new Order();
        }
        System.out.println("Returning instance of Order");
        return instance;
    }
    public void processOrderUsingPaypal(PayByPaypal paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
