interface Payment {
    void pay();
}
class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
public class PaymentExample{
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment(); 
        p.pay();
        p = new UPIPayment();
        p.pay();
    }
}
