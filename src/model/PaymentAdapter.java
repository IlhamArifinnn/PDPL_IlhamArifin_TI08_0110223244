package model;

public class PaymentAdapter implements PaymentGateway {
    private ThirdPartyPayment thirdPartyPayment;

    public PaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void processPayment(double amount) {
        thirdPartyPayment.makePayment(amount);
    }
}
