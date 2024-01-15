public class PaypalStrategy implements Strategy{
  private String email;
  private String password;

  public PaypalStrategy(String email, String password) {
    this.email = email;
    this.password = password;
  }

  @Override
  public void encryption(int amount) {
    String encryptedPassword =  password.replace(".", "*");
    System.out.println(amount + " euros paid using Paypal / email: " + email+ ", password: "+encryptedPassword);
  }
}
