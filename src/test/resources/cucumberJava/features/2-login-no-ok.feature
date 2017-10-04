# language: es

@login-not-ok
   Característica: Login a la aplicacion bancaria fallido

      Antecedentes:
      Dado que me conecte a la aplicacion

      Esquema del escenario: intentamos entrar a la aplicacion con usuario y contraseña incorrectas

      Cuando introduzco el Usuario <login> y la Contrasena <pass>

      Entonces saldra mensaje de error y no podremos entrar

      Ejemplos:
      |login|pass|
      |"tryte"|"tryte"|
      |""|"tryte"|
      |"tryte"|""|
      |""|""|