public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.describeData();
        Customer c2 = new Customer("Srikant","srikant@gmail.com");
        c2.describeData();
        Customer c3 = new Customer("Dada",2000000,"dada@gmail.com");
        c3.describeData();
    }
}
