package cred.service;

import cred.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredServiceTest {

    @Test
    void registration() {
        Address customerAddress = new Address();
        customerAddress.flatNum="j101";
        customerAddress.area= "miyapur";
        customerAddress.city="Hyd";
        customerAddress.pinCode="500049";
        customerAddress.street="Hafeezpet";

        Address bankAddress = new Address();
        bankAddress.flatNum="j202";
        bankAddress.area="Miyapur";
        bankAddress.pinCode="500049";
        bankAddress.city="Hyd";

        Ifsc ifsc = new Ifsc();
        ifsc.ifscCode="MIYAPUR-007";
        ifsc.address=bankAddress;

        Account account = new Account();
        account.accountNumber=1234567891L;
        account.availableBalance=500000;
        account.currentBalance=500000;
        account.address=customerAddress;
        account.ifscCode=ifsc;

        Customer customer = new Customer();
        customer.customerId="Arun";
        customer.password="Arun";
        customer.account=account;
        customer.Name="Arun";

        CredService service = new CredService();
        Otp registration = service.registration(customer);
        System.out.println(registration);

        Assertions.assertNotNull(registration);
    }
}