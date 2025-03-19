package Adapter.V1Loose;

public class BankAPIFactory {
    public static BankApi getBankAPI(String bankAPIName) {
        if(bankAPIName.equals("YesBank")) {
            return new YesBankApiAdapter();
        } else if (bankAPIName.equals("ICICIBank")) {
            return new ICICIBankAdapter();
        } else {
            throw new IllegalArgumentException("Your Bank is not available at the moment");
        }
    }
}
