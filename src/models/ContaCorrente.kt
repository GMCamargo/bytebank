package models

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double) {
        val taxa = valor + 0.1
        if (taxa <= saldo) sacar(taxa)
    }
}