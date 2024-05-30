package com.neubz.ecommerce.dto;

import com.neubz.ecommerce.entity.Address;
import com.neubz.ecommerce.entity.Customer;
import com.neubz.ecommerce.entity.Order;
import com.neubz.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
