package Latihan;
public class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("EWallet: Paying " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("EWallet: Paying " + amount + " in " + currency);
    }
}