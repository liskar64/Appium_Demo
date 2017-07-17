# language: es

   Característica: Login a la aplicacion bancaria fallido

    Esquema del escenario: entrar a la aplicacion con usuario y contraseña incorrectas

      Dado que me conecto a la aplicacion

      Cuando introduzco el Usuario <login> y la Contrasena <pass>

      Entonces sale mensaje de error y no podemos entrar

      Ejemplos:
      |login|pass|
      |"tryte"|"tryte"|
      |""|"tryte"|
      |"tryte"|""|
      |""|""|