package com.example.electricitybilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.electricitybilling.model.Bill;
import com.example.electricitybilling.repository.BillRepository;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillRepository repo;

    @PostMapping("/add")
    public Bill addBill(@RequestBody Bill bill) {
        double amount = bill.getUnits() * 5; // simple calculation
        bill.setAmount(amount);
        bill.setStatus("UNPAID");
        return repo.save(bill);
    }
}
