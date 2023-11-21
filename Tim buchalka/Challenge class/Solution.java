public class Solution {
    public static void main(String[] args) {
        Bankaccount b = new Bankaccount();
        b.setAccountBalance(5000);
        b.setAccountNumber(1223243244);
        b.setCustomerName("Malay");
        b.setEmail("bhowmikm2008@gmail.com");
        b.setPhoneNumber("7897340129");

        System.out.println("Name = " + b.getCustomerName());
        System.out.println("Balance = " + b.getAccountBalance());
        b.addMoney(20000);
        b.debitMoney(50000);
    }
}
