Feature: Consulting prestamos 

  Scenario: I see prestamos bank

  * I wait for "Recordarme" to appear

   When I see "Recordarme"

    Then I enter text "64026203E" into field with id "user"
    * I wait for 2 seconds
    Then I enter text "Ibermatica" into field with id "pass"
    * I wait for 2 seconds
    Then I press the "ACCEDER" button
     * I wait for 2 seconds
     Then I touch the "Prestamos" text
     Then I wait for the view with id "lblListItem" to appear
     * I wait for 5 seconds