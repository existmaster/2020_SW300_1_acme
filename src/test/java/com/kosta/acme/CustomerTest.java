package com.kosta.acme;

import com.kosta.acme.customer.Customer;
import com.kosta.acme.customer.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = AcmeApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CustomerTest {

    @Autowired
    CustomerRepository cr;

    @Test
    public void Customer_SaveTest(){
        //Given
        Customer customer = new Customer("성열", "윤", "잡", "산업", "existmaster@naver.com", "010-2296-6004");
        //When
        cr.save(customer);
        Customer customer2 = cr.findAll().iterator().next();
        //Then
        assertEquals(customer.getFirstName(), customer2.getFirstName());
    }
}
