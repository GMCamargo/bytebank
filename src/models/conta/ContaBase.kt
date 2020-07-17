package models.conta

interface ContaBase{
    val titular: String
    val numero: Int
    var saldo:Double

    fun depositar(valor: Double) {

        this.saldo += valor
        println("Saldo de ${this.titular} alterado. Novo saldo: ${this.saldo}")

    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) this.saldo -= valor
        else println("Saldo insuficiente")
    }


}