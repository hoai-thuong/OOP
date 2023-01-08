package exercise2.exericise2_5;

public class TestMain {
    public static void main(String[] args) {
        //test customer class
        Customer c1 = new Customer(1, "hoaithuong", 'f');
        System.out.println(c1);
        System.out.println(c1.getName());
        //test account class
        Account acc1 = new Account(2, c1, 100);
        System.out.println(acc1);
        acc1.setBalance(100.0);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("amount is: " + acc1.getBalance());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println(acc1.withdraw(10));


    }
}
