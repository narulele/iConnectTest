@complete
Feature: Verify links from Home page
  I want to use this template for my feature file
  
  Scenario: User should be able to see the various options like Deliveries/Facilities/Finance/Employee Mgmt
    Given Navigate to iConnect page
    And User is able to login
    When User Click on Menu Option
    Then Verify all Menu options are clickable

  @Test1
  Scenario Outline: Verify all links from Delivery Menu option
    Given Navigate to iConnect page
    And User is able to login
    And User should be on Homepage
    When User Click on "<UserMenu>" Menu Option
    Then Verify all links from the Delivery menu option

    Examples: 
      | UserMenu            |
      | Delivery            |
      | ICRES               |
      | Finance             |
      | Employee Management |
