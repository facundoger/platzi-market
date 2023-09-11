package com.platzi.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.platzi.market.domain.Purchase;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByCustomer(String customerId);
    //Optional<Purchase> getPurchase(int purchaseId);
    Purchase save(Purchase purchase);
    //void delete(int purchaseId);
}
