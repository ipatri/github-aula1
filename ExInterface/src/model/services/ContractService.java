package model.services;

import model.entities.Contract;
import model.entities.Installments;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    OnlinePayment onlinePayment;

    public ContractService(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }
    public void processContract(Contract contract,Integer months){
        double basicQuota = contract.getValue()/months;
        for (int i = 1; i <= months ; i++) {
            Date date = addMonth(contract.getDate(),i);
            double updatedQuota = onlinePayment.interest(basicQuota,i);
            double finalQuota = onlinePayment.paymentFee(updatedQuota);
            contract.addInstallments(new Installments(date,finalQuota));
        }

    }
    private Date addMonth(Date date,int n){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,n);
        return cal.getTime();
    }
}
