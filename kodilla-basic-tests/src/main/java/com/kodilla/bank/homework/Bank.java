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
        this.cashMachines = new CashMachine[] {cashMachine1,cashMachine2,cashMachine3};

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
        double sum = this.cashMachine1.getCashInSum() + this.cashMachine2.getCashInSum() + this.cashMachine3.getCashInSum();
        double numberOfTransactionsIn = this.cashMachine1.getNumberOfCashIn() + this.cashMachine2.getNumberOfCashIn() + this.cashMachine3.getNumberOfCashIn();
        return sum/numberOfTransactionsIn;
    }

  public double getAverageCashOut(){
        double sum = this.cashMachine1.getCashOutSum() + this.cashMachine2.getCashOutSum() + this.cashMachine3.getCashOutSum();
        double numberOfTransactionsOut = this.cashMachine1.getNumberOfCashOut() + this.cashMachine2.getNumberOfCashOut() + this.cashMachine3.getNumberOfCashOut();
        return sum/numberOfTransactionsOut;
    }

}