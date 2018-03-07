Feature: Login function validation

Scenario: Successful Login with Valid Credential
   Given user able to open browser
   And  go to UPS home page
   When user navigate to login button link
   And  User able to put valid user name-Sarower2017
   And  User able to put valid password- Ttech123$
   Then Login successfully
