Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed


  Scenario: Full withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed

  Scenario: Empty withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $0
    Then $0 should be dispensed

  Scenario: Withdrawal attempt with insufficient funds
    Given I have deposited $200 in my wallet
    When I request $300
    Then $0 should be dispensed