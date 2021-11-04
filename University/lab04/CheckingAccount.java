public class CheckingAccount extends BasicAccount {

    private boolean isPenatly = false;
    private int numberTransaction = 0;

    CheckingAccount(String name, double balance, String pin) {
        super(name, balance, pin);
    }

    public String toString() {
        return "type: checking account, owner: " + this.name + ", balance: " + this.balance;
    }

    public void deposit(double money) {
        super.deposit(money);
        numberTransaction++;
    }

    public void withdraw(double money) {
        super.withdraw(money);
        numberTransaction++;
        isPenatly();
    }

    public void monthlyUpdate() {
        double temp = this.balance * 0.02;
        double feeTransaction = numberTransaction * 0.5;

        super.monthlyUpdate();

        if (isPenatly)
            this.balance -= 10;

        this.balance += temp - feeTransaction;

    }

    public void isPenatly() {
        if (this.balance < 100)
            isPenatly = true;
    }
}