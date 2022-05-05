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
        | firstname   | lastname   | address   | email   | phone   | gender   | hobbies   | year   | month   | day   | password1   | password2   |
        | <firstname> | <lastname> | <address> | <email> | <phone> | <gender> | <hobbies> | <year> | <month> | <day> | <password1> | <password2> |
      Then correctly Register your data
      Examples:
        | firstname | lastname         | address      | email                 | phone      | gender | hobbies        | year | month    | day | password1     | password2     |
        | Fernando  | Villa Alvarez    | Mz 11 Casa 1 | fvilla.82@hotmail.com | 3124335093 | Male   | Cricket-Movies | 1982 | October  | 12  | Poiuytre155** | Poiuytre155** |
        | Lina      | Holguin Martinez | Mz 11 Casa 1 | linahm.25@hotmail.com | 3197123582 | FeMale | Movies-        | 1985 | April    | 23  | Poiuytre156** | Poiuytre156** |
        | Dylan     | Villa Holguin    | Mz 11 Casa 1 | dylan@hotmail.com     | 3197123582 | Male   |                | 2015 | November | 7   | Poiuytre157** | Poiuytre157** |