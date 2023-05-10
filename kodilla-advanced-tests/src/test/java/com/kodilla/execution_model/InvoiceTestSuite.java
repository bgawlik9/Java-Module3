package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item Bread = new Item("Bread", 4.15);



   @Test
    public void shouldAddItemsToInvoice(){

       //when
       int numbersOfItem = invoice.getSize();

       //then
       assertEquals(3,numbersOfItem);
   }
   @Test
    public void shouldGetExistingItem() {

       // when
       Item result = invoice.getItem(2);

       // then

       assertEquals("Bread", result.getName());
       assertEquals(4.15, result.getPrice(), 0.01);
   }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex(){

        // when
        Item result = invoice.getItem(-3);
        //then
        assertNull(result);

    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex(){

        // when
        Item result = invoice.getItem(4);
        //then
        assertNull(result);

    }


@Test
       public void shouldClearInvoice(){
           // Given

           int invoiceSizeBeforeClear = invoice.getSize();
           // When
           invoice.clear();
           // Then
            assertEquals(0,invoice.getSize());
            assertEquals(3,invoiceSizeBeforeClear);
   }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(Bread);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }


}
