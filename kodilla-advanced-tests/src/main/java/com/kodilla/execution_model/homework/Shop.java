package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> ordersList;

    public Shop() {

        this.ordersList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public List<Order> getOrdersInDataRange(LocalDate starDate, LocalDate endDate) {

        List<Order> ordersInRange = new ArrayList<>();

        for (Order order : ordersList) {
            LocalDate orderDate = order.getDate();
            if (orderDate.isAfter(starDate) && orderDate.isBefore(endDate)) {
                ordersInRange.add(order);
            }
        }
        return ordersInRange;
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {

        List<Order> ordersInRange = new ArrayList<>();
        for (Order order : ordersList) {
            Double orderValue = order.getOrderValue();
            if (orderValue.compareTo(minValue) >= 0 && orderValue.compareTo(maxValue) <= 0) {
                ordersInRange.add(order);
            }
        }
        return ordersInRange;
    }

    public int getNumberOfOrders() {
        return ordersList.size();
    }

    public double getSumOfOrders() {

        double sumOfOrder = 0;

        for (Order value : ordersList) {
            sumOfOrder += value.getOrderValue();
        }
        return sumOfOrder;
    }

}