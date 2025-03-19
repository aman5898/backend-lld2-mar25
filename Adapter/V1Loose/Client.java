package Adapter.V1Loose;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String bankName = scn.nextLine();
        BankApi bi = BankAPIFactory.getBankAPI(bankName);
        PhonePe ph = new PhonePe(bi);
        ph.checkLoanEligibility();
    }
}
