package customerandaccount;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer Class
        Customer customer1 = new Customer(123, "Tan Ah Teck", 'm');
        System.out.println(customer1);

        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        //Test Account Class
        Account account1 = new Account(136, customer1, 200.45);
        System.out.println(account1);
        Account account2 = new Account(137, customer1);
        System.out.println(account2);

        account1.setBalance(300);
        System.out.println(account1);
        System.out.println("ID is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("customer's name is: " + account1.getCustomerName());

        System.out.println(account1.deposit(50.15));
        System.out.println(account1.withdraw(200.05));
    }
}
