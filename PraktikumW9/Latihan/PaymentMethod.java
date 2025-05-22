package Latihan;
public class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("PROSES PEMBAYARAN " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("PROSES PEMBAYARAN " + amount + " in " + currency);
    }
}
