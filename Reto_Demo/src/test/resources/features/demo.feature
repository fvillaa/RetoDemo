#Autor: Fernando Villa Alvarez
  @stories
  Feature: retoDemo
    As a user I want to register on the Automation Demo Site "http://demo.automationtesting.in/Register.html"
    and then consult the WebTable link of the site.

    @scenario1
    Scenario Outline: perform user registration by entering the following
    link: http://demo.automationtesting.in/Register.html
      Given  Fernando wants to create users on the demo page
      When Entering the register tab of the automation demo site
        | firstname   | lastname   | address   | email   | phone   | year   | month   | day   | password1   | password2   |
        | <firstname> | <lastname> | <address> | <email> | <phone> | <year> | <month> | <day> | <password1> | <password2> |
      Then correctly Register your data
      Examples:
        | firstname | lastname      | address      | email                 | phone      | year | month  | day | password1     | password2     |
        | Fernando  | Villa Alvarez | Mz 11 Casa 1 | fvilla.82@hotmail.com | 3124335093 | 1982 | April  | 12  | Poiuytre155** | Poiuytre155** |
        | Lina      | Holguin       | Mz 11 Casa 1 | linahm.25@hotmail.com | 3197123582 | 1985 | April | 23  | Poiuytre156** | Poiuytre156** |