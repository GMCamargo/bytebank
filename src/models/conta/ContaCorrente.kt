package models.conta

import models.conta.Conta

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        val taxa = valor + 0.1
        super.sacar(taxa)
    }

   override fun transferencia(conta: Conta, valor: Double){
       super.transferencia(conta, valor+0.1)
   }

}