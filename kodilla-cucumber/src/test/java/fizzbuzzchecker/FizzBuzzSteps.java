package fizzbuzzchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {
    private int number;
    private String response;

    @Given("I have a number {int}")
    public void iHaveANumber(int number) {
        this.number = number;
    }

    @When("I play the FizzBuzz game")
    public void iPlayTheFizzBuzzGame() {
        if (number % 3 == 0 && number % 5 == 0) {
            response = "FizzBuzz";
        } else if (number % 3 == 0) {
            response = "Fizz";
        } else if (number % 5 == 0) {
            response = "Buzz";
        } else {
            response = "None";
        }
    }

    @Then("I should get the response {string}")
    public void iShouldGetTheResponse(String expectedResponse) {
        assertEquals(expectedResponse, response);
    }
}
