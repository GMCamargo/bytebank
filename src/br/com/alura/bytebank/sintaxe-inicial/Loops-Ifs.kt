package br.com.alura.bytebank.`sintaxe-inicial`

fun mudaSaldo(saldo: Double, novo: Double): Double {

    println("saldo mudou")
    return saldo + novo
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("saldo positivo")
        }
        saldo == 0.0 -> {
            println("saldo neutro")
        }
        else -> {
            println("conta negativa")
        }
    }
}

fun loops() {
    for (i in 1..3) {
        val nConta = 1000 + i

        println("hello world")
        println("Conta: $nConta")

    }
}