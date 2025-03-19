package Adapter.V1Loose;

public class PhonePeLoan {
    public boolean LoanCheck(BankApi yb){
        if(yb.checkBalance()>100){
            return true;
        }

        return false;
    }
}
