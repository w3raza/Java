abstract public class BasicAccount {
    protected String name;
    protected double balance;
    protected String pin;

    BasicAccount(String name, double balance, String pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;

    }

    public void withdraw(double money) {
        if (money > this.balance || money < 0)
            System.out.println("Error!");
        else
            this.balance -= money;
    }

    public void deposit(double money) {
        if (money < 0)
            System.out.println("Cannot deposit negative amount!");
        this.balance += money;
    }

    public double getBalance() {
        return this.balance;
    }

    public void monthlyUpdate() {
        if (this.balance < 100)
            this.balance = this.balance * 0.9;
        else
            this.balance -= 10;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;

        BasicAccount account = (BasicAccount) obj;

        if (this.name.equals(account.name) && this.balance == account.balance && this.pin.equals(account.pin))
            return true;
        else
            return false;
    }
}