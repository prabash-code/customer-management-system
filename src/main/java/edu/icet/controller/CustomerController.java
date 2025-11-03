package edu.icet.controller;

import edu.icet.model.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/name")
    public String getName(){
        return "Saman";
    }

    @GetMapping("/age")
    public String getAge(){
        return "Galle";
    }
    @GetMapping("/customer-all")
    public Customer getAll(){
        return new Customer(
                "1",
                "Nimal",
                "Galle",
                45000.00
        );
    }
}
