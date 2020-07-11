package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("91230987651", 9879.67, "Cristina Alexandrescu",
                "cristina.alexandrescu@gmail.com", "07611123456");
        /*account.setAccountNumber("91230987651");
        account.setBalance(5000);
        account.setCustomerName("Alexandru Suilea");
        account.setEmail("alexandru.suilea@gmail.com");
        account.setPhoneNumber("07812345617");*/
        account.display();
        account.depositFunds(2000);
        account.display();
        account.withdrawFunds(11879.67);
        account.display();

        System.out.println();

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Laurentiu", 7000);
        VipCustomer vip3 = new VipCustomer("Alexandru", 8000, "alex@gmail.com");
    }
}
