public class Customer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(){
        this("John doe",2000000,"johndoe@gmail.com");
        System.out.println("Default Constructor called");
    }

    public Customer(String name, String emailAddress){
        this(name, 200000, emailAddress);
        System.out.println("2 parameters constructor called");
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public void describeData(){
        System.out.println("Name = " + name + " Credit limit = " + creditLimit + " email address = " + emailAddress);
    }

}
