package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldGetCorrectCashMachinesBalance(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.add(200);
        cashMachine1.add(300);

        cashMachine2.add(100);
        cashMachine2.add(500);

        cashMachine3.add(200);
        cashMachine3.add(600);

        int cashMachineBalance = bank.getCashMachinesBalance();


        assertEquals(1900,cashMachineBalance);



    }

    @Test
    public void shouldGetCorrectNumberOfCashIn(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.add(300);
        cashMachine1.add(-100);

        cashMachine2.add(-200);
        cashMachine2.add(-100);

        cashMachine3.add(500);
        cashMachine3.add(100);
        cashMachine3.add(0);

        int numberOfCashIn = bank.getNumberOfCashIn();

        assertEquals(3,numberOfCashIn);


    }

    @Test
    public void shouldGetCorrectNumberOfCashOut(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.add(300);
        cashMachine1.add(-100);

        cashMachine2.add(-200);
        cashMachine2.add(-100);

        cashMachine3.add(500);
        cashMachine3.add(100);
        cashMachine3.add(-100);

        int numberOfCashOut = bank.getNumberOfCashOut();

        assertEquals(4,numberOfCashOut);

    }

    @Test
    public void shouldCalculateAverageCashIn(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.add(300);
        cashMachine1.add(-100);

        cashMachine2.add(-200);
        cashMachine2.add(-100);

        cashMachine3.add(500);
        cashMachine3.add(100);
        cashMachine3.add(-100);
        double averageCashIn = bank.getAverageCashIn();
        assertEquals(300, averageCashIn, 0.01);


    }

    @Test
    public void shouldCalculateAverageCashOut(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.add(300);
        cashMachine1.add(-100);

        cashMachine2.add(-200);
        cashMachine2.add(-100);

        cashMachine3.add(500);
        cashMachine3.add(100);
        cashMachine3.add(-100);
        double averageCashOut = bank.getAverageCashOut();
        assertEquals(-125,averageCashOut,0.01);


    }


}
