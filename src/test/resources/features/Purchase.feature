@Purchase
  Feature: Sales
    As a user i want purchase one item from list product

    Scenario: Normal login
      Given User open the website sauce demo
      When User input "standard_user" as a userName "secret_sauce" as a password
      And User already on home page
      And User filter list  product by "Name (Z to A)"
      And User click button cart 1 "Test.allTheThings T-Shirt (Red)"
      And User click button cart 2 "Sauce Labs Onesie"
      Then User click shopping cart
      When User already on your cart page
      And User click button remove
      And User click button checkout
      Then User already on checkout:Your Information
      When User input "Fathiyah" as a firstName "Ramadhani" as a lastName "35XXX" as a postalCode
      And User click button continue
      Then User already on checkout:overview page
      When User check total
      And User click on finish button
      Then User already on Chechout: Complete! page


