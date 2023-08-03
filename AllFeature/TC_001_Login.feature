Feature: Test OrangeHRM Application

  #Login Page created by AjinKya
  Scenario: Test Login Page functionality
    Given User is on LoginPage
    When User enter valid username and password
    And click on Login button

  #home page created by Pranita
  Scenario: Test home page functionality
    When user validate homepage url
    And User validate homepage logo
    And user validate homepage Title
    And then Click on PIM page
