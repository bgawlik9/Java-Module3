package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
            Assertions.assertEquals(170,  wallet.getBalance(),"Incorrect wallet balance");
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());
    }

    @When("I request $200")
    public void i_request_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }
    @Then("$200 should be dispensed")
    public void $200_should_be_dispensed() {
        Assertions.assertEquals(200, cashSlot.getContents());
    }
    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }
    @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }
    @When("I request $300")
    public void i_request_$300() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 300);
    }
    @Then("no cash should be dispensed")
    public void no_cash_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents(),"Cash should not be dispensed");
    }
    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I withdraw $200")
    public void I_withdraw_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void I_should_be_told_that_I_dont_have_enough_money_in_my_wallet() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents(),"Cash should not be dispensed");
    }
    @Given("my account has been credited with $ 100")
    public void my_account_has_been_credited_with_$_100() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I withdraw $ 50")
    public void I_withdraw_$_50() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 50);
    }
    @Then("I check my balance")
    public void I_check_my_balance() {
         wallet.getBalance();
    }
    @Then("It should return $ 50")
    public void It_should_return_$_50() {
        Assertions.assertEquals(50,  wallet.getBalance(),"Incorrect wallet balance");
    }
    @Then("I should see that my balance is $ 100")
    public void I_should_see_that_my_balance_is_$_100(){
        Assertions.assertEquals(100,  wallet.getBalance(),"Incorrect wallet balance");
    }


}
