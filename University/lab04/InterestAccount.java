public class InterestAccount extends BasicAccount {

    InterestAccount(String name, double balance, String pin) {
        super(name, balance, pin);
    }

    public String toString() {
        return "type: interest account, owner: " + this.name + ", balance: " + this.balance;
    }

    public void monthlyUpdate() {
        double temp = this.balance * 0.02;
        super.monthlyUpdate();
        this.balance += temp;
    }
}