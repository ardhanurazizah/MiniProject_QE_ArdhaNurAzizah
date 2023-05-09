Feature: As a user
  I have successfully logged in
  so that I can see the product page

  @TC-001
  Scenario: as a user I want to register and successfully
    Given user on main page
    When user click on login button
    And user on login page
    And user click register button
    And user on register page
    And user enter a valid full name
    And user enter a valid email
    And user enter a valid password
    And user click on register button
    Then user on login page
#
  @TC-002
  Scenario: as a user I want to login and successfully
    Given user on main page
    When user click on login page
    And user on login page
    And user enter a valid email
    And user enter a valid password
    And user click on login button
    Then user on main page

#  @TC-006
#  Scenario: as a user I want to see product details
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a valid password
#    And user click on login button
#    And user on main page
#    And user click the detail button on the selected product
#    Then user on detail page
#
#  @TC-007
#  Scenario: as a user I want to add a product to my shopping cart
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a valid password
#    And user click on login button
#    And user on main page
#    And user click buy button on the selected product
#    And user can see the number in the shopping cart
#    And user can click shopping cart button
#    Then user can see product purchased
#
#  @TC-008
#  Scenario: as a user I want to pay for a product in a shopping cart
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a valid password
#    And user click on login button
#    And user on main page
#    And user click buy button on the selected product
#    And user can see the number in the shopping cart
#    And user can click shopping cart button
#    And user can add number product
#    And user can click pay button
#    Then user goes to the successful transaction page
#
#  @TC-0010
#  Scenario: as a user I want to select the category
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a valid password
#    And user click on login button
#    And user on main page
#    And user click select category button
#    Then user can see selected category
#
#  @TC-009
#  Scenario: as a user I want transactions that have been done
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a valid password
#    And user click on login button
#    And user on main page
#    And user click account button
#    And user can click transaction
#    Then user goes to the successful transaction page
#
#  @TC-005
#  Scenario: as a user I want to logout from the account
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a valid password
#    And user click on login button
#    And user on main page
#    And user click account button
#    And user can click logout button
#    Then user on login page
#
#  @TC-003
#  Scenario: as a user I want to login with invalid email
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a invalid email
#    And user enter a valid password
#    And user click on login button
#    Then user see an error message
#
#  @TC-004
#  Scenario: as a user I want to login with invalid password
#    Given user on main page
#    When user click on login button
#    And user on login page
#    And user enter a valid email
#    And user enter a invalid password
#    And user click on login button
#    Then user see an error message