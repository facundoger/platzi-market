package com.platzi.market.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.service.PurchaseService;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public List<Purchase> getAll(){
        return purchaseService.getAll();
    }
    @GetMapping("/customer/{customerId}")
    public Optional<List<Purchase>> getByCustomer(@PathVariable("customerId") String customerId){
        return purchaseService.getByCustomer(customerId);
    }
    /*@GetMapping("/{id}")
    public Optional<Purchase> getPurchase(@PathVariable("id") int purchaseId){
        return purchaseService.getPurchase(purchaseId);
    }*/
    @PostMapping("/save")
    public Purchase save(@RequestBody Purchase purchase){
        return purchaseService.save(purchase);
    }
    /*@DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int purchaseId){
        return purchaseService.delete(purchaseId);
    }*/
}
