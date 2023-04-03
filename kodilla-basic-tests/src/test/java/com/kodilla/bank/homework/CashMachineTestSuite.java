package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {



    @Test
    public void shouldHaveZeroLength(){
        CashMachine cashMachine = new CashMachine();
        int [] transactions = cashMachine.getTransactions();
        assertEquals(0,transactions.length);
    }
    @Test
    public void shouldAddTwoElementsToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(400);

        int [] transactions = cashMachine.getTransactions();
        assertEquals(2,transactions.length);
        assertEquals(200,transactions[0]);
        assertEquals(400, transactions[1]);
    }

    @Test
    public void shouldHaveGoodBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(400);
       int goodBalance = cashMachine.getBalance();
        assertEquals(600,goodBalance);
    }
    @Test
    public void shouldHaveGoodNumberOfCashIn(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-200);
        cashMachine.add(100);
        int correctNumberOfCashIn = cashMachine.getNumberOfCashIn();
        assertEquals(2,correctNumberOfCashIn);
    }
    @Test
    public void shouldHaveGoodNumberOfCashOut(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-200);
        cashMachine.add(-100);
        cashMachine.add(700);
        int correctNumberOfCashOut = cashMachine.getNumberOfCashOut();
        assertEquals(3,correctNumberOfCashOut);
    }
    @Test
    public void shouldHaveCorrectCashIn(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-200);
        cashMachine.add(100);
        double correctAverageCashIn = cashMachine.getCashInSum();
        assertEquals(300,correctAverageCashIn);
    }
    @Test
    public void shouldHaveCorrectCashOuT(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-200);
        cashMachine.add(100);
        double correctAverageCashOut = cashMachine.getCashOutSum();
        assertEquals(-200,correctAverageCashOut);
    }



}
