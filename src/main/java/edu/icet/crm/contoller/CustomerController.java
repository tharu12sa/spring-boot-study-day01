package edu.icet.crm.contoller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerServiceInpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
public class CustomerController {

        @GetMapping("/customer")
    List<Customer> getCustomer(){
        CustomerServiceInpl service = new CustomerServiceInpl();

        return service.getCustomer();
    }
}
