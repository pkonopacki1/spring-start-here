package com.konopackipio1.ch12datasources.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konopackipio1.ch12datasources.model.Purchase;
import com.konopackipio1.ch12datasources.repository.PurchaseRepository;

@RestController
@RequestMapping("payment")
public class PurchaseController {

    private PurchaseRepository purchaseRepository;  

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void addPurchase(@RequestBody Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> ResponseEntity() {
        return purchaseRepository.findAllPurchases();
    }
    
}
