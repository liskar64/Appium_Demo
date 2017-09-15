Feature: Login no ok

  Scenario: I write user and password not ok

  * I wait for "Recordarme" to appear

   When I see "Recordarme"


    Then I enter text "77001622Z" into field with id "user"
    * I wait for 2 seconds
    Then I enter text "pepepotamo" into field with id "pass"
    * I wait for 2 seconds
    Then I press the "ACCEDER" button
    * I wait for 2 seconds
    Then I wait for the view with id "alertMessage" to appear

   