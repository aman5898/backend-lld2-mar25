package Adapter.V1Loose;

public class YesBankApiAdapter implements BankApi {

    YesBankAPI yb = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yb.getBalance();
    }

    @Override
    public void transferMoney(int money) {
        yb.moneyTransfer();
    }
}
