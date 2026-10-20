package edu.icet.crm.service;

import edu.icet.crm.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerServiceInpl {

    public List<Customer> getCustomer(){
        return Arrays.asList(new Customer("frank","0772530442",50,true),
                new Customer("jagat","0783694041",46,false));
    }
}
