package iantravell.com;

public class Main {

    public static void main(String[] args) {
	Account IansAccount = new Account("12345", 1000.0, "Ian Travell", "ian@test.com", "07763 842651");

        System.out.println("Account number is " + IansAccount.getNumber());
        System.out.println("Account balance is £" + IansAccount.getAccountBalance());

        IansAccount.setNumber("233090");
        IansAccount.setAccountBalance(1000.0);
        IansAccount.setCustomerName("Ian Travell");
        IansAccount.setCustmerEmailAddress("ian@ian.com");
        IansAccount.setCustomerPhoneNumber("07763 842651");

        IansAccount.withdrawal(100.0);

        IansAccount.deposit(50.0);
        IansAccount.withdrawal(100.0);

        IansAccount.deposit(51.0);
        IansAccount.withdrawal(100.0);

        Account CarlsAccount = new Account("Carl", "carl@test.com", "123456789");
        System.out.println("Account number is: " + CarlsAccount.getNumber() + " Name: " + CarlsAccount.getCustomerName());
        System.out.println("current balance is " + CarlsAccount.getAccountBalance());
        CarlsAccount.withdrawal(100.55);


//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("Becky", 2500.00);
//        System.out.println(customer2.getName());
//
//        VipCustomer customer3 = new VipCustomer("John", 100.00, "John@gmail.com");
//        System.out.println(customer3.getName());
//        System.out.println(customer3.getEmailAddress());
    }
}
