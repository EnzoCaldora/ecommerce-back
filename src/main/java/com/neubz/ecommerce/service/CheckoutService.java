package com.neubz.ecommerce.service;

import com.neubz.ecommerce.dto.PaymentInfo;
import com.neubz.ecommerce.dto.Purchase;
import com.neubz.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentinfo) throws StripeException;
}
