package part8.task34;

public class DebitCard extends BankCard{
    public double balance;
    private double withdrawalLimit;
    private boolean canTransfer;

    public DebitCard(int cardNumber, String cardHolderName, String expirationDate, int securityCode, double balance, double withdrawalLimit, boolean canTransfer){
        super(cardNumber, cardHolderName, expirationDate, securityCode);
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
        this.canTransfer = canTransfer;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public boolean isCanTransfer() {
        return canTransfer;
    }
    public void withdraw(double amount){
        if (amount <= balance && amount <= withdrawalLimit){
            balance -= amount;
            System.out.println("Сумма " + amount + " успешно снята со счета!");
        } else {
            System.out.println("Недостаточно средств или превышен лимит снятия!");
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Сумма " + amount + " зачислена на счет!");
    }
    public void transfer(double amount, DebitCard recipient){
        if (canTransfer) {
            if (amount <= balance) {
                balance -= amount;
                recipient.deposit(amount);
                System.out.println("Сумма " + amount + " успешно переведена на другой счет!");

            } else {
                System.out.println("Недостаточно средств на счете!");
            }
        } else {
            System.out.println("Переводы запрещены для этой карты!");

        }
    }
}
