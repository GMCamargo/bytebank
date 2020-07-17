package br.com.alura.bytebank.models.conta

class ContaSalario(
    override val titular: String,
    override val numero: Int,
    override var saldo: Double = 0.0
) : ContaBase {

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ContaBase

        if (titular != other.titular) return false
        if (numero != other.numero) return false

        return true
    }

    override fun hashCode(): Int {
        var result = titular.hashCode()
        result = 31 * result + numero
        return result
    }
}
