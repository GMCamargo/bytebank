package `sintaxe-inicial`

import models.*
import java.math.BigDecimal

val lista = listOf(ContaCorrente("Gabriel", 4561), ContaPoupanca("Paola", 4587))
fun testeFuncionario() {

    val a = Auxiliar("Toninho", "11111111111", 3000.0)

    println(a)

    val ger = Gerente("Hercules", "33333333333", 10000.0, "ROLE_ADMIN", "1234")
    println(ger)
    println(ger.autentica("1234"))

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(a)
    calculadoraBonificacao.registra(ger)

    println(calculadoraBonificacao.total)
}

fun testeConta() {
    val conta = ContaCorrente("GOD", 0)
    conta.depositar(Double.MAX_VALUE)


    for (c in lista) println(c)
    println()

//    depositar(Conta("Gabriel", 4501), 50.0)

//    conta.transferencia(find(Conta("Gabriel", 4561)), 10.0)
    find(ContaCorrente("Gabriel", 4561)).sacar(10.0)
    println(conta)
    println(find(ContaCorrente("Gabriel", 4561)))
}

fun find(conta: Conta): Conta {
    val i = lista.indexOf(conta)
    if (i != -1)
        return lista[i]
    return ContaCorrente("", 0)
}