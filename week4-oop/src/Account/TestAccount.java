package Account;

public class TestAccount {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account account1 = new Account("A101", "Tan Ak Teck", 88);
        System.out.println(account1);
        Account account2 = new Account("A102", "Kumar");
        System.out.println(account2);

        // test getters
        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        // test credit() and debit()
        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);

        // test transfer()
        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }
}
