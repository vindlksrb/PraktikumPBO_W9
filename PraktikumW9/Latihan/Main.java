package Latihan;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[3];
        payments[0] = new CreditCard();
        payments[1] = new EWallet();
        payments[2] = new BankTransfer();

        for (PaymentMethod p : payments) {
            p.processPayment(100.0); // default
            p.processPayment(150.0, "IDR"); // overload
            System.out.println();
        }
    }
}

