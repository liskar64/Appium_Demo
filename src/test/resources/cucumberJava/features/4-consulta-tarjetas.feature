# language: es

@consulta-tarjetas
   Característica: Consulta de las tarjetas bancarias


     Antecedentes:
     Dado que me conecte a la aplicacion

     Esquema del escenario: una vez logados correctamente consultamos el saldo de las tarjetas

     Cuando introduzco el Usuario <login> y la Contrasena <pass>

     Y pulso en tarjetas

     Entonces veremos el saldo de la tarjeta

Ejemplos:
      |login|pass|
      |"64026203E"|"Ibermatica"|
