package Adapter.V1Loose;

public class ICICIBankApi {

    ICICIBankApi(){

    }

    int transferAmount = 0;
    public int checkBalance(){
        return 100;
    }

    public void TransferMoney(){
        System.out.println("Money is transferred via Yes Bank!");
    }

    public void setTransferAmount(int amount){
        transferAmount = amount;
    }
}
