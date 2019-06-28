package model.services;

import java.util.Collection;

public class PayPalService implements OnlinePayment {
    private static final Double PAYMENT_FEE = 0.02;
    private static final Double INTEREST = 0.01;


    @Override
    public Double paymentFee(Double amount) {
        return amount += amount*PAYMENT_FEE;
    }

    @Override
    public Double interest(Double amount,Integer months) {
        return amount += (amount*INTEREST)*months;
    }
}
