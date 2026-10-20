package edu.icet.crm.contoller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.model.Order;
import edu.icet.crm.service.CustomerServiceInpl;
import edu.icet.crm.service.OrderServiceInpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class OrderContoller {
    @GetMapping("/order")
    List<Order> getOrder() {
        OrderServiceInpl service = new OrderServiceInpl();

        return service.getOrder();
    }
}
