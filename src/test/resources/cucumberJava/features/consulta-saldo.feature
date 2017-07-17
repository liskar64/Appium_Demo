# language: es

   Característica: Consulta del saldo bancario

    Esquema del escenario: entramos a la aplicacion y consultamos el saldo de las cuentas

      Dado que me conecto a la aplicacion
      Y para consultar saldo introduzco el Usuario <login> y la Contraseña <pass>

      Cuando pulso en cuenta

      Entonces vemos el saldo

      Ejemplos:
      |login      |pass        |
      |"77001622z"|"Ibermatica"|