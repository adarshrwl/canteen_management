package com.system.canteen_management.repo.user_management;

import com.system.canteen_management.entity.user_management.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
