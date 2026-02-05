package com.example.electricitybilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.electricitybilling.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
