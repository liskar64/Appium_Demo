# language: es

@consulta-saldo

   Característica: Consulta del saldo bancario

    Antecedentes:
    Dado que me conecte a la aplicacion

    Esquema del escenario: una vez logados correctamente consultamos el saldo de las cuentas

    Cuando introduzco el Usuario <login> y la Contrasena <pass>

    Y pulso en cuenta

    Entonces veremos el saldo

      Ejemplos:
      |login|pass|
      |"77001622Z"|"Ibermatica"|