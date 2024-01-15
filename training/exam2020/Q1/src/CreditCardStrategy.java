public class CreditCardStrategy implements Strategy {

  public CreditCardStrategy(String name, String cardNumber, String expireDate) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.expireDate = expireDate;
  }

  private String name;
  private String cardNumber;
  private String expireDate;
  @Override
  public void encryption(int amount) {
    String encryptedCardNumber =  cardNumber.replace(".", "*");
    System.out.println(amount + " euros paid using CreditCard / name: " + name+ ", card number: "+encryptedCardNumber+ " (expiration date: "+expireDate+")");
  }
}
