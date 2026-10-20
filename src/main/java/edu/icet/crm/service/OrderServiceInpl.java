package edu.icet.crm.service;

import edu.icet.crm.model.Order;

import java.util.Arrays;
import java.util.List;

public class OrderServiceInpl {
    public List<Order> getOrder(){
        return Arrays.asList(new Order("samahan",10,200.50));
    }
}
