package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2023"));
        warehouse.addOrder(new Order("2/2023"));
        warehouse.addOrder(new Order("3/2023"));
        warehouse.addOrder(new Order("4/2023"));
        warehouse.addOrder(new Order("5/2023"));
        warehouse.addOrder(new Order("6/2023"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a order number (n/yyyy):");
        String orderNumber = scanner.nextLine();


        try {
            warehouse.getOrder(orderNumber);
            System.out.println("Order number: " + orderNumber + " is on the Orderlist" );
        } catch (OrderDoesntExistException e){
            System.out.println("Order number: " + orderNumber + " is not on the Orderlist. Please type: number of order / year");
        }


    }
}
