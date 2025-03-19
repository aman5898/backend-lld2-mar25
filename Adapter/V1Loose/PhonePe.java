package Adapter.V1Loose;

public class PhonePe {
//    YesBankAPI yb = new YesBankAPI();
    BankApi bi;
    PhonePeLoan pl = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    PhonePe(BankApi bi){
        this.bi = bi;
    }

    boolean checkLoanEligibility(){
        return pl.LoanCheck(bi);
    }

    boolean FastTagRecharge(int amount){
        if(ft.recharge(bi,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }else{
            return false;
        }
    }

}
