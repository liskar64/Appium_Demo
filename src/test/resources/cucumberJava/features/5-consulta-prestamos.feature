# language: es


@consulta-prestamos

   Característica: Consulta de los prestamos


     Antecedentes:
     Dado que me conecte a la aplicacion

     Esquema del escenario: una vez logados correctamente consultamos el saldo de los prestamos

     Cuando introduzco el Usuario <login> y la Contrasena <pass>

     Y pulso en prestamos

     Entonces veremos el saldo de los prestamos

Ejemplos:
      |login|pass|
      |"64026203E"|"Ibermatica"|
