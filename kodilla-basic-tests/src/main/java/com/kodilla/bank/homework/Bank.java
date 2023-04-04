package com.kodilla.bank.homework;


public class Bank {

    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    CashMachine [] cashMachines;


    public Bank() {
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
        this.cashMachines = new CashMachine[]{cashMachine1, cashMachine2, cashMachine3};
    }



    public void addCashMachine1 (int cash){
        this.cashMachine1.add(cash);
    }
    public void addCashMachine2 (int cash){
        this.cashMachine2.add(cash);
    }
    public void addCashMachine3 (int cash){
        this.cashMachine3.add(cash);
    }

    public int getCashMachinesBalance(){

        int banks = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            banks += this.cashMachines[i].getBalance();
            }

        return banks;

    }
    public int getNumberOfCashIn(){
        int banks = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            banks += this.cashMachines[i].getNumberOfCashIn();
        }
        return banks;

    }

    public int getNumberOfCashOut(){
        int banks = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            banks += this.cashMachines[i].getNumberOfCashOut();
        }
        return banks;
    }
    public double getAverageCashIn(){
        double banks = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            banks += this.cashMachines[i].getCashInSum();
        }
            double cashIn = 0;
            for (int z = 0; z < this.cashMachines.length; z++) {
                cashIn += this.cashMachines[z].getNumberOfCashIn();
            }
        return banks/cashIn;
    }

  public double getAverageCashOut(){
            double banks = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                banks += this.cashMachines[i].getCashOutSum();
            }
      double cashOut = 0;
      for (int z = 0; z < this.cashMachines.length; z++) {
            cashOut += this.cashMachines[z].getNumberOfCashOut();
      }
        return banks/cashOut;
    }}

