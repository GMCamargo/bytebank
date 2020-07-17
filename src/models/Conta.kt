package models

abstract class Conta(
    var titular: String,
    val numero: Int
) {

    var saldo = 0.0
        protected set


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

    override fun hashCode(): Int {
        var result = titular.hashCode()
        result = 31 * result + numero
        return result
    }

    fun depositar(valor: Double) {

        this.saldo += valor
        println("Saldo de ${this.titular} alterado. Novo saldo: ${this.saldo}")

    }

    abstract fun sacar(valor: Double)

    fun transferencia(conta: Conta, valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            conta.depositar(valor)
        } else {
            println("saldo insuficiente")
        }
    }
}