package iantravell.com;

/**
 * Created by iantravell on 29/11/2016.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    // Three constructors created //

    public VipCustomer() {
        this("Default name", 50000.00, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
