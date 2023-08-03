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

  #PIM page created by Sulbha
  Scenario: Test the PIM Page Functionality
    When User Click on Add Employee button
    And User enter firstname and middlename and lastname and capture user ID
    Then User click on save button
    
    #UserPersonalDetails Page created by Manish
    
    Scenario: Test the UserPersonalDetails Page Functionality
    When user enter License No and Gender
    And click on Save Button
