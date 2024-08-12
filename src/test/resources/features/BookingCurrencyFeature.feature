Feature: Currency and language icons are in the Booking page and can be hovered over

  Scenario: Currency and language icons are in the Booking page and can be hovered over
    Given Open booking website
    When the currency icon is on the page
    Then I hover over the currency
    When the language icon is on the page
    Then I hover over the language
