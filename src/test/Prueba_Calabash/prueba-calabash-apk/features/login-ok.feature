Feature: Login ok

  Scenario: I write user and password ok

  * I wait for "Recordarme" to appear

   When I see "Recordarme"

    Then I enter text "77001622Z" into field with id "user"
    * I wait for 2 seconds
    Then I enter text "Ibermatica" into field with id "pass"
    * I wait for 2 seconds
    Then I press the "ACCEDER" button
    Then I wait for the view with id "lblListHeader" to appear