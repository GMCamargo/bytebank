package models

class Conta(var titular: String,
            val numero: Int) {

    private var saldo = 0.0
        private set


    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Conta

        if (titular != other.titular) return false
        if (numero != other.numero) return false

        return true
    }

    fun getSaldo():Double {
        return this.saldo
    }

    override fun hashCode(): Int {
        var result = titular.hashCode()
        result = 31 * result + numero
        return result
    }

    fun depositar(valor: Double) {

        this.saldo += valor
        println("Saldo de ${this.titular} alterado. Novo saldo: ${this.saldo}")

    }

    fun sacar(valor: Double): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            return true
        } else {
            println("Saldo insuficiente")
            return false
        }
    }

    fun transferencia(conta: Conta, valor: Double) {
        if (sacar(valor)) conta.depositar(valor)
    }
}