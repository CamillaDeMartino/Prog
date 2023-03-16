public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
    public PaypalStrategy(String email, String password){
        this.emailId = email;
        this.password = password;
    }


    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}