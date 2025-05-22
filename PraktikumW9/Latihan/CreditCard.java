package Latihan;
public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("KreditCard: Bayar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("KreditCard: Bayar " + amount + " in " + currency);
    }
}