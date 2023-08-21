package part8.task34;

public class CreditCard extends DebitCard {
    private double creditLimit;
    private double interestRate;
    private double debt;

    public CreditCard(int cardNumber, String cardHolderName, String expirationDate, int securityCode, double balance, double withdrawalLimit, boolean canTransfer, double creditLimit, double interestRate){
        super(cardNumber, cardHolderName, expirationDate, securityCode, balance, withdrawalLimit, canTransfer);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.debt = 0;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double getDebt(){
        return debt;
    }
    public void applyForCredit(double amount){
        if (amount <= creditLimit){
            balance += amount;
            System.out.println("Кредит на сумму " + amount + " успешно оформлен!");
        } else {
            System.out.println("Превышен лимит по кредиту!");
        }
    }
    public void payDebt(double amount){
        if (amount <= balance){
            balance -= amount;
            debt -= amount;
            System.out.println("Сумма " + amount + " успешно погашена!");
        }else {
            System.out.println("Недостаточно средств на счете!");
        }
    }
    public void chargeInterest(){
        double interestAmount = debt*interestRate / 100;
        System.out.println("Начислены проценты в размере " + interestAmount);
    }
}
