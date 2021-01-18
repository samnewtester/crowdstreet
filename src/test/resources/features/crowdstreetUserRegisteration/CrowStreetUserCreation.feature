Feature: new user registeration on crowstreet

  Scenario: User Registeration
    Given iam on crowdstreet Home page
    When I navigate to create an account page
    And I fill the user registration form
    And I agree to the terms and conditions
    And I click the complete your information button
    Then I should see a welcome page
