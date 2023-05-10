package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    private Shop shop;

    @BeforeEach
    public void createOrderList(){
        shop = new Shop();
        shop.addOrder(new Order(9.5, LocalDate.of(2023, 7, 1), "User1"));
        shop.addOrder(new Order(3.5, LocalDate.of(2023, 5, 20), "User2"));
        shop.addOrder(new Order(5, LocalDate.of(2023, 6, 30), "User3"));
        shop.addOrder(new Order(15.5, LocalDate.of(2023, 4, 30), "User4"));
        shop.addOrder(new Order(7, LocalDate.of(2023, 6, 2), "User5"));
        shop.addOrder(new Order(7.5, LocalDate.of(2023, 6, 4), "User6"));
    }


    @Test
    public void shouldCorrectlyAddOrder() {
        //when
        int initialSize = shop.getNumberOfOrders();
        shop.addOrder(new Order(10,LocalDate.of(2023,1,5),"user1"));
        int newSize = shop.getNumberOfOrders();

        //then
        assertEquals(initialSize +1, newSize);
    }
    @Test
    public void shouldGetOrdersInRange() {
        //when
        LocalDate startDate = LocalDate.of(2023, 3, 1);
        LocalDate endDate = LocalDate.of(2023, 6, 1);
        List<Order> ordersInRange = shop.getOrdersInDataRange(startDate, endDate);

        //then
        assertEquals(2, ordersInRange.size());
    }

    @Test
    public void shouldGetOrdersByValueRange() {
        //when
        double minValue = 3.0;
        double maxValue = 6.0;
        List<Order> ordersByValueRange = shop.getOrdersByValueRange(minValue, maxValue);

        //then
        assertEquals(2, ordersByValueRange.size());
    }
    @Test
    public void shouldGetNumberOfOrders() {
        //when
        int numberOfOrders = shop.getNumberOfOrders();

        //then
        assertEquals(6, numberOfOrders);
    }
    @Test
    public void shouldGetSumOfOrders() {
        //when
        Double totalValue = shop.getSumOfOrders();

        //then
        assertEquals(Double.valueOf(48), totalValue);
    }

}
