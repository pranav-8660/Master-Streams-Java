package com.pranavv51.naive_e_commerce.dto;

import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String city;
    private List<OrderX> orders;

    public Customer(int customerId, String name, String city, List<OrderX> orders) {
        this.customerId = customerId;
        this.name = name;
        this.city = city;
        this.orders = orders;
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public List<OrderX> getOrders() { return orders; }

    @Override
    public String toString() {
        return "Customer{id=" + customerId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", orders=" + orders.size() + '}';
    }
}

