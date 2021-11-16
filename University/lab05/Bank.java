import java.util.HashMap;
import java.util.Random;

public class Bank {
    static public double EURO = 4.6;
    static public double USD = 3.95;
    static public double PLN = 1.0;
    static private Integer NUMBER_OF_CREATED_ACCOUNTS = 0;

    private HashMap<Integer, Account> bankAccounts = new HashMap<Integer, Account>();
    private HashMap<String, Double> currencies = new HashMap<String, Double>();

    Bank() {
        NUMBER_OF_CREATED_ACCOUNTS++;
        currencies.put("PLN", PLN);
        currencies.put("USD", USD);
        currencies.put("EURO", EURO);
    }

    public void addAccount(Account account) {
        account.setAccountNumber(getRandomInteger(), NUMBER_OF_CREATED_ACCOUNTS);
        bankAccounts.put(Integer.valueOf(account.getNumber()), account);
    }

    public int[] getRandomInteger() {
        final int[] ints = new Random().ints(100, 1000).distinct().limit(1).toArray();
        return ints;
    }

    public void printAccounts() {
        System.out.println(bankAccounts);
    }

    public Account findAccount(String classInstance) {
        if (!bankAccounts.containsKey(Integer.valueOf(classInstance))) {
            System.out.println("Could not find given account");
            return null;
        } else
            return bankAccounts.get(Integer.valueOf(classInstance));
    }

    public void transferToDifferentCurrency(String classInstance, String currency) {
        if (findAccount(classInstance) != null) {
            Account account = findAccount(classInstance);

            account.setBalance(
                    account.getAccountBalance() * currencies.get(account.getCurrency()) / currencies.get(currency));
        }
    }

    public void transfer(String classInstance1, String classInstance2, final double value) {
        if (classInstance1.charAt(0) == classInstance2.charAt(0)) {
            if (findAccount(classInstance1) != null && findAccount(classInstance2) != null) {

                Account account1 = findAccount(classInstance1);
                Account account2 = findAccount(classInstance2);

                account1.setBalance(account1.getAccountBalance() - value);

                account2.setBalance(account2.getAccountBalance()
                        + ((currencies.get(account1.getCurrency()) / (currencies.get(account2.getCurrency())))
                                * value));
            }
        } else
            System.out.println("will not work, wrong bank");
    }

    public void transfer(String classInstance1, String classInstance2, double value, Bank bank) {
        if (bankAccounts.containsKey(Integer.valueOf(classInstance1))
                && bank.bankAccounts.containsKey(Integer.valueOf(classInstance2))) {

            Account account1 = findAccount(classInstance1);
            Account account2 = bank.findAccount(classInstance2);

            account1.setBalance(account1.getAccountBalance() - value);

            switch (account2.getCurrency()) {
            case "EURO":
                account2.setBalance(
                        account2.getAccountBalance() + (currencies.get(account1.getCurrency()) / EURO * value));
                break;
            case "USD":
                account2.setBalance(
                        account2.getAccountBalance() + (currencies.get(account1.getCurrency()) / USD * value));
                break;
            case "PLN":
                account2.setBalance(
                        account2.getAccountBalance() + (currencies.get(account1.getCurrency()) / PLN * value));
                break;
            }
        } else
            System.out.println("Cannot transfer, wrong bank");
    }
}