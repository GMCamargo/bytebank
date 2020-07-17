package br.com.alura.bytebank.`sintaxe-inicial`

import br.com.alura.bytebank.models.*
import br.com.alura.bytebank.models.conta.ContaBase
import br.com.alura.bytebank.models.conta.ContaCorrente
import br.com.alura.bytebank.models.conta.ContaPoupanca
import br.com.alura.bytebank.models.conta.ContaSalario
import br.com.alura.bytebank.models.funcionario.Auxiliar
import br.com.alura.bytebank.models.funcionario.CalculadoraBonificacao
import br.com.alura.bytebank.models.funcionario.Gerente

fun testeFuncionario() {

    val a = Auxiliar("Toninho", "11111111111", 3000.0)
    println(a)

    val ger = Gerente("Hercules", "33333333333", 10000.0, "ROLE_ADMIN", "1234")
    println(ger)
    println(ger.autentica("1234"))

    val cliente = Cliente(nome = "Gabriel", cpf = "111.111.111-11", senha = "12345")
    println(cliente.autentica("12457"))

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(a)
    calculadoraBonificacao.registra(ger)

    println(calculadoraBonificacao.total)
}

/*--------------------------------------------Teste de conta--------------------------------------------------*/
val lista = listOf(
    ContaCorrente("Gabriel", 4561),
    ContaPoupanca("Paola", 4587),
    ContaSalario("Toninho", 4597)
)

fun testeConta() {

    val conta = ContaCorrente("GOD", 0)
    conta.depositar(Double.MAX_VALUE)


    for (c in lista) println(c)
    println()



    val o: ContaBase? = find(ContaSalario("Toninho", 4597))

    if (o != null) {
        println(o)
    }

    println(conta)
}

fun find(conta: ContaBase): ContaBase? {
    val i = lista.indexOf(conta)
    if (i != -1)
        return lista[i]
    return null
}