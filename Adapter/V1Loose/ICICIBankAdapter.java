package Adapter.V1Loose;

public class ICICIBankAdapter implements BankApi{

    ICICIBankApi ic = new ICICIBankApi();

    @Override
    public int checkBalance() {
        return ic.checkBalance();
    }

    @Override
    public void transferMoney(int money) {
        ic.setTransferAmount(money);
    }
}
