#Autor: Fernando Villa Alvarez
  @stories
  Feature: retoDemo
    As a user I want to register on the Automation Demo Site "http://demo.automationtesting.in/Register.html"
    and then consult the WebTable link of the site.
  @scenario1
  Scenario: perform user registration by entering the following
  link: http://demo.automationtesting.in/Register.html
    Given  Fernando wants to create users on the demo page
    When Entering the registration tab of the page http://demo.automationtesting.in/Register.html
    Then correctly register your data
