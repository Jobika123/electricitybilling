package com.example.electricitybilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.electricitybilling.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
