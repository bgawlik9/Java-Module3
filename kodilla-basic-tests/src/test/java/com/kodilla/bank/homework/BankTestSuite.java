package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldGetCorrectCashMachinesBalance(){
        Bank bank = new Bank();
        bank.addCashMachine1(300);
        bank.addCashMachine1(200);

        bank.addCashMachine2(100);
        bank.addCashMachine2(500);

        bank.addCashMachine3(200);
        bank.addCashMachine3(600);

        int cashMachineBalance = bank.getCashMachinesBalance();


        assertEquals(1900,cashMachineBalance);



    }

    @Test
    public void shouldGetCorrectNumberOfCashIn(){
        Bank bank = new Bank();
        bank.addCashMachine1(300);
        bank.addCashMachine1(-100);

        bank.addCashMachine2(-200);
        bank.addCashMachine2(-100);

        bank.addCashMachine3(500);
        bank.addCashMachine3(100);
        bank.addCashMachine3(0);
        int numberOfCashIn = bank.getNumberOfCashIn();

        assertEquals(3,numberOfCashIn);


    }

    @Test
    public void shouldGetCorrectNumberOfCashOut(){
        Bank bank = new Bank();
        bank.addCashMachine1(300);
        bank.addCashMachine1(-100);

        bank.addCashMachine2(-200);
        bank.addCashMachine2(-100);

        bank.addCashMachine3(500);
        bank.addCashMachine3(100);
        bank.addCashMachine3(-100);
        int numberOfCashOut = bank.getNumberOfCashOut();
        assertEquals(4,numberOfCashOut);

    }

    @Test
    public void shouldCalculateAverageCashIn(){
        Bank bank = new Bank();
        bank.addCashMachine1(300);
        bank.addCashMachine1(-100);

        bank.addCashMachine2(-200);
        bank.addCashMachine2(-100);

        bank.addCashMachine3(500);
        bank.addCashMachine3(100);
        bank.addCashMachine3(-100);
        double averageCashIn = bank.getAverageCashIn();
        assertEquals(300, averageCashIn, 0.01);


    }

    @Test
    public void shouldCalculateAverageCashOut(){
        Bank bank = new Bank();
        bank.addCashMachine1(300);
        bank.addCashMachine1(-100);

        bank.addCashMachine2(-200);
        bank.addCashMachine2(-100);

        bank.addCashMachine3(500);
        bank.addCashMachine3(100);
        bank.addCashMachine3(-100);
        double averageCashOut = bank.getAverageCashOut();
        assertEquals(-125,averageCashOut,0.01);


    }


}
