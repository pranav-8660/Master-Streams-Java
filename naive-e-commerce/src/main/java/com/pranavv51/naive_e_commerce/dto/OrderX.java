package com.pranavv51.naive_e_commerce.dto;

import java.util.List;

public class OrderX {
    private int orderId;
    private String paymentMode; // CARD, UPI, COD
    private List<OrderItem> items;

    public OrderX(int orderId, String paymentMode, List<OrderItem> items) {
        this.orderId = orderId;
        this.paymentMode = paymentMode;
        this.items = items;
    }

    public int getOrderId() { return orderId; }
    public String getPaymentMode() { return paymentMode; }
    public List<OrderItem> getItems() { return items; }

    @Override
    public String toString() {
        return "OrderX{id=" + orderId +
                ", paymentMode='" + paymentMode + '\'' +
                ", items=" + items.size() + '}';
    }
}
