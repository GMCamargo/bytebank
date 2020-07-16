package `sintaxe-inicial`

import models.Conta
import models.Funcionario
val lista = listOf(Conta("Gabriel", 4561), Conta("Paola", 4587))
fun testeFuncionario(){
    val a = Funcionario("Toninho", "11111111111", 3000.0)

    println(a)

    val ger = Funcionario("Hercules", "33333333333", 10000.0)
    println(ger)
}

fun testeConta(){
    val conta = Conta("GOD", 0)
    conta.depositar(Double.MAX_VALUE)


    for (c in lista) println(c)
    println()

//    depositar(Conta("Gabriel", 4501), 50.0)

//    conta.transferencia(find(Conta("Gabriel", 4561)), 10.0)
    find(Conta("Gabriel", 4561)).sacar(10.0)
    println(conta)
    println(find(Conta("Gabriel", 4561)))
}

fun find(conta: Conta): Conta {
    val i = lista.indexOf(conta)
    if (i != -1)
        return lista[i]
    return Conta("", 0)
}