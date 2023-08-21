package part8.task34;

public class Main {
    public static void main(String[] args) {
        BankCard card1 = new BankCard(123456789, "Petrov Petr", "12/25", 150);
        card1.blockCard();
        card1.unlockCard();

        DebitCard card2 = new DebitCard(234567890, "Petrov Petr", "05/24", 456, 1000,400,true);
        card2.withdraw(200);
        card2.deposit(500);
        DebitCard card3 = new DebitCard(345678901, "Petrov Petr", "06/25", 775, 2000, 500, false);
        card2.transfer(300, card3);
        card3.transfer(200, card2);

        CreditCard card4 = new CreditCard(456789012, "Petrov Petr", "09/24", 101, 500, 100, true, 2000, 12.5 );
        card4.applyForCredit(1000);
        card4.payDebt(500);
        card4.chargeInterest();
    }
}
