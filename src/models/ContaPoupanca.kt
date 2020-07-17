package models

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero) {

    override fun sacar(valor: Double) {
        if (valor <= this.saldo)
            saldo -= valor
    }


}