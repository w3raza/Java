public class Main {
    public static void main(String[] args) {

        System.out.println("Number of created accounts = " + Account.NUMBER_OF_CREATED_ACCOUNTS);
        Account account1 = new Account("Jan", "Kowalski", "PLN");
        Account account2 = new Account("Jan", "Kownacki", 100., "EURO");
        Account account3 = new Account("Adam", "Nowak", "PLN");
        Account account4 = new Account("Adam", "Kowalski", 3237.22, "USD");
        System.out.println("Number of created accounts = " + Account.NUMBER_OF_CREATED_ACCOUNTS);

        System.out.println();

        System.out.println("Account 1 details:");
        System.out.println("Owner: " + account1.getOwner());
        System.out.println("Balance: " + account1.getAccountBalance());
        account1.setBalance(150.32);
        System.out.println("Balance: " + account1.getAccountBalance());
        System.out.println("Account 2 details:");
        System.out.println(account2);
        System.out.println();
        Account account2Test = new Account("Jan", "Kownacki", 100., "EURO");
        System.out.println("account2 == account2Test: " + (account2 == account2Test));
        System.out.println("account2.equals(account2Test): " + account2.equals(account2Test)); // ture
        System.out.println("account1.equals(account2): " + account1.equals(account2)); // false

        System.out.println();

        System.out.println("Currencies:");
        System.out.println("Euro = " + Bank.EURO); // 4.6
        System.out.println("USD = " + Bank.USD); // 3.95
        System.out.println("PLN = " + Bank.PLN); // 1.0

        System.out.println();

        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        Bank bank2 = new Bank();
        bank2.addAccount(account3);
        bank2.addAccount(account4);
        System.out.println("Accounts in banks:");
        System.out.print("Bank: ");
        bank.printAccounts();
        System.out.print("Bank2: ");
        bank2.printAccounts();

        System.out.println();

        System.out.println("Account by numbers:");
        System.out.println(account1.getNumber() + ": " + bank.findAccount(account1.getNumber()));
        System.out.println(account4.getNumber() + ": " + bank2.findAccount(account4.getNumber()));
        System.out.println("1111: " + bank.findAccount("1111")); // will not find account

        System.out.println();

        System.out.println("Transfer from EURO to USD");
        System.out.println("Balance before transfer: " + account2.getAccountBalance());
        bank.transferToDifferentCurrency(account2.getNumber(), "USD");
        System.out.println("Balance after transfer: " + account2.getAccountBalance());
        bank.transferToDifferentCurrency("1111", "USD"); // will not find account

        System.out.println();

        System.out.println("Transfer between accounts (same bank):");
        System.out.println("Account 1 balance before transfer: " + account1.getAccountBalance());
        System.out.println("Account 2 balance before transfer: " + account2.getAccountBalance());
        bank.transfer(account1.getNumber(), account2.getNumber(), 50);
        System.out.println("Account 1 balance after transfer: " + account1.getAccountBalance());
        System.out.println("Account 2 balance after transfer: " + account2.getAccountBalance());
        bank.transfer(account1.getNumber(), "1111", 50); // will not find account
        bank2.transfer(account1.getNumber(), account3.getNumber(), 50); // will not work, wrong bank
        bank.transfer(account1.getNumber(), account3.getNumber(), 50); // will not work, wrong bank

        System.out.println();

        System.out.println("Transfer between accounts (different bank):");
        System.out.println("Account 2 balance before transfer: " + account2.getAccountBalance());
        System.out.println("Account 4 balance before transfer: " + account4.getAccountBalance());
        bank.transfer(account2.getNumber(), account4.getNumber(), 50, bank2);
        System.out.println("Account 2 balance after transfer: " + account2.getAccountBalance());
        System.out.println("Account 4 balance after transfer: " + account4.getAccountBalance());
        bank.transfer(account1.getNumber(), account3.getNumber(), 50, bank); // will not work, wrong bank
        bank2.transfer(account1.getNumber(), account3.getNumber(), 50, bank2); // will not work, wrong bank
    }
}

// Number of created accounts = 0
// Number of created accounts = 4

// Account 1 details:
// Owner: Jan Kowalski
// Balance: 0.0 PLN
// Balance: 150.32 PLN
// Account 2 details:
// Account{firstName='Jan', lastName='Kownacki', number='Not assigned to any
// bank', balance=100.0}

// account2 == account2Test: false
// account2.equals(account2Test): true
// account1.equals(account2): false

// Currencies:
// Euro = 4.6
// USD = 3.95
// PLN = 1.0

// Accounts in banks:
// Bank: [Account{firstName='Jan', lastName='Kowalski', number='1864',
// balance=150.32}, Account{firstName='Jan', lastName='Kownacki', number='1202',
// balance=100.0}]
// Bank2: [Account{firstName='Adam', lastName='Nowak', number='2296',
// balance=0.0}, Account{firstName='Adam', lastName='Kowalski', number='2888',
// balance=3237.22}]

// Account by numbers:
// 1864: Account{firstName='Jan', lastName='Kowalski', number='1864',
// balance=150.32}
// 2888: Account{firstName='Adam', lastName='Kowalski', number='2888',
// balance=3237.22}
// Could not find given account
// 1111: null

// Transfer from EURO to USD
// Balance before transfer: 100.0 EURO
// Balance after transfer: 116.45569620253163 USD
// Could not find given account

// Transfer between accounts (same bank):
// Account 1 balance before transfer: 150.32 PLN
// Account 2 balance before transfer: 116.45569620253163 USD
// Account 1 balance after transfer: 100.32 PLN
// Account 2 balance after transfer: 129.1139240506329 USD
// Could not find given account
// Cannot transfer, wrong bank
// Cannot transfer, wrong bank

// Transfer between accounts (different bank):
// Account 2 balance before transfer: 129.1139240506329 USD
// Account 4 balance before transfer: 3237.22 USD
// Account 2 balance after transfer: 79.1139240506329 USD
// Account 4 balance after transfer: 3287.22 USD
// Cannot transfer, wrong bank
// Cannot transfer, wrong bank

// Proszę pobrać plik Main.java i dopisać do niego potrzebne funkcjonalności.
// Pliku Main.java nie należy modyfikować.

// Proszę napisać klasy Account, Bank wraz z odpowiednimi polami i metodami.

// Klasa Account powinna zawierać informacje o imieniu, nazwisku, numerze konta,
// aktualnym stanie salda i preferowanej walucie, metody dostępu do danych,
// odpowiednie konstruktory [(imie, nazwisko, waluta), (imie, nazwisko, saldo,
// waluta)], metodę toString oraz metodę equals. (2pkt)
// Ponadto w klasie powinna znajdować się zmienna statyczna mówiąca o ilości
// stworzonych instancji tej klasy. (1pkt)

// Klasa Bank powinna:
// zawierać niemodyfikowalne statyczne pola określające wartość walut (1pkt)
// przechowywać dodane konta do banku
// zawierać funkcje umożliwiającą dodawanie nowych kont do banku oraz funkcje
// wypisującą wszystkie dodane konta, przy dodawaniu konta do banku generowany
// zostaje numer konta - losowa liczba czterocyfrowa. (1pkt) (Wygenerowana
// liczba powinna zaczynać się od unikalnej dla danego banku cyfry, np. dla
// pierwszej stworzonej instancji banku ta liczba może być równa 1, dla drugiego
// 2 itd. (1pkt))
// zawierać funkcje zwracające konto o podanym jako parametr jego numerze
// (zwraca null kiedy nie znajduje konta i informuje o braku znalezionego konta)
// (1pkt)
// zawierać funkcje umożliwiającą zmianę ustalonej waluty konta, dla podanego
// numeru konta (funkcja informuje o braku znalezionego konta jeżeli podany
// numer nie znajduję się w banku)
// umożliwia transfer środków pomiędzy kontami* (1pkt)
// umożliwia transfer środków pomiędzy kontami w innych walutach* (1pkt)
// umożliwia transfer środków pomiędzy kontami w różnych bankach w różnych
// walutach* (1pkt)
// * funkcje powinny informować o błędach kiedy konto o podanych numerze nie
// istnieje lub nie znajduję się w określonym banku (tylko jeśli
// zaimplementowano generowanie numeru banku zaczynającego się unikalną dla
// banku cyfrom).

// Informacje dodatkowe i wskazówki:

// Klasa Bank może zapisywać konta w tablicy (jej długość może być ustawiona
// ręcznie, 2 wystarczy) lub jako listę (np. ArrayList) lub najlepiej mapę (np.
// HashMap)
// Proste wypisanie tablicy - użycie odpowiedniej funkcji klasy Arrays
// Generowanie liczby z zakresu min - max np. przy użyciu funkcji Math.random():
// (min+ (int) (Math.random() * ((max- min) + 1))); (można też użyć odpowiednich
// metod klasy Random)
// Fajna metoda do porównania dwóch pól, które mogą być nullami w klasie Objects
// Sprawdzanie czy numer zaczyna się podaną cyfrom: albo metoda charAt, albo
// można znaleźć inną metodę klasy String
// Przykładowe działanie programu: