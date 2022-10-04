@RS-001
Feature: As a User I should be able to search my product using available options and apply at least two filters so that I can purchase my item

  Background: For the scenarios in the feature file, user is expected to be on homepage
    Given User is on homepage



  Scenario: User should be able to start shopping process from homepage to checkout by adding two filters
    When User enters "USB Cable" on search box
    When User clicks search icon
    And User clicks on "USB Cables" category
    When User selects "Brand" filter category and clicks "Bulgin" filter
    When User clicks on No thanks button
    When User selects "USB Version" filter category and clicks "USB 2.0" filter
    And User clicks "Apply filters" button
    When User selects "Bulgin Male USB A to Male Micro USB B" product from result list
    And User clicks "Add to basket" button
    And User sees and clicks on "View Basket" button


