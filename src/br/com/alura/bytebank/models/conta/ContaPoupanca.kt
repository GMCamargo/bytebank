package br.com.alura.bytebank.models.conta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero)