Feature: Valid and Invalid Credential
  @validCredential
  Scenario: User should able to  login successfully,
  so that user can see welcome massage
    Given user is on homepage
    When  user enter valid username
    And   user enter valid password
    And   user click on login button
    Then  user should able to see welcome Massage successfully


    @InvalidCredential
    Scenario Outline: User should not be able to login successfully,
    so that user get an error massage

      Given user is on home page
      When  user enter "<invalid username>" in username text box
      And   user enter "<invalid password>" in password text box
      And   user click on login button
      Then  user should not able to see login successfully and user  should get  an "<error massage>"
      Examples:

        | invalid username | invalid password | error massage                |
        | ADMIN            | ADMIN132         | Invalid credentials          |
        | Admin            | ADMIN132         | Invalid credentials          |
#        | ADMIN            | admin123         | Csrf token validation failed |
#        |                  | ADMIN132         | Username cannot be empty     |
#        | ADMIN            |                  | Password cannot be empty     |
#        |                  | admin123         | Username cannot be empty     |
#        | Admin            |                  | Password cannot be empty     |
#        |                  |                  | Username cannot be empty     |





















