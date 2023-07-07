package com.system.canteen_management.services.user_management;

import com.system.canteen_management.dto.CustomerDto;
import com.system.canteen_management.entity.user_management.Customer;

import java.util.List;

public interface CustomerService {
    String saveData(CustomerDto customerDto);

    List<Customer> getData();
}
