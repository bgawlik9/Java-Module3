package com.kodilla.bank.homework;


public class Bank {


   private CashMachine [] cashMachines;
   private int size;


    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }
    public void addCashMachine(CashMachine cashMachine){
        this.size++;
        CashMachine [] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines,0,newTab,0,cashMachines.length);
        newTab[this.size-1] = cashMachine;
        this.cashMachines = newTab;
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

