Feature: FizzBuzz Game
  Is it divisible for 3 , 5 , both or none?
  Checking if number is divisible for 3 and or 5

  Scenario Outline: Number is divisible by 3, 5, or both
    Given I have a number <number>
    When I play the FizzBuzz game
    Then I should get the response "<response>"

    Examples:
      | number | response   |
      | 9      | Fizz |
      | 10     | Buzz |
      | 15     | FizzBuzz |
      | 30     | FizzBuzz |
      | 14     | None |
      | 17     | None |