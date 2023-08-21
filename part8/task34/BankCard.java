package part8.task34;

public class BankCard implements BlockCard{
    private int cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private int securityCode;


    public BankCard(int cardNumber, String cardHolderName, String expirationDate, int securityCode) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void blockCard() {
        System.out.println("Карта заблокирована!");
    }
    public void unlockCard() {
        System.out.println("Карта Разблокирована!");
    }
}
