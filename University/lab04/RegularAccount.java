public class RegularAccount extends BasicAccount {

    private boolean isPenatly = false;

    RegularAccount(String name, double balance, String pin) {
        super(name, balance, pin);
    }

    public String toString() {
        return "type: regular account, owner: " + this.name + ", balance: " + this.balance;
    }

    public void withdraw(double money) {
        super.withdraw(money);
        isPenatly();
    }

    public void monthlyUpdate() {
        super.monthlyUpdate();
        if (isPenatly)
            this.balance -= 10;
    }

    public void isPenatly() {
        if (this.balance < 500)
            isPenatly = true;
    }
}