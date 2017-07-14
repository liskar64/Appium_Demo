# language: es

   Característica: Login a la aplicacion bancaria con exito

    Esquema del escenario: entrar a la aplicacion con usuario y contraseña correctas

      Dado que me conecto a la aplicacion

      Cuando introduzco el Usuario <login> y la Contraseña <pass>

      Entonces entramos en la aplicacion

      Ejemplos:
      |login      |pass        |
      |"77001622z"|"Ibermatica"|