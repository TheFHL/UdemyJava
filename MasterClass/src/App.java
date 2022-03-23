public class App {
    public static void main(String[] args) throws Exception {
        // Car porsche = new Car();
        // Car dodge = new Car();
        // porsche.setModel("911");
        // System.out.println("model is " + porsche.getModel());

        // Account bobsAccount = new Account("12345", 0.0, "Bob Brown", "bob.brown@email.com", "07545656");
        // bobsAccount.withdrawal(100.0);

        // bobsAccount.deposit(50.0);
        // bobsAccount.withdrawal(100.0);

        // bobsAccount.deposit(51.0);
        // bobsAccount.withdrawal(100.0);

        // Account timsAccount = new Account("Tim","tim@email.com","12345");

        // System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 250000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Steve", 9000.00, "steve@email.com");
        System.out.println(person3.getName());

    }
}
