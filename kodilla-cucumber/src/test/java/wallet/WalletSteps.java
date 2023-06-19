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
        cashier.withdraw(wallet, 0);
    }
    @Then("no cash should be dispensed")
    public void no_cash_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents(),"Cash should not be dispensed");
    }


}
