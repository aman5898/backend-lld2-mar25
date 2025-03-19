package Adapter.V1Loose;

public class FastTagRecharge {
    int recharge(BankApi yb, int amount){
        if(yb.checkBalance()>=amount){
            System.out.println("Recharge Successfully");
            return 1;
        }

        return 0;
    }
}
