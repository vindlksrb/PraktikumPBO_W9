package Latihan;
public class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("BankTransfer: Bayar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("BankTransfer: Bayar " + amount + " in " + currency);
    }
}
