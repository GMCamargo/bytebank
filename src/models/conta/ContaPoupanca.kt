package models.conta

import models.conta.Conta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero)