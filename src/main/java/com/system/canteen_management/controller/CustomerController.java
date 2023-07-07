package com.system.canteen_management.controller;

import com.system.canteen_management.dto.CustomerDto;
import com.system.canteen_management.entity.user_management.Customer;
import com.system.canteen_management.services.user_management.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getData(){
        return customerService.getData();
    }

    @PostMapping("save")
    public String saveCustomer(@Valid CustomerDto customerDto) {
        customerService.saveData(customerDto);
        return "data saved";
    }
}
