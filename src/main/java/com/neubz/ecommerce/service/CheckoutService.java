package com.neubz.ecommerce.service;

import com.neubz.ecommerce.dto.Purchase;
import com.neubz.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
