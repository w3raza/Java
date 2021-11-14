public class Account {
    private String name;
    private String lastname;
    private String accountNumber = "Not assigned to any bank";
    private double balance = 0.0;
    private String currency = "PLN";

    static public Integer NUMBER_OF_CREATED_ACCOUNTS = 0;
    private int i = 0;

    Account(String name, String lastname, String currency) {
        this.name = name;
        this.lastname = lastname;
        this.currency = currency;
        NUMBER_OF_CREATED_ACCOUNTS += 1;
    }

    Account(String name, String lastname, double balance, String currency) {
        this.name = name;
        this.lastname = lastname;
        this.balance = balance;
        this.currency = currency;
        NUMBER_OF_CREATED_ACCOUNTS += 1;
    }

    public String getOwner() {
        return this.name + " " + this.lastname;
    }

    public double getAccountBalance() {
        return this.balance;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public String getNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAccountNumber(int[] init, Integer firstNumber) {
        this.accountNumber = Integer.toString(firstNumber) + Integer.toString(init[i]);
        i++;
    }

    public String toString() {
        return "Account{firstName='" + name + "', lastName='" + lastname + "', number='" + accountNumber + "', balance="
                + balance + "}";
    }

    public boolean equals(Account obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;
        Account account = (Account) obj;

        if (this.name.equals(account.name) && this.lastname.equals(account.lastname) && this.balance == account.balance
                && this.accountNumber.equals(account.accountNumber) && this.currency.equals(account.currency))
            return true;
        else
            return false;
    }
}